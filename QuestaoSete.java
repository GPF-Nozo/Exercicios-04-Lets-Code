package br.com.letscode.java;

import java.util.Scanner;

class Pessoa {
    private String nome;
    private int idade;
    public Pessoa() {

    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }
}

public class QuestaoSete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maior = 0, menor = 0, soma = 0;
        String novo = "", velho = "";
        Pessoa[] pessoas = new Pessoa[5];
        for (int i = 0; i < 5; i++) {
            pessoas[i] = new Pessoa();
            System.out.print("Coloque o nome da pessoa: ");
            pessoas[i].setNome(sc.nextLine());
            System.out.print("Coloque a idade: ");
            pessoas[i].setIdade(Integer.parseInt(sc.nextLine()));
            soma = soma + pessoas[i].getIdade();
            if (i == 0){
                maior = pessoas[i].getIdade();
                menor = pessoas[i].getIdade();
                novo = pessoas[i].getNome();
                velho = pessoas[i].getNome();
            }
            else {
                if (maior < pessoas[i].getIdade()) {
                    maior = pessoas[i].getIdade();
                    velho = pessoas[i].getNome();
                }
                if (menor > pessoas[i].getIdade()) {
                    menor = pessoas[i].getIdade();
                    novo = pessoas[i].getNome();
                }
            }
        }
        System.out.print("O mais novo e " + novo + ", o mais velho e " + velho + ", e a media das idades e " + soma/5);
        sc.close();
    }
}
