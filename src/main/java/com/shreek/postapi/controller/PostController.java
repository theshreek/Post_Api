package com.shreek.postapi.controller;

import com.shreek.postapi.model.Post;
import com.shreek.postapi.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostRepo postRepo;
    @PostMapping
    public ResponseEntity<Post> addPost(@RequestBody Post post){
        int a = postRepo.insertPost(post.getTitle(), post.getBody(), post.getContent());
        System.out.println(a);
        return new ResponseEntity<>(post, HttpStatus.CREATED);

    }
    @GetMapping
    public List<Post> getAllPost(){
        return postRepo.getAllPost();
    }
//
//    @GetMapping("/{id}")
//    public Optional<Post> getUserById(@PathVariable("id") int id){
//        return Optional.ofNullable(postRepo.getPostById(id).orElseThrow(() ->
//                new Error("Post Not found By Id" + id)));
//    }
//
//    @PutMapping
//    public ResponseEntity<Post> updatePost(@RequestBody Post post, @PathVariable("id") int id){
//        Post oldpost = postRepo.findById(id).orElseThrow(()->
//                new Error("Post Not Found By Id"+id));
//        oldpost.setTitle(post.getTitle());
//        oldpost.setBody(post.getBody());
//        oldpost.setContent(post.getContent());
//        Post update = postRepo.save(oldpost);
//
//        return new ResponseEntity<>(update, HttpStatus.ACCEPTED);
//    }
//
//    @DeleteMapping
//    public String deletePost(@PathVariable("id") int id){
//        Optional<Post> post= postRepo.findPostById(id);
//        if(post.isPresent()) postRepo.deletePostById(id);
//        else throw new Error("Post not found By id"+id);
//
//        return "Post delete Successfully";

//    }
}
