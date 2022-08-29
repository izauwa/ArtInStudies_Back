package bra.edu.ifsp.artinstudies.repository;

import java.util.ArrayList;

import bra.edu.ifsp.artinstudies.model.Livro;

public class LivroRepository {
    private static LivroRepository repo;
    private ArrayList<Livro> livros;

    private LivroRepository() {
        this.livros = new ArrayList<>();
    }

    public static void init() {
        if (LivroRepository.repo == null) {
            // Criar repositório
            LivroRepository.repo = new LivroRepository();

            // Adicionar livros
            LivroRepository.add(
                new Livro("nome", "autor", "genero", "sinopse", "editora", 2022, 334)
            );
            LivroRepository.add(
                new Livro("nome", "autor", "genero", "sinopse", "editora", 2022, 335)
            );
            LivroRepository.add(
                new Livro("nome", "autor", "genero", "sinopse", "editora", 2022, 336)
            );
            LivroRepository.add(
                new Livro("nome", "autor", "genero", "sinopse", "editora", 2022, 337)
            );
            LivroRepository.add(
                new Livro("nome", "autor", "genero", "sinopse", "editora", 2022, 338)
            );
        }

    }

    public static void add(Livro Livro) {
        LivroRepository.repo.livros.add(Livro);
    }

    public static ArrayList<Livro> all() {
        return LivroRepository.repo.livros;
    }

    // Recupera Livro pelo Id
    public static Livro getById(int id) {
        return LivroRepository.repo.livros.stream().filter((Livro) -> Livro.getId() == id).toList().get(0);
    }
}
