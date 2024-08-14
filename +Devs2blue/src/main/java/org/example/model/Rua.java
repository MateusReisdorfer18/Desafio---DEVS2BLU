package org.example.model;

public class Rua {
    private String nome;
    private int quantidadeCarros;

    public Rua(String nome, int quantidadeCarros) {
        this.nome = nome;
        this.quantidadeCarros = quantidadeCarros;
    }

    public Rua(String nome) {
        this.nome = nome;
    }

    public Rua(int quantidadeCarros) {
        this.quantidadeCarros = quantidadeCarros;
    }

    public Rua() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeCarros() {
        return quantidadeCarros;
    }

    public void setQuantidadeCarros(int quantidadeCarros) {
        this.quantidadeCarros = quantidadeCarros;
    }
}
