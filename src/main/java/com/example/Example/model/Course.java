package com.example.Example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private Long id;

    private String courseCode;
    private String courseTitle;

}
