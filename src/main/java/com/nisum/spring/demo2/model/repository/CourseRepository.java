package com.nisum.spring.demo2.repository;

import com.nisum.spring.demo2.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {

}
