/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class Persona {
    private String Nombre;
    private String Apellido;
    private String Cedula;
    private String Direccion;
    private ArrayList<Computador> LsComputadores;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido, String Cedula, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Computador> getLsComputadores() {
        return LsComputadores;
    }

    public void setLsComputadores(ArrayList<Computador> LsComputadores) {
        this.LsComputadores = LsComputadores;
    }
}

