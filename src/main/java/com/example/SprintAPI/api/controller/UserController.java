package com.example.SprintAPI.api.controller;

import com.example.SprintAPI.api.model.User;
import com.example.SprintAPI.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class UserController {

    private UserService userService;

    public  UserController(UserService userService){
        this.userService =  userService;
    }

    @GetMapping("/user")
    public Optional<User> getUser(@RequestParam Integer id){
        return userService.getUser(id);
    }

    @GetMapping("/users")
    public User[] getUsers(){
        return userService.getUsers();
    }
    @PostMapping("/users")
    public User[] addUser(@RequestParam String name, @RequestParam int age, @RequestParam String email) {
        userService.addUser(name, age, email);
        return userService.getUsers();
    }
}
