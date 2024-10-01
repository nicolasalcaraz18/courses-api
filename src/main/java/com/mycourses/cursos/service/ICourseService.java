package com.mycourses.cursos.service;

import com.mycourses.cursos.models.Course;

import java.util.List;

public interface ICourseService {

    List<Course> getCourses();

    Course getCourse(Long id_course); //obtener todos los temas de un determinado curso.

    void saveCourse(Course course);

    void editCourse(Course course);


}
