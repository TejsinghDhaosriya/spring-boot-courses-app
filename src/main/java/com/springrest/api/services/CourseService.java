package com.springrest.api.services;

import java.util.List;

import com.springrest.entities.Course;

public interface CourseService {
    
    public List<Course> getCourses();
    public Course getCourse(long courseId);
}
