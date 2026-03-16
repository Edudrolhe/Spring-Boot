package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public String listar(Model model) {
        System.out.println("=== LISTANDO PESSOAS ===");
        System.out.println("Total no banco: " + pessoaRepository.count());
        model.addAttribute("pessoas", pessoaRepository.findAll());
        return "listar";
    }

    @GetMapping("/novo")
    public String novoForm(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "index";
    }
    
    @PostMapping
    public String salvar(@ModelAttribute Pessoa pessoa) {
        System.out.println("=== SALVANDO PESSOA ===");
        System.out.println("Dados recebidos:");
        System.out.println("  Usuário: " + pessoa.getUsuario());
        System.out.println("  Telefone: " + pessoa.getTelefone());
        System.out.println("  ID (antes de salvar): " + pessoa.getId());
        
        Pessoa pessoaSalva = pessoaRepository.save(pessoa);
        
        System.out.println("Pessoa salva com sucesso!");
        System.out.println("  ID gerado: " + pessoaSalva.getId());
        System.out.println("  Usuário: " + pessoaSalva.getUsuario());
        System.out.println("  Telefone: " + pessoaSalva.getTelefone());
        System.out.println("Total de registros no banco: " + pessoaRepository.count());
        System.out.println("========================\n");
        
        return "redirect:/pessoas";
    }

    @GetMapping("/editar/{id}")
    public String editarForm(@PathVariable Long id, Model model) {
        System.out.println("=== EDITANDO PESSOA ID: " + id + " ===");
        Pessoa pessoa = pessoaRepository.findById(id).orElse(null);

        if (pessoa != null) {
            System.out.println("Pessoa encontrada: " + pessoa.getUsuario() + " - " + pessoa.getTelefone());
            model.addAttribute("pessoa", pessoa);
            return "index";
        } 
        
        System.out.println("Pessoa com ID " + id + " não encontrada!");
        return "redirect:/pessoas";   
    }

    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        System.out.println("=== DELETANDO PESSOA ID: " + id + " ===");
        
        // Verificar se existe antes de deletar
        if (pessoaRepository.existsById(id)) {
            pessoaRepository.deleteById(id);
            System.out.println("Pessoa com ID " + id + " deletada com sucesso!");
        } else {
            System.out.println("Pessoa com ID " + id + " não encontrada!");
        }
        
        System.out.println("Total de registros no banco: " + pessoaRepository.count());
        System.out.println("========================\n");
        
        return "redirect:/pessoas";
    }
}