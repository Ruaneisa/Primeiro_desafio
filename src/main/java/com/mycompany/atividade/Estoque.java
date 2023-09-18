/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

/**
 *
 * @author ruane
 */
public class Estoque {
    private double galao;
    
    public double getGalao() {
        return galao;
    }

    public void setGalao(double galao) {
        this.galao = galao;
    }
    
    public void litro(double litros){
        this.galao = litros*3.7894;
        System.out.println("Valor convertido: " + this.galao);
    }
}
