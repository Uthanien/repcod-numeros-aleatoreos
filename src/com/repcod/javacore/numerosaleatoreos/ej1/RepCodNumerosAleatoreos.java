/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.repcod.javacore.numerosaleatoreos.ej1;

/**
 *
 * @author Uthanien
 */
public class RepCodNumerosAleatoreos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NumeroAleatorios numeros = new NumeroAleatorios(1, 20);
        
        for(int i = 0; i<20; i++){
            
            System.out.println("Numero aleatoreo: " +numeros.generar());
        }
    }
    
}
