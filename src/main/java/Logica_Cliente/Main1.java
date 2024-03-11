/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helper.HelperImpresion;
import Helper.HelperValidacion;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc = 0;
        String Nombre, Apellido, Cedula, Direccion, Marca, Serial, Tamaño, Color, id_buscar;
        boolean rta;

        Scanner scan = new Scanner(System.in);

        ArrayList<Computador> Lscomputadores = new ArrayList<>();
        ArrayList<Persona> Lspersonas = new ArrayList<>();

        do {
            System.out.println("1. Registrar persona");
            System.out.println("2. Visualizar Persona");
            System.out.println("3. Consultar Persona");
            System.out.println("4. Salir");

            do {
                try {
                    System.out.println("Digite una opcion");
                    opc = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine(); // Limpiar el buffer del scanner
            } while (opc <= 0);

            switch (opc) {
                case 1:
                    // Nombre
                    System.out.println("Digite el nombre de la persona");
                    Nombre = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(Nombre);

                    while (rta) {
                        System.out.println("Digite el nombre de la persona");
                        Nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Nombre);
                    }

                    rta = HelperValidacion.ValidarVacio(Nombre);
                    int retorno = HelperValidacion.RetornarValor(Nombre);
                    int caracter_e = HelperValidacion.RetornarCEV2(Nombre);

                    while (retorno != 0 || rta || caracter_e != 0) {
                        System.out.println("Digite el nombre de la persona");
                        Nombre = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Nombre);
                        retorno = HelperValidacion.RetornarValor(Nombre);
                        caracter_e = HelperValidacion.RetornarCEV2(Nombre);
                    }

                    // Apellido
                    System.out.println("Digite el apellido de la persona");
                    Apellido = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(Apellido);

                    while (rta) {
                        System.out.println("Digite el apellido de la persona");
                        Apellido = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Apellido);
                    }

                    rta = HelperValidacion.ValidarVacio(Apellido);
                    retorno = HelperValidacion.RetornarValor(Apellido);
                    caracter_e = HelperValidacion.RetornarCEV2(Apellido);

                    while (retorno != 0 || rta || caracter_e != 0) {
                        System.out.println("Digite el apellido de la persona");
                        Apellido = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Apellido);
                        retorno = HelperValidacion.RetornarValor(Apellido);
                        caracter_e = HelperValidacion.RetornarCEV2(Apellido);
                    }

                    // Cedula
                    System.out.println("Digite la cedula de la persona");
                    Cedula = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(Cedula);

                    while (rta) {
                        System.out.println("Digite la cedula de la persona");
                        Cedula = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Cedula);
                    }

                    rta = HelperValidacion.ValidarVacio(Cedula);
                    retorno = HelperValidacion.RetornarLetra(Cedula);
                    caracter_e = HelperValidacion.RetornarCEV2(Cedula);

                    while (retorno != 0 || rta || caracter_e != 0) {
                        System.out.println("Digite la cedula de la persona");
                        Cedula = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Cedula);
                        retorno = HelperValidacion.RetornarLetra(Cedula);
                        caracter_e = HelperValidacion.RetornarCEV2(Cedula);
                    }

                    // Direccion
                    System.out.println("Digite la direccion de la persona");
                    Direccion = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(Direccion);

                    while (rta) {
                        System.out.println("Digite el direccion de la persona");
                        Direccion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Direccion);
                    }

                    rta = HelperValidacion.ValidarVacio(Direccion);
                    retorno = HelperValidacion.RetornarValor(Direccion);
                    caracter_e = HelperValidacion.RetornarCEV2(Direccion);

                    while (retorno != 0 || rta || caracter_e != 0) {
                        System.out.println("Digite el direccion de la persona");
                        Direccion = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Direccion);
                        retorno = HelperValidacion.RetornarValor(Direccion);
                        caracter_e = HelperValidacion.RetornarCEV2(Direccion);
                    }

                    // Cantidad Computadores
                    System.out.println("Digite la cantidad de computadores de la persona");
                    int cant_comp = scan.nextInt();
                    scan.nextLine(); // Limpiar el buffer del scanner
                    boolean cantidadValida = false;

