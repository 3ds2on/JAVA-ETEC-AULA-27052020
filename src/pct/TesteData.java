/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author B1-08
 */
public class TesteData {
    public static void main(String[] args) {
        //Criação e instância de um objeto da classe data
        Data data = new Data();
        
        
        //contrucao
        data.setDia (4);
        data.setMes(6);
        data.setAno(2020);
        
        //saida de dados
        System.out.println("Data: "+ data.imprimirData());
        
        //saida de dados
        System.out.println("Dia: "+ data.getDia());
        
        
    }
}