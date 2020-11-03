/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplofilapessoas;

/**
 *
 * @author marce
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fila fila = new Fila(5);
        Pessoa pessoa;
        pessoa = new Pessoa();
        pessoa.setCodigo(10);
        pessoa.setNome("Marcelo");
        fila.adiciona(pessoa);
  

        System.out.println(fila.toString());
        
        pessoa = new Pessoa();
        pessoa.setCodigo(20);
        pessoa.setNome("Jonas");
        fila.adiciona(pessoa);
        System.out.println(fila.toString());
        
        pessoa = new Pessoa();
        pessoa.setCodigo(30);
        pessoa.setNome("Lucas");
        fila.adiciona(pessoa);
        System.out.println(fila.toString());
        
        pessoa = new Pessoa();
        pessoa.setCodigo(40);
        pessoa.setNome("Ségio");
        fila.adiciona(pessoa);
        System.out.println(fila.toString());
                

 

        
        pessoa = new Pessoa();
        pessoa.setCodigo(50);
        pessoa.setNome("Leonardo");
        fila.adiciona(pessoa);
        
        System.out.println(fila.toString());
        
        pessoa = new Pessoa();
        pessoa.setCodigo(60);
        pessoa.setNome("Mateus");
        fila.adiciona(pessoa);
        
        System.out.println(fila.toString());
        
    }
    
}
