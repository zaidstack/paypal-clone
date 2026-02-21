package com.paypal.user_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name="app-user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(unique = true)
    private String email;
    private String role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;



}
