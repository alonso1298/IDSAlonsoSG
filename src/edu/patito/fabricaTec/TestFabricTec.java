/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.fabricaTec;

import java.util.Scanner;

/**
 *
 * @author Alonso
 */
public class TestFabricTec {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        //Pintamos el menu
        System.out.println("Que deseas Comprar?:");
        System.out.println(Fabrica.Computadora_gamaAlt + ")Pc Gamer");
        System.out.println(Fabrica.Computadora_gamaMed + ")Pc Escritorio");
        System.out.println(Fabrica.Smartphone_gamaAlt + ")Celular Gama alta");
        System.out.println(Fabrica.Smartphone_gamaMed+ ")Celular Gama Media");
        System.out.println(Fabrica.Smartphone_gamaBaja + ")Celular Gama Baja");
        System.out.println(Fabrica.Tablet_gamaAlt + ")iPad");
        System.out.println(Fabrica.Tablet_gamaMed + ")GalaxyTab");
        
        try {
            System.out.print("Elige el numero:");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
        } 
        
        Fabrica gadget = FabricTec.createTec(eleccion);
        System.out.println(gadget.toString());
        
    }
}
