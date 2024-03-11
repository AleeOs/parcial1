/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class HelperImpresion {
    public static void ImprimirPersona(ArrayList<Persona> LsPersonas) {
        for (int i = 0; i < LsPersonas.size(); i++) {
            System.out.println("El nombre de la persona es: " + LsPersonas.get(i).getNombre());
            System.out.println("El apellido de la persona es: " + LsPersonas.get(i).getApellido());
            System.out.println("La cedula de la persona es: " + LsPersonas.get(i).getCedula());
            System.out.println("La direccion de la persona es: " + LsPersonas.get(i).getDireccion());
            System.out.println("\n");
            for (int j = 0; j < LsPersonas.get(i).getLsComputadores().size(); j++) {
                System.out.println("Computador " + (j + 1) + "\n");
                System.out.println("La marca del computador es: " + LsPersonas.get(i).getLsComputadores().get(j).getMarca());
                System.out.println("La serie del computador es: " + LsPersonas.get(i).getLsComputadores().get(j).getSerial());
                System.out.println("El tamaño del computador es: " + LsPersonas.get(i).getLsComputadores().get(j).getTamaño());
                System.out.println("El color del computador es: " + LsPersonas.get(i).getLsComputadores().get(j).getColor());
                System.out.println("\n");
            }
        }
    }

    public static void ImprimirPersonaBuscada(ArrayList<Persona> lsPersonas, String Id_buscar) {
        int bandera = 0;
        for (int i = 0; i < lsPersonas.size(); i++) {
            if (Id_buscar.equals(lsPersonas.get(i).getCedula())) {
                bandera = 1;
                System.out.println("El nombre de la persona es: " + lsPersonas.get(i).getNombre());
                System.out.println("El apellido de la persona es: " + lsPersonas.get(i).getApellido());
                System.out.println("La cedula de la persona es: " + lsPersonas.get(i).getCedula());
                System.out.println("La direccion de la persona es: " + lsPersonas.get(i).getDireccion());
                System.out.println("\n");
                for (int j = 0; j < lsPersonas.get(i).getLsComputadores().size(); j++) {
                    System.out.println("Computador " + (j + 1) + "\n");
                    System.out.println("La marca del computador es: " + lsPersonas.get(i).getLsComputadores().get(j).getMarca());
                    System.out.println("La serie del computador es: " + lsPersonas.get(i).getLsComputadores().get(j).getSerial());
                    System.out.println("El tamaño del computador es: " + lsPersonas.get(i).getLsComputadores().get(j).getTamaño());
                    System.out.println("El color del computador es: " + lsPersonas.get(i).getLsComputadores().get(j).getColor());
                    System.out.println("\n");
                }
            }
        }
        if (bandera == 0) {
            System.out.println("El id no existe");
        }
}
}