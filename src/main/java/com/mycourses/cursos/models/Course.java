package com.mycourses.cursos.models;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Course {
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;

    //falta la lista y la relación.
    public Course (){

    }

    public Course(Long id_curso, String nombre, String modalidad, String fecha_finalizacion) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
    }
}
