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
public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private String cpf,rg,endereco,telefone,estadoCivil;
    private char sexo;

    public Pessoa(String nome, Date dataNascimento, String cpf, String rg) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + 
                "\n, dataNascimento=" + dataNascimento + "\n, cpf=" + cpf + "\n, rg=" + rg +
                "\n, endereco=" + endereco + ", telefone=" + telefone + 
                "\n, estadoCivil=" + estadoCivil + ", sexo=" + sexo + '}';
    }
    
    
    
           
    
}
