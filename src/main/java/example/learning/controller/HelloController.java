package example.learning.controller;


import example.learning.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Rahul, Spring Boot ! ";
    }
    @GetMapping("/animal")
    public List<String> getANimalName(){
        return Arrays.asList("Human", "Dog", "cat", "Cow", null);
    }

    @GetMapping("/map")
    public Map<String, Integer>getMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("A",15);
        map.put("B",12);
        map.put("C",34);
        map.put("Rahul", 27);
        return map;
    }
    @GetMapping("/user")
    public User getUsers(){
        return new User(1,"Rahul", "demo@gmail.com");
    }
    @GetMapping("/users")
    public List<User> getUser(){
        return List.of(
                new User(1, "Amit", "amit@example.com"),
                new User(2, "Sneha", "sneha@example.com"),
                new User (3, "Rahul", "rahul@example.com"),
                new User (4, "Rahul2", "rahul2@example.com"),
                new User (5, null, null)
        );
    }
    @GetMapping("/list")
    public List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(30);
        list.add(40);
        list.add(60);

        return list;
    }
    @GetMapping("/data")
    public Map<String, Object> getData() {
        Map<String, Object> map = new HashMap<>();
        map.put("message", "Welcome to Spring Boot");
        map.put("status", 200);
        return map;
    }

    @PostMapping("/post")
    public String postData(){
        return "hello rahul this is from post request";
    }

}
