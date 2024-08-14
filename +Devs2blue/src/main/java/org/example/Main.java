package org.example;

import org.example.model.Rua;
import org.example.service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var service= new Service();

        int quantidadeRuas = 0;
        System.out.println("Digite a quantidade de ruas");
        quantidadeRuas = scanner.nextInt();
        var ruas = new ArrayList<Rua>();

        for(int i=0;i<quantidadeRuas;i++)
            ruas.add(service.gerarRua(scanner));

        var response = service.main(quantidadeRuas, ruas);

        for(var rua:response)
            System.out.println(rua.getNome() + rua.getTempoDeAbertura());
    }
}