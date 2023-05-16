package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> allUsers() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
//        User user = UserDTO.toModel(userDTO);
        userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {

        userService.delete(id);
    }
}
