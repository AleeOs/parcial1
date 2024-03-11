/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class HelperRegistrarPersona {
    public static Persona RegistrarPersona(Persona objPersona, ArrayList<Computador> lsComputadores) {
        objPersona.setLsComputadores(lsComputadores);
        return objPersona;
    }
}
