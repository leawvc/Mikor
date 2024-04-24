package com.shop.mikor.web;

import com.shop.mikor.service.post.PostsService;
import com.shop.mikor.web.dto.PostsResponseDto;
import com.shop.mikor.web.dto.PostsSaveRequestDto;
import com.shop.mikor.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }
    @PutMapping("/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }
    @GetMapping("/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
