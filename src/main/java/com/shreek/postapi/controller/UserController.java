package com.shreek.postapi.controller;

import com.shreek.postapi.model.User;
import com.shreek.postapi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepo userRepo;
    @PostMapping
    public ResponseEntity<User> addUser(@RequestBody User user){
        User newuser = new User();
        newuser.setEmail(user.getEmail());
        newuser.setPassword(user.getPassword());
        User add = userRepo.save(newuser);

        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
//    @GetMapping
//    public List<User> getAllUser(){
//        return userRepo.getAllUser();
//    }
//
//   @GetMapping("/{id}")
//   public Optional<User> getUserById(@PathVariable("id") int id){
//        return Optional.ofNullable(userRepo.getUserById(id).orElseThrow(() ->
//                new Error("User Not found By Id" + id)));
//   }
//
//
//    @PutMapping
//    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("id") int id){
//        User olduser = userRepo.findById(id).orElseThrow(()->
//                new Error("User Not Found By Id"+id));
//        olduser.setEmail(user.getEmail());
//        olduser.setPassword(user.getPassword());
//        User update = userRepo.save(olduser);
//
//        return new ResponseEntity<>(update, HttpStatus.ACCEPTED);
//    }
//
//    @DeleteMapping
//    public String deleteUser(@PathVariable("id") int id){
//        Optional<User> user= userRepo.findUserById(id);
//        if(user.isPresent()) userRepo.deleteUserById(id);
//        else throw new Error("User not found By id"+id);
//
//        return "User delete Successfully";

}
