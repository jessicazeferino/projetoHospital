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
public class Medico {
    private int crm;
    private String especialidade;
    private String setor;

    public Medico(int crm, String especialidade, String setor) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.setor = setor;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
}
