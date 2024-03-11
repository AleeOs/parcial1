/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helper.HelperImpresion;
import Helper.HelperRegistrarPersona;
import Helper.HelperValidacion;
import Helper.HelperValidacionOpc;
import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author Alexis
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc = 0, cant_comp=0;
       String Nombre,Apellido, Cedula, Direccion,Marca,Serial, Tamaño,Color, nom_p, id_buscar;
        int retorno, caracter_e;
        boolean rta;
        int rtas, conteo;
                
         Scanner scan = new Scanner(System.in);

        ArrayList<Computador> Lscomputadoresglobal = null;
        ArrayList<Persona> Lspersonas = new ArrayList<>();
        
        
        do {
            System.out.println("1. Registrar persona");
            System.out.println("2. Visualizar Persona");
            System.out.println("3. Consultar Persona");
            System.out.println("4. Salir");
            do {
                try {

                    System.out.println("Digite una opcion valida");
                    opc = scan.nextInt();
                  } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (opc <= 0);

            switch (opc) {
                case 1:
        
        //Nombre
                    System.out.println("Digite el nombre de la persona");
                    Nombre = scan.nextLine();
                    rtas = HelperValidacionOpc.ValidarVacio(Nombre);

                    while (rtas>0) {
                        System.out.println("Digite el nombre de la persona");
                        Nombre = scan.nextLine();
                        rtas = HelperValidacionOpc.ValidarVacio(Nombre);
                    }
                    conteo=HelperValidacionOpc.ValidarTodo(Nombre);
                    
                    while (conteo != 0) {
                        System.out.println("Digite el nombre de la persona");
                        Nombre = scan.nextLine();
                        conteo=HelperValidacionOpc.ValidarTodo(Nombre);

                    }
                    //Termina Nombre
        
        //Apellido
                    System.out.println("Digite el apellido de la persona");
                    Apellido = scan.nextLine();
                    rtas = HelperValidacionOpc.ValidarVacio(Apellido);

                    while (rtas>0) {
                        System.out.println("Digite el apellido de la persona");
                        Apellido = scan.nextLine();
                        rtas = HelperValidacionOpc.ValidarVacio(Apellido);
                    }
                    conteo=HelperValidacionOpc.ValidarTodo(Apellido);
                    
                    while (conteo != 0) {
                        System.out.println("Digite el apellido de la persona");
                        Apellido = scan.nextLine();
                        conteo=HelperValidacionOpc.ValidarTodo(Apellido);

                    }
                    //Termina Apellido
        
             //Cedula
                    System.out.println("Digite la Cedula de la persona");
Cedula = scan.nextLine();
rtas = HelperValidacionOpc.ValidarVacio(Cedula);

while (rtas > 0 || !HelperValidacionOpc.EsNumero(Cedula)) {
   
    System.out.println("Digite la Cedula de la persona");
    Cedula = scan.nextLine();
    rtas = HelperValidacionOpc.ValidarVacio(Cedula);
}
                    //Termina Cedula




        //direccion
                    System.out.println("Digite la direccion de la persona");
                    Direccion = scan.nextLine();
                    rtas = HelperValidacionOpc.ValidarVacio(Direccion);

                    while (rtas>0) {
                        System.out.println("Digite la direccion de la persona");
                        Direccion = scan.nextLine();
                        rtas = HelperValidacionOpc.ValidarVacio(Direccion);
                    }
                    conteo=HelperValidacionOpc.ValidarTodo(Direccion);
                    
                    while (conteo != 0) {
                        System.out.println("Digite la direccion de la persona");
                        Direccion = scan.nextLine();
                        conteo=HelperValidacionOpc.ValidarTodo(Direccion);

                    }
                    
            
         //Cantidad computadores
                    ArrayList<Computador> Lscomputadores= new ArrayList<>();
                    
                     do {
                try {

                    System.out.println("Digite la cantidad de computadores de la persona");
                    cant_comp = scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Error");
                }
                scan.nextLine();
            } while (cant_comp <= 0);

                    

                    int vc = HelperValidacion.ValidarCantidadRango(cant_comp);

                    //Crear Lista computadores
                    if (vc == 1) {
                        for (int i = 0; i < cant_comp; i++) {
                            //Marca Computador
                        System.out.println("Digite la marca del computador" + "\t" + (i + 1));
                            Marca = scan.nextLine();
                            rtas = HelperValidacionOpc.ValidarVacio(Marca);

                            while (rtas>0) {
                                System.out.println("Digite la marca del computador" + "\t" + (i + 1));
                                Marca = scan.nextLine();
                                rtas = HelperValidacionOpc.ValidarVacio(Marca);
                            }
                            conteo=HelperValidacionOpc.ValidarTodo(Marca);

                            while (conteo != 0) {
                                System.out.println("Digite la marca del computador" + "\t" + (i + 1));
                                Marca = scan.nextLine();
                                conteo=HelperValidacionOpc.ValidarTodo(Marca);
   }    //Fin Marca Computador
                            
             //Serial Computador
                        System.out.println("Digite la serial del computador");
Serial = scan.nextLine();
rtas = HelperValidacionOpc.ValidarVacio(Serial);

while (rtas > 0 || !HelperValidacionOpc.EsNumero(Serial)) {
   
    System.out.println("Digite la serial del computador");
    Serial = scan.nextLine();
    rtas = HelperValidacionOpc.ValidarVacio(Serial);

   }    //Fin Serial Computador
                                            
     //Tamaño Computador
                        System.out.println("Digite el tamaño del computador" + "\t" + (i + 1));
                            Tamaño = scan.nextLine();
                            rtas = HelperValidacionOpc.ValidarVacio(Tamaño);

                            while (rtas>0) {
                                System.out.println("Digite el tamaño  del computador" + "\t" + (i + 1));
                                Tamaño = scan.nextLine();
                                rtas = HelperValidacionOpc.ValidarVacio(Tamaño);
                            }
                            conteo=HelperValidacionOpc.ValidarTodo(Tamaño);

                            while (conteo != 0) {
                                System.out.println("Digite el tamaño  del computador" + "\t" + (i + 1));
                                Tamaño = scan.nextLine();
                                conteo=HelperValidacionOpc.ValidarTodo(Tamaño);
   }    //Fin Tamaño Computador
                                                                  
          //Color Computador
                        System.out.println("Digite el color del computador" + "\t" + (i + 1));
                           Color  = scan.nextLine();
                            rtas = HelperValidacionOpc.ValidarVacio(Color);

                            while (rtas>0) {
                                System.out.println("Digite el color del computador" + "\t" + (i + 1));
                                Color = scan.nextLine();
                                rtas = HelperValidacionOpc.ValidarVacio(Color);
                            }
                            conteo=HelperValidacionOpc.ValidarTodo(Color);

                            while (conteo != 0) {
                                System.out.println("Digite el color del computador" + "\t" + (i + 1));
                                Color = scan.nextLine();
                                conteo=HelperValidacionOpc.ValidarTodo(Color);
   }    //Fin Color Computador
                                                                                 
                            
                            Computador objcomputador = new Computador(Marca, Serial, Tamaño, Color);
                            Lscomputadores.add(objcomputador);
       
                        }
                         Lscomputadoresglobal=Lscomputadores;
                         Lscomputadores=null;
                         
                    } else {
                        System.out.println("Cantidad Invalida");
                        break;
                    }

                    //Fin Cantidad Perros
                    //Crear Persona
                    Persona objpersona = new Persona(Nombre, Apellido, Cedula, Direccion);
                    Persona objenviado= HelperRegistrarPersona.RegistrarPersona(objpersona,Lscomputadoresglobal);
                    Lspersonas.add(objenviado);
                    break;
      
           case 2:
                    if (! Lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersona(Lspersonas);
                    } else {
                        System.out.println("La lista de personas no esta llena");
                    }
                    break;

                case 3:
                    scan.nextLine();
                    System.out.println("Digite el id de la persona");
                    id_buscar = scan.nextLine();
                    if (!Lspersonas.isEmpty()) {
                        HelperImpresion.ImprimirPersonaBuscada(Lspersonas, id_buscar);
                    } else {
                        System.out.println("La lista de personas no esta llena");
                    }
                    break;
           
                    
    }
    
}while (opc != 4);
        }
}

        
    
    

        
        
        
        
        
        
    
    

