package com.springrest.api.controller;

import java.util.List;

import com.springrest.api.services.CourseService;
import com.springrest.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home()
    {
        return "Welcome to course application";
    }


    //get the courses
    @GetMapping("/courses")
    public List<Course> getCourses()
     {
      return this.courseService.getCourses();

     }

     @GetMapping("/courses/{courseId}")
     public Course getCourse(@PathVariable String courseId)
      {
          return this.courseService.getCourse(Long.parseLong(courseId));
      }

    @PostMapping(path="/courses",consumes = "application/json")
    public Course addCourse(@RequestBody Course course)
     {
         return this.courseService.addCourse(course);
     }
}
