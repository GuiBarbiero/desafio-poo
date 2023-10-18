package br.desafio.dominio;

public abstract class Conteudo {

    protected static double experiencia_comum = 10;

    private String Titulo;
    private String Descricao;

    public abstract double calculoDeExperiencia();

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}
