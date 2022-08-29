package bra.edu.ifsp.artinstudies.model;

public class Livro {
    private static int idCounter = 0;

    private String nome, autor, genero, sinopse, editora;
    private int id, ano, paginas;

    public Livro() {
        this.id = ++Livro.idCounter;
    }

    public Livro(String nome, String autor, String genero, String sinopse, String editora, int ano, int paginas) {
        this.id = ++Livro.idCounter;
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getId() {
        return id;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
