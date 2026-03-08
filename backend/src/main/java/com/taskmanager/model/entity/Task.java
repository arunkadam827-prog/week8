package com.taskmanager.model.entity;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

}
