/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.patito.fabricaTec;

/**
 *
 * @author Alonso
 */
public class Computadora implements Fabrica {
    private String Especificaciones;
    private boolean ram64g;
    private boolean rtx390ti;
    private boolean ryzen9;
    private boolean ram8g;
    private boolean rtx1650ti;
    private boolean corei5;

    public Computadora() {
    }

    public Computadora(String Especificaciones, boolean ram64g, boolean rtx390ti, boolean ryzen9, boolean ram8g, boolean rtx1650ti, boolean corei5) {
        this.Especificaciones = Especificaciones;
        this.ram64g = ram64g;
        this.rtx390ti = rtx390ti;
        this.ryzen9 = ryzen9;
        this.ram8g = ram8g;
        this.rtx1650ti = rtx1650ti;
        this.corei5 = corei5;
    }

    public String getEspecificaciones() {
        return Especificaciones;
    }

    public void setEspecificaciones(String Especificaciones) {
        this.Especificaciones = Especificaciones;
    }

    public boolean isRam64g() {
        return ram64g;
    }

    public void setRam64g(boolean ram64g) {
        this.ram64g = ram64g;
    }

    public boolean isRtx390ti() {
        return rtx390ti;
    }

    public void setRtx390ti(boolean rtx390ti) {
        this.rtx390ti = rtx390ti;
    }

    public boolean isRyzen9() {
        return ryzen9;
    }

    public void setRyzen9(boolean ryzen9) {
        this.ryzen9 = ryzen9;
    }

    public boolean isRam8g() {
        return ram8g;
    }

    public void setRam8g(boolean ram8g) {
        this.ram8g = ram8g;
    }

    public boolean isRtx1650ti() {
        return rtx1650ti;
    }

    public void setRtx1650ti(boolean rtx1650ti) {
        this.rtx1650ti = rtx1650ti;
    }

    public boolean isCorei5() {
        return corei5;
    }

    public void setCorei5(boolean corei5) {
        this.corei5 = corei5;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Especificaciones=" + Especificaciones + ", ram64g=" + ram64g + ", rtx390ti=" + rtx390ti + ", ryzen9=" + ryzen9 + ", ram8g=" + ram8g + ", rtx1650ti=" + rtx1650ti + ", corei5=" + corei5 + '}';
    }
    
}
