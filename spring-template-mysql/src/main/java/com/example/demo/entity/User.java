package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id //primary key in User table in DB
    private int id;

    //other fields (columns) in User table
    private String name;
    private String email;

    //constructors
    public User() {
    }
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    //getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
