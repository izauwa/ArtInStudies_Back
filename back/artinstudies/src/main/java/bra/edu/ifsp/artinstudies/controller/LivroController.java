package bra.edu.ifsp.artinstudies.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bra.edu.ifsp.artinstudies.model.Livro;
import bra.edu.ifsp.artinstudies.repository.LivroRepository;

@RestController
public class LivroController {
    @GetMapping("/livro")
    public List<Livro> listaLivros(){
        return LivroRepository.all();
    }
    
    @GetMapping("/livro/{id}")
    public Livro RecuperaLivroPeloId(@PathVariable("id") int id) {
        return LivroRepository.getById(id);
    }
}
