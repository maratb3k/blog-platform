package com.example.blogplatform.models;

import java.util.Date;

public class Comment {
    private int id;
    private String content;
    private User author;
    private BlogPost blogPost;
    private Date createdDate;

    public boolean addComment() {
        return false;
    }

    public boolean editComment() {
        return false;
    }

    public boolean deleteComment() {
        return false;
    }
}
