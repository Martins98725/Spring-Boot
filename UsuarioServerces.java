package com.example.Spring.Services;

import com.example.Spring.OutroProjeto.Usuario;
import com.example.Spring.repositorys.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServerces {
    @Autowired
    private UsuarioRepository repository;
    public List<Usuario> findeAll(){
        return repository.findAll();
    }

    public Usuario creat(Usuario usuario){
        Usuario entity = new Usuario();
        entity.setNome(usuario.getNome());
        entity.setEmail(usuario.getEmail());
        entity.setSenha(usuario.getSenha());


        repository.save(entity);

        return entity;
    }
    public void delete(Long id){
        repository.deleteById(id);
    }
    public Usuario findbyId(Long id){
        repository.findById(id);
        return repository.findById(id).get();
    }
    public Usuario upadate(Usuario usuario, Long id){
        Usuario entity = repository.getReferenceById(id);
        entity.setNome(usuario.getNome());
        entity.setEmail(usuario.getEmail());
        entity.setSenha(usuario.getSenha());

        return entity;
    }
}
