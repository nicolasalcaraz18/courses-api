package com.mycourses.cursos.service;

import com.mycourses.cursos.models.Course;
import com.mycourses.cursos.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService{

    @Autowired
    private ICourseRepository iCourseRepository;


    @Override
    public List<Course> getCourses() {
        return iCourseRepository.findAll();
    }

    @Override
    public Course getCourse(Long id_course) {
        return this.iCourseRepository.findById(id_course).orElse(null);
    }

    @Override
    public void saveCourse(Course course) {
        this.iCourseRepository.save(course);
    }

    @Override
    public void editCourse(Course course) {
        this.saveCourse(course);
    }
}
