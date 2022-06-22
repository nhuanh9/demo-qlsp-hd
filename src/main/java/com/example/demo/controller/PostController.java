package com.example.demo.controller;

import com.example.demo.model.Post;
import com.example.demo.serivce.post.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("/posts")
public class PostController {

    @Autowired
    IPostService postService;

    @GetMapping("")
    public ResponseEntity<Iterable<Post>> findAll() {
        Iterable<Post> posts = postService.findByTitleAndCreatedTime("1", "2022-06-25 10:22:54", "2022-06-25 10:22:54");
        return new ResponseEntity<>(posts, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @PostMapping("")
    public ResponseEntity<Post> save(@RequestBody Post post) {
        postService.save(post);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }

}
