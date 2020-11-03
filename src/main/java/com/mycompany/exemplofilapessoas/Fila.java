package com.mycompany.exemplofilapessoas;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marce
 */
public class Fila {
   private Pessoa elementos[];
   private int primeiro;
   private int ultimo;
   private int capacidade;
   private int contar;
   
   Fila(int tamanho){
       elementos = new Pessoa[tamanho];
       for (int i = 0; i < tamanho; i++) {
           elementos[i]=new Pessoa();
       }
       capacidade = tamanho;
       primeiro = 0;
       ultimo = -1;
       contar = 0;
   }
   
   //método para remover da fila
   public void retira(){
       if(estaVazia()){
            System.out.println("Fila Vazia");
            //System.exit(1);
       }else{
            System.out.println("Removendo "+elementos[primeiro].getNome());
            elementos[primeiro]=new Pessoa();
            primeiro = (primeiro+1)%capacidade;
            contar--;
            
       }
   }
   //método para adicionar na fila
   public void adiciona(Pessoa item){
       if(estaCheia()){
           System.out.println("Fila cheia");
           try {
               File file = new File("log.txt");
               FileWriter fw = new FileWriter(file,true);
               Date data = new Date();
               SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_YYY_HH_mm_ss");
               fw.write(sdf.format(data)+"\n");
               fw.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
           System.exit(1);
       }
       ultimo = (ultimo+1)% capacidade;
       elementos[ultimo] = item;
       contar++;
   }
   
   //método para obter o primeiro elemento
   public Pessoa pegar(){
       if(estaVazia()){
           System.out.println("Fila Vazia");
           System.exit(1);
       }
       return elementos[primeiro];
   }
   
   
   //retorna a quantidade de elementos 
   //presentes na fila
   public int getContar(){
       return contar;
   }
   
   public Boolean estaVazia(){
       return (getContar() == 0);
   }
   
   public Boolean estaCheia(){
       return (getContar()==capacidade);
   }
   
   @Override
   public String toString(){
        String result="";
        result += " primeiro "+primeiro+" \n";
        result += " ultimo "+ultimo+" \n";
        result += " contar "+contar+" \n";
        for (int i = 0; i < capacidade; i++) {
            if(elementos[i].getCodigo()!=0){
                result += " Posição "+i+"\n ";
                result += " Código "+elementos[i].getCodigo()+"\n ";
                result += " Nome "+elementos[i].getNome()+"\n ";
        
            }
        }
        return result;
    
   }
}

