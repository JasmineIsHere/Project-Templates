package com.gooman.template.service;

import com.gooman.template.entity.User;
import com.gooman.template.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    //your code logic
    @Autowired
    private userRepository userRepository;
    public List getUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
