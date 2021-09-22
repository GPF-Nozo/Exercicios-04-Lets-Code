package br.com.letscode.java;

import java.util.Scanner;

class Pessoa {
    public String nome;
    public int idade;
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class QuestaoSete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maior = 0, menor = 0, soma = 0;
        String novo = "", velho = "";
        Pessoa[] pessoas = new Pessoa[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Coloque o nome da pessoa: ");
            pessoas[i].nome = sc.nextLine();
            System.out.print("Coloque a idade: ");
            pessoas[i].idade = Integer.parseInt(sc.nextLine());
            soma = soma + pessoas[i].idade;
            if (i == 0){
                maior = pessoas[i].idade;
                menor = pessoas[i].idade;
                novo = pessoas[i].nome;
                velho = pessoas[i].nome;
            }
            else {
                if (maior < pessoas[i].idade) {
                    maior = pessoas[i].idade;
                    velho = pessoas[i].nome;
                }
                if (menor > pessoas[i].idade) {
                    menor = pessoas[i].idade;
                    novo = pessoas[i].nome;
                }
            }
        }
        System.out.print("O mais novo e " + novo + ", o mais velho e " + velho + ", e a media das idades e " + soma/5);
        sc.close();
    }
}
