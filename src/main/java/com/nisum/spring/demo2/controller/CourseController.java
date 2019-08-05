package com.nisum.spring.demo2.controller;

import com.nisum.spring.demo2.model.Course;
import com.nisum.spring.demo2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @PostMapping
    public void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }

    @PutMapping(value = "/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        courseService.updateCourseById(course,id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourseById(id);
    }
}
