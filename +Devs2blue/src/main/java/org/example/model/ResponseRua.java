package org.example.model;

public class ResponseRua {
    private String nome;
    private int tempoDeAbertura;

    public ResponseRua(String nome, int tempoDeAbertura) {
        this.nome = nome;
        this.tempoDeAbertura = tempoDeAbertura;
    }

    public ResponseRua(String nome) {
        this.nome = nome;
    }

    public ResponseRua(int tempoDeAbertura) {
        this.tempoDeAbertura = tempoDeAbertura;
    }

    public ResponseRua() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoDeAbertura() {
        return tempoDeAbertura;
    }

    public void setTempoDeAbertura(int tempoDeAbertura) {
        this.tempoDeAbertura = tempoDeAbertura;
    }
}
