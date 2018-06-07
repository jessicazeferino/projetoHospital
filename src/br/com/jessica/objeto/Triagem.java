/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jessica.objeto;

import java.util.List;

/**
 *
 * @author SATC
 */
public class Triagem {
   private Enfermeira enfermeira;
   private Paciente paciente;
   private String pressao;
   private float temperatura,peso,altura,imc;
   private String sintoma;
   private  List<String> alergias;
   private boolean febre;

    public Triagem(Enfermeira enfermeira, Paciente paciente, String pressao, float temperatura, float peso, float altura, float imc, String sintoma, List<String> alergias, boolean febre) {
        this.enfermeira = enfermeira;
        this.paciente = paciente;
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
        this.imc = this.calculaImc(peso, altura);
        this.sintoma = sintoma;
        this.alergias = alergias;
        this.febre = febre;
    }


    public Enfermeira getEnfermeira() {
        return enfermeira;
    }

    public void setEnfermeira(Enfermeira enfermeira) {
        this.enfermeira = enfermeira;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getPressao() {
        return pressao;
    }

    public void setPressao(String pressao) {
        this.pressao = pressao;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public boolean isFebre() {
        return febre;
    }

    public void setFebre(boolean febre) {
        this.febre = febre;
    }

    private float calculaImc(float peso, float altura) {
       float imc ;
       imc =(peso)/(altura*altura);
       
       return imc ;
    }

    @Override
    public String toString() {
        return "Triagem{" + "enfermeira=" + enfermeira + 
                "/n, paciente=" + paciente + ", pressao=" + pressao +
                "/n, temperatura=" + temperatura + ", peso=" + peso + 
                "/n, altura=" + altura + ", imc=" + imc + ", sintoma=" + sintoma + 
                "/n, alergias=" + alergias + ", febre=" + febre + '}';
    }


 
   

  


   
   
}
