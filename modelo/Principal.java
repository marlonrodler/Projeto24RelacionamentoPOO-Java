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
        Livro l2 = new Livro();
        
        a1.setNome("Marlon");
        a1.setEmail("marlon.rodler@hotmail.com");
        a1.setSexo("M");
        
        a2.setNome("Sara");
        a2.setEmail("sara@hotmail.com");
        a2.setSexo("F");
        
        l2.setNome("Banco de Dados");
        l2.setPreco(250.0);
        l2.setQdtEstoque(5);
        l2.setAutores(a2);
        l2.setAutores(a1);
        
        System.out.println(  "*** Autor 1 *** \nNome: "+a1.getNome()+"\nEmail: "+a1.getEmail()+"\nSexo: "+a1.getSexo());
        
        
        System.out.println("\n*** Autor 2 *** \nNome: "+a1.getNome()+"\nEmail: "+a1.getEmail()+"\nSexo: "+a1.getSexo());
        
        System.out.println("\n*** Livro 2 *** \nNome: "+l2.getNome()+"\nPreço: "+l2.getPreco()+"\nQtd Estoque: "+l2.getQdtEstoque());
        
        System.out.println("\n\n*** Função printAutores ***");
        l2.printAutores();
        System.out.println("\n\n");
        
    }
    
}
