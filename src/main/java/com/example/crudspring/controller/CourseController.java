package com.example.crudspring.controller;

import java.util.List;

import com.example.crudspring.model.Course;

import com.example.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor // cria a injeção do repositorio via construtor automaticamente nao precisando injetar via autoWired
public class CourseController {

    private final CourseRepository courseRepository;

    @GetMapping
    public @ResponseBody List<Course> list(){
        return courseRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Course create(@RequestBody Course course) {
        return courseRepository.save(course);
    }

//    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
//    public ResponseEntity<Void> delete(@PathVariable Integer id){
//    }
}
