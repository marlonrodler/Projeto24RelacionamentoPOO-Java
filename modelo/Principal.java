/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author marlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autor a1 = new Autor();
        Autor a2 = new Autor();
        Livro l1 = new Livro();
        Livro l2 = new Livro();
        
        a1.setNome("Marlon");
        a1.setEmail("marlon.rodler@hotmail.com");
        a1.setSexo("M");
        
        a2.setNome("Sara");
        a2.setEmail("sara@hotmail.com");
        a2.setSexo("F");
        
        l1.setNome("Estrutura de Dados");
        l1.setPreco(350.0);
        l1.setQdtEstoque(10);
        l1.setAutores(a1);
        
        l2.setNome("Banco de Dados");
        l1.setPreco(250.0);
        l1.setQdtEstoque(5);
        l1.setAutores(a2);
        
        System.out.println(  "*** Autor 1 *** \nNome: "+a1.getNome()+"\nEmail: "+a1.getEmail()+"\nSexo: "+a1.getSexo());
        System.out.println("\n*** Livro 1 *** \nNome: "+l1.getNome()+"\nPreço: "+l1.getPreco()+"\nQtd Estoque: "+l1.getQdtEstoque());
        
        
        System.out.println("\n*** Autor 2 *** \nNome: "+a1.getNome()+"\nEmail: "+a1.getEmail()+"\nSexo: "+a1.getSexo());
        System.out.println("\n*** Livro 2 *** \nNome: "+l1.getNome()+"\nPreço: "+l1.getPreco()+"\nQtd Estoque: "+l1.getQdtEstoque());
        
        System.out.println("\n\n*** Função printAutores ***");
        l1.printAutores();
        System.out.println("\n\n");
        
    }
    
}
