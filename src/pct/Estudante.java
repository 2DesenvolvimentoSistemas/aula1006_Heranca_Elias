/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Carlos
 */
public class Estudante {
    private String nome;
    private int ra;
    
    public void apresentarEstudante(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("RA: " + this.getRa());
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }

    public Estudante(String nome, int ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public Estudante() {
    }
}
