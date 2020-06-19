/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Elias
 */
public class TesteEstudante {
    public static void main(String[] args) {
        Estudante primeiro = new Estudante();
        
        primeiro.setNome("Elias");
        primeiro.setRa(1);
        System.out.println("\n\t\t\t -- Apresentar primeiro estudante --");
        primeiro.apresentarEstudante();
        
        Estudante segundo =  new Estudante("Andreia", 2);
        System.out.println("\n\t\t\t -- Apresentar segundo estudante --");
        segundo.apresentarEstudante();
        
        
        EstudanteInfo terceiro = new EstudanteInfo();
        System.out.println("\n\t\t\t -- Estudante de Info --");
        terceiro.setNome("Carlos");
        terceiro.setRa(3);
        terceiro.setInfoBasico(10);
        terceiro.setLogica('B');
        terceiro.apresentarEstudante();
    }
}
