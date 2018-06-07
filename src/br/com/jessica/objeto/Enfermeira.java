/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jessica.objeto;

/**
 *
 * @author SATC
 */
public class Enfermeira {
    private int cofen;
    private String setor;

    public int getCofen() {
        return cofen;
    }

    public void setCofen(int cofen) {
        this.cofen = cofen;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Enfermeira(int cofen, String setor) {
        this.cofen = cofen;
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Enfermeira{" + "cofen=" + cofen + ", setor=" + setor + '}';
    }
    
    
}
