package com.example.demo.repo;

import com.example.demo.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    Post findBytitle(String title);

}
