package com.example.springsocial.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity(name="roles")
public class Role implements Serializable {

    private static final long serialVersionUID = 625059593638567708L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String roleId;


    @Column(length = 60)
    private String name;
    private String roleDescription;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }
}
