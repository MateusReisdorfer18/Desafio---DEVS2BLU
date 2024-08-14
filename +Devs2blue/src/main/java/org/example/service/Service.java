package org.example.service;

import org.example.model.ResponseRua;
import org.example.model.Rua;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    public Service() {
    }

    private int somarCarros(List<Rua> ruas) {
        int total = 0;

        for(Rua rua:ruas) {
            total += rua.getQuantidadeCarros();
        }

        return total;
    }

    public int calcularTempoDeAbertura(int ruaCarros, int totalCarros) {
        int tempo = 300;

        return (tempo * ruaCarros) / totalCarros;
    }

    private boolean verificarTempoDeAbertura(int tempoDeAbertura) {
        if(tempoDeAbertura < 30 || tempoDeAbertura > 120)
            return false;

        return true;
    }

    public List<ResponseRua> main(int quantidadeRuas, List<Rua> ruas) {
        int totalCarros = this.somarCarros(ruas);
        List<ResponseRua> ruasTempos = new ArrayList<>();

        for(int i=0;i<quantidadeRuas;i++) {
            var response = new ResponseRua(ruas.get(i).getNome(), this.calcularTempoDeAbertura(ruas.get(i).getQuantidadeCarros(), totalCarros));
            if(this.verificarTempoDeAbertura(response.getTempoDeAbertura())) {
                ruasTempos.add(response);
                continue;
            }

            response.setTempoDeAbertura(this.calcularDiferencaDeTempo(response.getTempoDeAbertura()));
            ruasTempos.add(response);
        }



        return ruasTempos;
    }

    private int calcularDiferencaDeTempo(int tempoDeAbertura) {
        var tempoMax = 120;
        var tempoMin = 30;

        if(tempoDeAbertura > tempoMax)
            return tempoDeAbertura -= tempoDeAbertura - tempoMax;

        if(tempoDeAbertura < tempoMin)
            return tempoDeAbertura += tempoMin + tempoDeAbertura;

        return 0;
    }

    public Rua gerarRua(Scanner scanner) {

        String nome;
        int quantidadeCarros;

        System.out.println("Digite o nome da rua (Exemplo : 'Rua a')");
        nome = scanner.next();
        System.out.printf("Digite a quantidade de carros na %s (Exemplo : 140)", nome);
        quantidadeCarros = scanner.nextInt();

        return new Rua(nome, quantidadeCarros);
    }
}
