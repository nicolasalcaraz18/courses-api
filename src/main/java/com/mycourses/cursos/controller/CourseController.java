package com.mycourses.cursos.controller;

import com.mycourses.cursos.models.Course;
import com.mycourses.cursos.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private ICourseService iCourseService;

    @GetMapping("/courses/traer")
    public List<Course> getCourses(){
        return this.iCourseService.getCourses();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable Long id){
        return this.iCourseService.findCourse(id);
    }

    @PostMapping("/courses/crear")
    public String createCourse(@RequestBody Course course){
        this.iCourseService.saveCourse(course);
        return "Curso creado correctamente";
    }

    public Course editCourse(@RequestBody Course course){
        iCourseService.editCourse(course);
        return this.getCourseById(course.getId_curso());
    }





}
