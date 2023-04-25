package com.yoesoff.pondasi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = true)
    private String password;

    @Column(nullable = true)
    private String role;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String slug;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = true)
    private String facebook;

    @Column(nullable = true)
    private String twitter;

    @Column(nullable = true)
    private String instagram;

    @Column(nullable = true)
    private String tiktok;

    @Column(nullable = true)
    private String description;

    @Enumerated(EnumType.STRING)
    private Provider provider;

}
