/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona objpersona1 = new Persona("Alexis", "Zambrano", "123456", "centro");
        Computador objcomputador1 = new Computador("Lenovo", "245", "mediano", "azul");
        Computador objcomputador2 = new Computador("asus", "136", "pequeño", "rojo");
        ArrayList<Computador> Lscomputadores = new ArrayList<>();
        Lscomputadores.add(objcomputador1);
        Lscomputadores.add(objcomputador2);
        objpersona1.setLsComputadores(Lscomputadores);
        System.out.println("El nombre de la persona es:" + "\t" + objpersona1.getNombre());
        System.out.println("El apellido de la persona es:" + "\t" + objpersona1.getApellido());
        System.out.println("La cedula de la persona es:" + "\t" + objpersona1.getCedula());
        System.out.println("La dirección de la persona es:" + "\t" + objpersona1.getDireccion());
        System.out.println("\n");
        for (int i = 0; i < objpersona1.getLsComputadores().size(); i++) {
            System.out.println("Computador " + (i + 1) + "\n");
            System.out.println("La marca del computador es:" + "\t" + objpersona1.getLsComputadores().get(i).getMarca());
            System.out.println("La serie del computador es:" + "\t" + objpersona1.getLsComputadores().get(i).getSerial());
            System.out.println("El tamaño del computador es:" + "\t" + objpersona1.getLsComputadores().get(i).getTamaño());
            System.out.println("El color del computador es:" + "\t" + objpersona1.getLsComputadores().get(i).getColor());
            System.out.println("\n");
        }
    }
    
}
