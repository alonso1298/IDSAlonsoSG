/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.fabricaTec;

/**
 *
 * @author Alonso
 */
public class FabricTec {
    static Fabrica createTec (int gama){
        switch (gama) {
            case Fabrica.Computadora_gamaAlt -> {
                return new Computadora("PC Gamer", true, true, true, false, false, false);
            }
            
            case Fabrica.Computadora_gamaMed -> {
                return new Computadora("PC Escolar", false, false, false, true, true, true);
            }
            
            case Fabrica.Smartphone_gamaAlt -> {
                return new Smartphone("Alta fidelidad", true, false, false);
            }
            
            case Fabrica.Smartphone_gamaMed -> {
                return new Smartphone("Fidlidad normal", false, true, false);
            }
            
            case Fabrica.Smartphone_gamaBaja -> {
                return new Smartphone("Baja fidelidad ", false, false, true);
            }
            
            case Fabrica.Tablet_gamaAlt -> {
                return new Tablet("Tablet Apple", true, true, true, false, false, false);
            }
            
            case Fabrica.Tablet_gamaMed -> {
                return new Tablet("Tablet Samsung", false, false, false, true, true, true);
            }
                
            default -> throw new AssertionError();
                
        }
    }
}
