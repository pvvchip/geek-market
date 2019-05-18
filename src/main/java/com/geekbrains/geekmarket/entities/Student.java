package com.geekbrains.geekmarket.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column
    private String name;

    @Column
    private String point;
}
