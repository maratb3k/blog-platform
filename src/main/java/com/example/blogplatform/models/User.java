package com.example.blogplatform.models;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private List<User> followers;
    private List<User> following;

    public boolean register() {
        return false;
    }

    public boolean login() {
        return false;
    }

    public boolean followUser() {
        return false;
    }

    public boolean unfollowUser() {
        return false;
    }
}
