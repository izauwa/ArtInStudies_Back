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
                new Livro("Vermelho, Branco e Sangue Azul", "Casey McQuiston", "Romance LGBTQIPA+", "O que pode acontecer quando o filho da presidenta dos Estados Unidos se apaixona pelo príncipe da Inglaterra?", "Seguinte", 2019, 392)
            );
            LivroRepository.add(
                new Livro("Eu, cupido", "Julia Braga", "Romance", "Liliana Rodrigues parece imune às armadilhas do amor romântico", "Nacional", 2021, 296)
            );
            LivroRepository.add(
                new Livro("No Mundo Da Luna", "Carina Rissi", "Romance", "A vida de Luna está uma bagunça! O namorado a traiu com a vizinha, seu carro passa mais tempo na oficina do que com ela e o chefe vive trocando seu nome.", "editora", 2018, 504)
            );
            LivroRepository.add(
                new Livro("O Príncipe Cruel", "Holly Black", "Fantasia", "Jude tinha 7 anos quando seus pais foram assassinados e foi forçada a viver no Reino das Fadas. Dez anos depois, tudo o que ela quer é ser como eles – lindos e imortais – e realmente pertencer ao Reino das Fadas, apesar de sua mortalidade. Mas muitos do povo das Fadas desprezam os humanos.", "editora", 2018, 322)
            );
            LivroRepository.add(
                new Livro("O Diário de Anne Frank", "Anne Frank", "Biografia", "O depoimento da pequena Anne Frank, morta pelos nazistas após passar anos escondida no sótão de uma casa em Amsterdã, ainda hoje emociona leitores no mundo inteiro. Seus diário narra os sentimentos, medos e pequenas alegrias de uma menina judia que, com sua família, lutou em vão para sobreviver ao Holocausto.", "Record", 2008, 350)
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
