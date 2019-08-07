package com.nisum.spring.demo2;

import com.nisum.spring.demo2.model.Course;
import com.nisum.spring.demo2.repository.CourseRepository;
import com.nisum.spring.demo2.service.CourseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

	@Mock
	private CourseRepository courseRepository;

	@InjectMocks
	private CourseService courseService;

	@Test
	public void getAllCoursesTest(){
		when(courseRepository.findAll()).thenReturn(Arrays.asList(
				new Course("java","java name","java description"),
				new Course("c","c name","c description")
				));
		Assert.assertEquals(2,courseService.getAllCourses().size());
	}

}
