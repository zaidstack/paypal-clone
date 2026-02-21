package com.paypal.user_service.controller;

import com.paypal.user_service.entity.User;
import com.paypal.user_service.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {


    private UserService userService;
    public UserController(UserService userService)
    {
       this.userService=userService;
    }


    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        System.out.println("API HIT");
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }


    @GetMapping("/{id}")
    public ResponseEntity<User> getUserBuId(@PathVariable Long id )
    {
        return userService.getUserById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

}
