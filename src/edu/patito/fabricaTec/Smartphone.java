/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.fabricaTec;

/**
 *
 * @author Alonso
 */
public class Smartphone implements Fabrica{
    private String pantalla;
    private boolean AMOLED;
    private boolean LED;
    private boolean IPS;

    public Smartphone() {
    }

    public Smartphone(String pantalla, boolean AMOLED, boolean LED, boolean IPS) {
        this.pantalla = pantalla;
        this.AMOLED = AMOLED;
        this.LED = LED;
        this.IPS = IPS;
    }


    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isAMOLED() {
        return AMOLED;
    }

    public void setAMOLED(boolean AMOLED) {
        this.AMOLED = AMOLED;
    }

    public boolean isLED() {
        return LED;
    }

    public void setLED(boolean LED) {
        this.LED = LED;
    }

    public boolean isIPS() {
        return IPS;
    }

    public void setIPS(boolean IPS) {
        this.IPS = IPS;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "pantalla=" + pantalla + ", AMOLED=" + AMOLED + ", LED=" + LED + ", IPS=" + IPS + '}';
    }
    
}

