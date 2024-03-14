package com.rahul.springboot.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){

       return Arrays.asList(
               new Course(1,"React","100xdevs"),
               new Course(2,"TypeScript","100xdevs"),
               new Course(3,"DevOps","Umy"),
               new Course(4,"UX","Designer"),
               new Course(3,"dfdd","Hkirat")
       ) ;

    }
}
