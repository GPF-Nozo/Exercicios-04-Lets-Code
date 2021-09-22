package br.com.letscode.java;

import java.util.Scanner;
import java.lang.Math;

class Pessoaa {
    public String nome;
    public double alturaMetro;
    public double pesoQuilograma;
    public Pessoaa(String nome, double alturaMetro, double pesoQuilograma) {
        this.nome = nome;
        this.alturaMetro = alturaMetro;
        this.pesoQuilograma = pesoQuilograma;
    }
}


public class Questao8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoaa[] pessoas = new Pessoaa[];
        double imc;
        for(int i = 0; i < 5; i++){
            System.out.print("Coloque seu nome: ");
            pessoas[i].nome = sc.nextLine();
            System.out.print("Coloque sua altura em metros: ");
            pessoas[i].alturaMetro = Double.parseDouble(sc.nextLine());
            System.out.print("Coloque seu peso em kg: ");
            pessoas[i].pesoQuilograma = Double.parseDouble(sc.nextLine());
        }
        for(int i = 0; i < 5; i++){
            imc = pessoas[i].pesoQuilograma / (Math.pow(pessoas[i].alturaMetro, 2));
            System.out.println(imc);
            if(imc < 18.5 || imc > 25) {
                System.out.println("A pessoa " + pessoas[i].nome + " esta fora do peso ideal.");
            }
        }
        sc.close();
    }
}
