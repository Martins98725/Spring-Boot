package com.example.Spring.controller;

import com.example.Spring.OutroProjeto.Funcao;
import com.example.Spring.repositorys.FuncaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/funcoes")
public class funcaoControllers {
    @Autowired
    private FuncaoRepository repository;
    @GetMapping
    public List<Funcao> findAll(){
        return repository.findAll().stream().toList();
    }
}
