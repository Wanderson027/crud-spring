package com.example.crudspring.controller;

import java.util.List;

import com.example.crudspring.model.Course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    @GetMapping
    public List<Course> list(){
        return null;
    }

}
