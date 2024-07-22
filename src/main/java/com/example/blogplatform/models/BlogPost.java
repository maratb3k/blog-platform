package com.example.blogplatform.models;

import java.util.Date;
import java.util.List;

public class BlogPost {
    private int id;
    private String title;
    private String content;
    private User author;
    private List<Comment> comments;
    private Date createdDate;

    public boolean createPost() {
        return false;
    }

    public boolean editPost() {
        return false;
    }
    public boolean deletePost() {
        return false;
    }
}
