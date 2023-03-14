package com.example.springexample.Controller;

import com.example.springexample.Service.userService;
import com.example.springexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    userService service;

@GetMapping("/getUser")
    public List<User>getUser(){
        return service.getAllUser();
    }
@PostMapping("/createUser")
    public User createUsers(@RequestBody User user){
    return service.createUser(user);
    }
}
