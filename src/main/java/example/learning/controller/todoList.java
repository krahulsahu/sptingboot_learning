package example.learning.controller;


import example.learning.model.ListItem;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/todo")
public class todoList {
    List<ListItem> list = new ArrayList<>();
    @GetMapping("/")
    public List<ListItem> myToDOList(){
        return list;
    }

    @PostMapping("/")
    public String addToDOList(@RequestBody ListItem arr){
        list.add(arr);
        return "Data ID : "+arr.getId()+" is Added.";
    }

    @PutMapping("/{id}")
    public String updateToDoList(@PathVariable int id, @RequestBody ListItem arr){
        for(ListItem u : list){
            if(u.getId() == id){
                u.setTitle(arr.getTitle());
                u.setCompleted(arr.isCompleted());
                u.setPriority(arr.getPriority());

                return "Changes made in TODO List.";
            }
        }
        return "Given id"+id+ "bot Founded!";
    }

    @DeleteMapping("/{id}")
    public String deleteToDoList(@PathVariable int id){
        for(ListItem x : new ArrayList<>(list)){
            if(x.getId() == id){
                list.remove(x);
                return "TODO List with id "+ id+" removed.";
            }
        }
        return "TODO List of id "+ id+" is not Founded";
    }



}
