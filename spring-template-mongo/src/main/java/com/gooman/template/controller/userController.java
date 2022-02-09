package com.gooman.template.controller;

import com.gooman.template.entity.User;
import com.gooman.template.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/user")
public class userController {
    // api endpoints

    @Autowired
    private userService userService;

    @GetMapping
    public List getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping(path="/{userId}")
    public void deleteUser(@PathVariable int userId){
        userService.deleteUser(userId);
    }
}
