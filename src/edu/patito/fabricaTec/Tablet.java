/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.fabricaTec;

/**
 *
 * @author Alonso
 */
public class Tablet implements Fabrica{
    private String implementos;
    private boolean red5g;
    private boolean pantalla16pul;
    private boolean audioJBL;
    private boolean red4g;
    private boolean pantalla10pul;
    private boolean audioGenerico;

    public Tablet() {
    }

    public Tablet(String implementos, boolean red5g, boolean pantalla16pul, boolean audioJBL, boolean red4g, boolean pantalla10pul, boolean audioGenerico) {
        this.implementos = implementos;
        this.red5g = red5g;
        this.pantalla16pul = pantalla16pul;
        this.audioJBL = audioJBL;
        this.red4g = red4g;
        this.pantalla10pul = pantalla10pul;
        this.audioGenerico = audioGenerico;
    }

    public String getImplementos() {
        return implementos;
    }

    public void setImplementos(String implementos) {
        this.implementos = implementos;
    }

    public boolean isRed5g() {
        return red5g;
    }

    public void setRed5g(boolean red5g) {
        this.red5g = red5g;
    }

    public boolean isPantalla16pul() {
        return pantalla16pul;
    }

    public void setPantalla16pul(boolean pantalla16pul) {
        this.pantalla16pul = pantalla16pul;
    }

    public boolean isAudioJBL() {
        return audioJBL;
    }

    public void setAudioJBL(boolean audioJBL) {
        this.audioJBL = audioJBL;
    }

    public boolean isRed4g() {
        return red4g;
    }

    public void setRed4g(boolean red4g) {
        this.red4g = red4g;
    }

    public boolean isPantalla10pul() {
        return pantalla10pul;
    }

    public void setPantalla10pul(boolean pantalla10pul) {
        this.pantalla10pul = pantalla10pul;
    }

    public boolean isAudioGenerico() {
        return audioGenerico;
    }

    public void setAudioGenerico(boolean audioGenerico) {
        this.audioGenerico = audioGenerico;
    }

    @Override
    public String toString() {
        return "Tablet{" + "implementos=" + implementos + ", red5g=" + red5g + ", pantalla16pul=" + pantalla16pul + ", audioJBL=" + audioJBL + ", red4g=" + red4g + ", pantalla10pul=" + pantalla10pul + ", audioGenerico=" + audioGenerico + '}';
    }
    
}
