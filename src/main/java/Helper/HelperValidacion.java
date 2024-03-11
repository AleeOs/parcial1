/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class HelperValidacion {
    public static int RetornarValor(String Nombre) {
        int numero = 0;
        int letra = 0;
        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isDigit(Nombre.charAt(j));
            if (flag) {
                numero++;
            } else {
                letra++;
            }
        }
        return numero;
    }

    public static int RetornarCEV2(String Nombre) {
        int ce = 0;
        ArrayList<Character> lscaracteres = new ArrayList<>();
        lscaracteres.add('@');
        lscaracteres.add('~');
        lscaracteres.add('/');
        lscaracteres.add(';');
        lscaracteres.add(':');
        lscaracteres.add('"');
        lscaracteres.add('!');
        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isLetter(Nombre.charAt(j));
            if (!flag) {
                for (int i = 0; i < lscaracteres.size(); i++) {
                    if (lscaracteres.get(i).equals(Nombre.charAt(j))) {
                        ce++;
                    }
                }
            }
        }
        return ce;
    }

    public static boolean ValidarVacio(String cadena) {
        return cadena.equals("");
    }

    public static int RetornarLetra(String Nombre) {
        int numero = 0;
        int letra = 0;
        for (int j = 0; j < Nombre.length(); j++) {
            boolean flag = Character.isDigit(Nombre.charAt(j));
            if (!flag) {
                letra++;
            }
        }
        return letra;
    }

    public static int ValidarCantidadRango(int cantidad) {
        if (cantidad > 0 && cantidad <= 5) {
        return 1;
    } else {
        return 0;
    }
}
}