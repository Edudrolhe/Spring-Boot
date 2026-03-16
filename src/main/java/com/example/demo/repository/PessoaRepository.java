package com.example.demo.repository;

import com.example.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    // O JpaRepository já fornece todos os métodos:
    // findAll(), findById(), save(), deleteById(), count(), existsById(), etc.
}