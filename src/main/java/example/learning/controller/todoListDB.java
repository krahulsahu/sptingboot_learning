package example.learning.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todo")
public class todoListDB {

    @Autowired
    private To
    public List<Todo> getAll() {
        return service.getAllTodos();
    }

}
