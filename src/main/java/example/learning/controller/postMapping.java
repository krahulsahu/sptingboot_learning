package example.learning.controller;

import example.learning.model.User;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api")
public class postMapping {
    List<User> userList = new ArrayList<>();


    @GetMapping("/userList")
    public List<User> getData(){
        return userList;
    }

    @PostMapping("/userList")
    public String createUser(@RequestBody User user){
        userList.add(user);
        return "User Created : " + user.getName();
    }

    @PutMapping("userList/{id}")
    public String updateUserName(@PathVariable int id, @RequestBody User updateUser){
        for(User user : userList){
            if(user.getId() == id){
                String oldName = user.getName();
                user.setName(updateUser.getName());
                return "User Name Updated : from " + oldName +" : "+ user.getName();
            }
        }
        return "User with id "+ id + " not found.";
    }

    @PutMapping("userList/{id}/name")
    public String updateEmail(@PathVariable int id, @RequestBody User updateEmail){
        for( User user : userList){
            if(user.getId() == id ){
                String oldEmail = user.getEmail();
                user.setEmail(updateEmail.getEmail());
                return "Email Updated : From "+ oldEmail+ " : " + user.getEmail();

            }
        }
        return "No ID with "+ id +" founded";
    }

    @DeleteMapping("userList/{id}")
    public String deleteUser(@PathVariable int id){
        for(User u : new ArrayList<>(userList)){
            if(u.getId() == id){
                userList.remove(u);
                return "User with ID " + id + " has been deleted.";
            }
        }
        return "User with ID " + id + " not found.";
    }


}
