package com.springProject.firstspring.post;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Post {
    @Id
    @SequenceGenerator(
            name = "post_sequence",
            sequenceName = "post_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "post_sequence"
    )
    private Long id;
    private String title;
    private String body;
    private LocalDate created_at;

    public Post() {

    }

    public Post(Long id, String title, String body, LocalDate created_at) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.created_at = created_at;
    }

    public Post(String title, String body, LocalDate created_at) {
        this.title = title;
        this.body = body;
        this.created_at = created_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
