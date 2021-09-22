package br.com.letscode.java;

import java.util.Scanner;
import java.lang.Math;

class Pessoa {
    public String nome;
    public double alturaMetro;
    public double pesoQuilograma;
    public Pessoa() {

    }
    public Pessoa(String nome, double alturaMetro, double pesoQuilograma) {
        this.nome = nome;
        this.alturaMetro = alturaMetro;
        this.pesoQuilograma = pesoQuilograma;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAltura(double alturaMetro) {
        this.alturaMetro = alturaMetro;
    }

    public void setPeso(double pesoQuilograma) {
        this.pesoQuilograma = pesoQuilograma;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return alturaMetro;
    }

    public double getPeso() {
        return pesoQuilograma;
    }
}

public class QuestaoOito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoaa[] pessoas = new Pessoaa[5];
        double imc;
        for(int i = 0; i < 5; i++){
            pessoas[i] = new Pessoa();
            System.out.print("Coloque seu nome: ");
            pessoas[i].setNome(sc.nextLine());
            System.out.print("Coloque sua altura em metros: ");
            pessoas[i].setAltura(Double.parseDouble(sc.nextLine()));
            System.out.print("Coloque seu peso em kg: ");
            pessoas[i].setPeso(Double.parseDouble(sc.nextLine()));
        }
        for(int i = 0; i < 5; i++){
            imc = pessoas[i].getPeso() / (Math.pow(pessoas[i].getAltura(), 2));
            if(imc < 18.5 || imc > 25) {
                System.out.println("A pessoa " + pessoas[i].getNome() + " esta fora do peso ideal, com imc de " + imc + ".");
            }
        }
        sc.close();
    }
}
