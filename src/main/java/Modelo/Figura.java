/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author migue
 */
public class Figura {
        protected String nombre;


    public Figura(String nombreFigura) {
        nombre = nombreFigura;
    }

    public String mostrarInformacion() {
        return "Nombre de la figura: " + nombre;
    }

}
