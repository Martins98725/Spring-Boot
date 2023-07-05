package com.example.Spring.OutroProjeto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String autoridade;

    public Funcao() {
    }

    public Funcao(Long id, String autoridade) {
        this.id = id;
        this.autoridade = autoridade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutoridade() {
        return autoridade;
    }

    public void setAutoridade(String autoridade) {
        this.autoridade = autoridade;
    }
}
