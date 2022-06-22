package com.example.demo.serivce.post;

import com.example.demo.model.Post;
import com.example.demo.serivce.GeneralService;
import org.springframework.data.repository.query.Param;

public interface IPostService extends GeneralService<Post> {
    Iterable<Post> findByTitleAndCreatedTime(String textSearch, String timeStart, String timeEnd);
}
