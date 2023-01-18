package com.example.responsi_kuy;


public class Login {

    public String username;
    public String email;

    public Login() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Login(String username, String email) {
        this.username = username;
        this.email = email;
    }
}