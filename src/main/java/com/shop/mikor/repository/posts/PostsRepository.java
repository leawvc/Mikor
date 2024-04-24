package com.shop.mikor.repository.posts;

import com.shop.mikor.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
