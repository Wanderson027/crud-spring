package com.example.crudspring.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Course {

    private Long id;

    private String name;

    private String categoria;
    
}
