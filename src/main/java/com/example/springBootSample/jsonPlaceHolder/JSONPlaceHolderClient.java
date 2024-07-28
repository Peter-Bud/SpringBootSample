package com.example.springBootSample.jsonPlaceHolder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        value = "placeHolder",
        url = "https://jsonplaceholder.typicode.com/"
)

public interface JSONPlaceHolderClient {

    @GetMapping("posts")
    public List<Post> getPosts();

    @GetMapping("posts/{postId}")
    public Post getPost(@PathVariable("postId") Integer postId);
}
