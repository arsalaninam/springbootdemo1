package com.nisum.spring.demo2.service;

import com.nisum.spring.demo2.model.Course;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    private List<Course> courses = new ArrayList<>(Arrays.asList(
            new Course("java","Java Name","Java Description"),
            new Course("python","Python Name","Python Description")
            ));

    public List<Course> getAllCourses(){
        return courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void updateCourseById(Course course, String id){
        for (int i = 0; i < courses.size(); i++) {
            Course c = courses.get(i);
            if(c.getId().equalsIgnoreCase(id)){
                courses.add(i,course);
            }
        }
    }

    public void deleteCourseById(String id){
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getId().equalsIgnoreCase(id)){
                courses.remove(i);
            }
        }
    }

}
