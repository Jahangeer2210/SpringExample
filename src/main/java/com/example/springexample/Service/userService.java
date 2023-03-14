package com.example.springexample.Service;

import com.example.springexample.Repo.userRepo;
import com.example.springexample.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    userRepo repo;


    public List<User> getAllUser(){
        return repo.findAll();

    }
    public User createUser(User user){
        return  repo.save(user);
    }
}
