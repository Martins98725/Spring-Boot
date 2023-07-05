package com.example.Spring.OutroProjeto;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String senha;
    private String email;
    @ManyToMany
    @JoinTable(
            name = "usuario_funcao",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "funcao_id")
    )
    private Set<Funcao> funcoes = new HashSet<>();
    public Usuario(){}

    public Usuario(Long id, String nome, String senha, String email) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
