/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author migue
 */
public class Rectangulo extends Figura {
    private Punto vertice1;
    private Punto vertice2;

    public Rectangulo(String nombreFigura, Punto p1, Punto p2) {
        super(nombreFigura);
        vertice1 = p1;
        vertice2 = p2;
    }

    public Rectangulo(String nombreFigura, double x1, double y1, double x2, double y2) {
        super(nombreFigura);
        vertice1 = new Punto(x1, y1);
        vertice2 = new Punto(x2, y2);
    }


    public double calcularArea() {
        double base = Math.abs(vertice2.getX() - vertice1.getX());
        double altura = Math.abs(vertice2.getY() - vertice1.getY());
        double area = base * altura;
        return area;
    }

    public void cambiarEscala(double factor) {
        double nuevaX = vertice1.getX() + (vertice2.getX() - vertice1.getX()) * factor;
        double nuevaY = vertice1.getY() + (vertice2.getY() - vertice1.getY()) * factor;
        vertice2 = new Punto(nuevaX, nuevaY);
    }

    public boolean contienePunto(Punto p) {
        double minX = Math.min(vertice1.getX(), vertice2.getX());
        double maxX = Math.max(vertice1.getX(), vertice2.getX());
        double minY = Math.min(vertice1.getY(), vertice2.getY());
        double maxY = Math.max(vertice1.getY(), vertice2.getY());

        if (p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY) {
            return true;
        } else {
            return false;
        }
    }


    public void mover(double desplazamientoX) {
        vertice1.mover(desplazamientoX, 0);
        vertice2.mover(desplazamientoX, 0);
    }


    public void mover(double desplazamientoX, double desplazamientoY) {
        vertice1.mover(desplazamientoX, desplazamientoY);
        vertice2.mover(desplazamientoX, desplazamientoY);
    }

    public String mostrarInformacion() {
        String infoBase = super.mostrarInformacion();
        String infoPropia = "\nVértice 1: " + vertice1.mostrarCoordenadas()
                + "\nVértice 2: " + vertice2.mostrarCoordenadas()
                + "\nÁrea: " + calcularArea();
        return infoBase + infoPropia;
    }
}
