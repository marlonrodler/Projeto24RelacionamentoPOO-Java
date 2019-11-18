/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author marlo
 */
public class Livro {
    private String nome;
    private double preco;
    private int qdtEstoque;
    private ArrayList<Autor> autores;

    public Livro() {
        this.autores = new ArrayList<>();
    }

    public Livro(String nome, double preco, int qdtEstoque, ArrayList<Autor> autores) {
        this.autores = new ArrayList<>();
        this.nome = nome;
        this.preco = preco;
        this.qdtEstoque = qdtEstoque;
        this.autores = autores;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQdtEstoque() {
        return qdtEstoque;
    }

    public void setQdtEstoque(int qdtEstoque) {
        this.qdtEstoque = qdtEstoque;
    }

    public void getAutores() {
        for (int j = 0; j < autores.size(); j++) {
            System.out.println(this.autores.get(j).getNome());
        }
    }

    public void setAutores(Autor escreve) {
        this.autores.add(escreve);
    }
    
    public String toString(){
        return this.nome;
    }
    
    public void printAutores(){
        System.out.println("Autores inseridos: ");
        for (int j = 0; j < autores.size(); j++) {
            System.out.println("                   "+this.autores.get(j).getNome());
        }
    }
    
}
