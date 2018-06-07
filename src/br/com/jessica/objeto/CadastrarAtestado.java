/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jessica.objeto;

import java.util.Date;

/**
 *
 * @author SATC
 */
public class CadastrarAtestado {
    private Date dataInicioDoAtestado;
    private Date dataFimDoAtestado;
    private Consulta consulta;
    private int quantidadesDias;

    public CadastrarAtestado(Date dataInicioDoAtestado, Date dataFimDoAtestado, Consulta consulta, int quantidadesDias) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
        this.dataFimDoAtestado = dataFimDoAtestado;
        this.consulta = consulta;
        this.quantidadesDias = quantidadesDias;
    }


    public Date getDataInicioDoAtestado() {
        return dataInicioDoAtestado;
    }

    public void setDataInicioDoAtestado(Date dataInicioDoAtestado) {
        this.dataInicioDoAtestado = dataInicioDoAtestado;
    }

    public Date getDataFimDoAtestado() {
        return dataFimDoAtestado;
    }

    public void setDataFimDoAtestado(Date dataFimDoAtestado) {
        this.dataFimDoAtestado = dataFimDoAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadesDias() {
        return quantidadesDias;
    }

    public void setQuantidadesDias(int quantidadesDias) {
        this.quantidadesDias = quantidadesDias;
    }

    @Override
    public String toString() {
        return "CadastrarAtestado{" + "dataInicioDoAtestado=" + dataInicioDoAtestado + ", dataFimDoAtestado=" + dataFimDoAtestado + ", consulta=" + consulta + ", quantidadesDias=" + quantidadesDias + '}';
    }
    
    
    
    
}
