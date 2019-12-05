package com.example.testing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testing.model.Post;

@Repository
public interface PostRepository  extends JpaRepository<Post, Long> {

}
