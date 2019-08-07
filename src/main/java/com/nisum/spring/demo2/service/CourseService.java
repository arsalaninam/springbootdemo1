package com.nisum.spring.demo2.service;

import com.nisum.spring.demo2.model.Course;
import com.nisum.spring.demo2.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void deleteCourseById(String id){
        courseRepository.deleteById(id);
    }

}
