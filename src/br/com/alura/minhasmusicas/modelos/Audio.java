package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalRep;
    private int totalLikes;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassificacao() {
        return (int) classificacao;
    }

    public void like() {
        this.totalLikes++;
    }

    public void reproduz() {
        this.totalRep++;
    }
}
