package com.springrest.api.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.entities.Course;

import org.springframework.stereotype.Service;
@Service
public class CourseServiceImpl implements CourseService{
  List<Course> list;

    public CourseServiceImpl() {
        list =  new ArrayList<>();
    list.add(new Course(12, "Java Core Course","Contains basics of java"));
    list.add(new Course(123,"Spring Boot","Beginner level"));
}

  @Override
    public List<Course> getCourses()
{
 return list;

}

@Override
public Course getCourse(long courseId)
 {
     Course c = null;
     for(Course course:list)
       {
           if(course.getId()==courseId)
             {
                 c=course;
                 break;
             }
       }
     return c;
 }


}
