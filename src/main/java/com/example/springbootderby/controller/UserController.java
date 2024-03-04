package com.example.springbootderby.controller;

import com.example.springbootderby.dao.UserRepository;
import com.example.springbootderby.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @PostMapping("/saveUsers")
    public String saveUsers(@RequestBody List<User> users){
         userRepository.saveAll(users);
         return users.size() + "save users..";
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
      return (List<User>) userRepository.findAll();
    }

    @GetMapping("/findUserByName/{name}")
    public User findByNameUser(@PathVariable String name){
        return userRepository.findUserByName(name);

    }

}
