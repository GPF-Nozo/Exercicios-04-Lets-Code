package br.com.letscode.java;

public class Pessoa {
    private String nome;
    private int idade;
    public double alturaMetro;
    public double pesoQuilograma;
    public Pessoa() {

    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    
    public Pessoa(String nome, double alturaMetro, double pesoQuilograma) {
        this.nome = nome;
        this.alturaMetro = alturaMetro;
        this.pesoQuilograma = pesoQuilograma;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double alturaMetro) {
        this.alturaMetro = alturaMetro;
    }

    public void setPeso(double pesoQuilograma) {
        this.pesoQuilograma = pesoQuilograma;
    }


    public int getIdade() {
        return idade;
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
