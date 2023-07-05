package com.example.Spring.repositorys;

import com.example.Spring.OutroProjeto.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Long> {
}
