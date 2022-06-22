package com.example.demo.repository;

import com.example.demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    @Query(value = "select * from Post p where lower(p.title) like(concat('%', lower(:textSearch), '%')) and (p.create_At between :timeStart and :timeEnd);", nativeQuery = true)
    Iterable<Post> findByTitleAndCreatedTime(@Param("textSearch") String textSearch, @Param("timeStart") String timeStart, @Param("timeEnd") String timeEnd);
}
