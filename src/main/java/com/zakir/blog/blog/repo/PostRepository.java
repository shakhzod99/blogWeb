package com.zakir.blog.blog.repo;

import com.zakir.blog.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{
}