while (!cantidadValida) {
    try {
        cant_comp = Integer.parseInt(scan.nextLine());
        if (cant_comp >= 1 && cant_comp <= 5) {
            cantidadValida = true;
        } else {
            System.out.println("La cantidad ingresada es inválida. Por favor ingrese un número entre 1 y 5.");
        }
    } catch (NumberFormatException e) {
        System.out.println("Error: Debe ingresar un número entero.");
    }
}
                    
                                                                   
                    

                    
                        for (int i = 0; i < cant_comp; i++) {
                            // Marca Computador
                            System.out.println("Digite la marca del computador " + (i + 1));
                            Marca = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(Marca);

                            while (rta) {
                                System.out.println("Digite la marca del computador " + (i + 1));
                                Marca = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(Marca);
                            }

                            rta = HelperValidacion.ValidarVacio(Marca);
                            retorno = HelperValidacion.RetornarValor(Marca);
                            caracter_e = HelperValidacion.RetornarCEV2(Marca);

                            while (retorno != 0 || rta || caracter_e != 0) {
                                System.out.println("Digite la marca del computador " + (i + 1));
                                Marca = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(Marca);
                                retorno = HelperValidacion.RetornarValor(Marca);
                                caracter_e = HelperValidacion.RetornarCEV2(Marca);
                            }

                            // Serial
                            System.out.println("Digite el serial del computador " + (i + 1));
                            Serial = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(Serial);
                            
                            while (rta) {
                        System.out.println("Digite la serial del computador");
                        Serial = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Serial);
                    }

                    rta = HelperValidacion.ValidarVacio(Serial);
                    retorno = HelperValidacion.RetornarLetra(Serial);
                    caracter_e = HelperValidacion.RetornarCEV2(Serial);

                    while (retorno != 0 || rta || caracter_e != 0) {
                        System.out.println("Digite la serial del computador");
                        Serial = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(Serial);
                        retorno = HelperValidacion.RetornarLetra(Serial);
                        caracter_e = HelperValidacion.RetornarCEV2(Serial);
                    }

                            

                            // Tamaño Computador
                            System.out.println("Digite el tamaño del computador " + (i + 1));
                            Tamaño = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(Tamaño);

                            while (rta) {
                                System.out.println("Digite el tamaño del computador " + (i + 1));
                                Tamaño = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(Tamaño);
                            }

                            rta = HelperValidacion.ValidarVacio(Tamaño);
                            retorno = HelperValidacion.RetornarValor(Tamaño);
                            caracter_e = HelperValidacion.RetornarCEV2(Tamaño);

                            while (retorno != 0 || rta || caracter_e != 0) {
                                System.out.println("Digite el tamaño del computador " + (i + 1));
                                Tamaño = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(Tamaño);
                                retorno = HelperValidacion.RetornarValor(Tamaño);
                                caracter_e = HelperValidacion.RetornarCEV2(Tamaño);
                            }

                            // Color Computador
                            System.out.println("Digite el color del computador " + (i + 1));
                            Color = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(Color);

                            while (rta) {
                                System.out.println("Digite el color del computador " + (i + 1));
                                Color = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(Color);
                            }

                            rta = HelperValidacion.ValidarVacio(Color);
                            retorno = HelperValidacion.RetornarValor(Color);
                            caracter_e = HelperValidacion.RetornarCEV2(Color);

                            while (retorno != 0 || rta || caracter_e != 0) {
                                System.out.println("Digite el color del computador " + (i + 1));
                                Color = scan.nextLine();
                                rta = HelperValidacion.ValidarVacio(Color);
                                retorno = HelperValidacion.RetornarValor(Color);
                                caracter_e = HelperValidacion.RetornarCEV2(Color);
                            }

                            // Crear objeto Computador
                            Computador objComputador = new Computador(Marca, Serial, Tamaño, Color);
                            Lscomputadores.add(objComputador);
                        }
                   
                    

                    // Crear objeto Persona
                    Persona objpersona = new Persona(Nombre, Apellido, Cedula, Direccion);

                    // Asociar lista de computadores a la persona
                    
                    objpersona.setLsComputadores(Lscomputadores);
                    Lspersonas.add(objpersona);
                    break;

                case 2:
                    if (!Lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersona(Lspersonas);
                    } else {
                        System.out.println("La lista de personas no está llena");
                    }
                    break;

                case 3:
                    scan.nextLine(); // Limpiar el buffer del scanner
                    System.out.println("Digite el id de la persona");
                    id_buscar = scan.nextLine();
                    if (!Lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersonaBuscada(Lspersonas, id_buscar);
                    } else {
                        System.out.println("La lista de personas no está llena");
                    }
                    break;
            }
        } while (opc != 4);

    }
}
