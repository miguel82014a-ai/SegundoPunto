/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author migue
 */
public abstract class Figura {
     protected double x1, y1, x2, y2;

    public Figura(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public abstract double area();
    public abstract boolean contiene(double x, double y);
    
    public void moverHorizontal(double distancia) {
        x1 += distancia;
        x2 += distancia;
    }
    
    public void moverVertical(double distancia) {
        y1 += distancia;
        y2 += distancia;
    }
    
     public String obtenerInformacion() {
        return "Figura con vértices (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ")";
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    

}
