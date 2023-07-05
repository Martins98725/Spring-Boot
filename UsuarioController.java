package com.example.Spring.controller;

import com.example.Spring.OutroProjeto.Usuario;
import com.example.Spring.Services.UsuarioServerces;
import com.example.Spring.repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioServerces serverces;
    @GetMapping
    public List<Usuario> findAll(){
        return serverces.findeAll();
    }
    @PostMapping
    public Usuario creat(@RequestBody Usuario usuario){
        return serverces.creat(usuario);
    }
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        serverces.delete(id);
    }
    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id){
        return serverces.findbyId(id);
    }
    @PutMapping("/{id}")
    public Usuario upadate(@RequestBody Usuario usuario, @PathVariable Long id){
        return serverces.upadate(usuario, id);
    }
}