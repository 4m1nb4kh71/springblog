package com.springProject.firstspring.post;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class PostService {

    public List<Post> getPosts(){
        return List.of(
                new Post(
                        1L,
                        "post number 1",
                        "this is a body",
                        LocalDate.of(2022, Month.AUGUST,5)


                )
        );
    }
}
