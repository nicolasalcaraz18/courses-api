package com.mycourses.cursos.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Topic {
    private Long id_tema;
    private String nombre;
    private String description;

    //manyToOne...
    public Topic() {

    }

    public Topic(Long id_tema, String nombre, String description) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.description = description;
    }


}
