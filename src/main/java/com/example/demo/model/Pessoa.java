package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "PESSOA")
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "usuario", nullable = false, length = 100)
    private String usuario;
    
    @Column(name = "telefone", nullable = false, length = 20)
    private String telefone;
    
    // Construtor padrão (obrigatório para JPA)
    public Pessoa() {}
    
    // Construtor com parâmetros
    public Pessoa(Long id, String usuario, String telefone) {
        this.id = id;
        this.usuario = usuario;
        this.telefone = telefone;
    }
    
    // Getters e Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}