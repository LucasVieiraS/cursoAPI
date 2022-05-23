package br.com.lucas.cursoAPI.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {

    private Long id;
    private String nomecurso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

}
