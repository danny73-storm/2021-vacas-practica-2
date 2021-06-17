package src.tienda;

import java.util.Scanner;

import src.peliculas.VectorPeliculas;
import src.clientes.VectorClientes;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes tablaClientes = new VectorClientes();
    private VectorPeliculas tablaPeliculas = new VectorPeliculas();

    public Principal(){
      Scanner leer = new Scanner(System.in);
      
      boolean salir = false;
      boolean regresar1 = false;
      boolean regresar2 = false;
      
      int opcion; //Guardaremos la opcion del cliente.
      while(!salir){
         System.out.println("\n******************************");
         System.out.println("*******  Bienvenidos a  ******");
         System.out.println("*******   Memorabilia   ******");
         System.out.println("******************************\n\n");
         System.out.println("----------------------------");
         System.out.println(" Ingrese opcion que desee:  ");
         System.out.println("----------------------------");
         System.out.println("1. Prestamo de peliculas");
         System.out.println("2. Devolucion de peliculas");
         System.out.println("3. Mostrar peliculas");
         System.out.println("4. Ingreso de peliculas");
         System.out.println("5. Ingresar clientes nuevos");
         System.out.println("6. Mostrar clientes");
         System.out.println("7. Reportes");
         System.out.println("-1. Salir");
         
         opcion = leer.nextInt();
         switch(opcion){
            case 1:
               System.out.println("\nQue pelicula deseas prestar?");
               System.out.println("----------------------------\n");
               
               break;
            case 2:
               System.out.println("\nQue pelicula deseas devolver?");
               System.out.println("-----------------------------\n");
               
               break;
            case 3:
               System.out.println("\nCatalogo de pelis!");
               System.out.println("------------------\n");
                while (!regresar1) {
                   System.out.println("1. Mostrar peliculas");
                   System.out.println("2. Mostrar peliculas ascendentes");
                   System.out.println("3. Mostrar peliculas descendente");
                   System.out.println("4. Regresar al menu principal");
                   opcion = leer.nextInt();
                   switch (opcion) {
                    case 1:
                        tablaPeliculas.mostrarPelis();
                        break;
                    case 2:
                        System.out.println("Desordenado:");
                        tablaPeliculas.mostrarPelis();
                        System.out.println("\n\nOrdenado:");
                        tablaPeliculas.ordenarPorNombrePeli(true);
                        tablaPeliculas.mostrarPelis();
                        break;
                    case 3:
                        System.out.println("Desordenado:");
                        tablaPeliculas.mostrarPelis();
                        System.out.println("\n\nOrdenado:");
                        tablaPeliculas.ordenarPorNombrePeli(false);
                        tablaPeliculas.mostrarPelis();
                        break;
                    case 4:
                        regresar1 = true;
                        break;
                    default:
                        System.out.println("La opcion selecionada no esta disponible");
                        break;
                    }
                }
               break;
            case 4:
               System.out.println("\nIngresar nueva peli");
               System.out.println("-------------------\n");
               tablaPeliculas.agregarPelis();;
               break;
            case 5:
               System.out.println("\nIngreso de cliente");
               System.out.println("------------------\n");
               tablaClientes.agregarCliente();                  
               break;
            case 6:
               System.out.println("\nMostrar clientes");
               System.out.println("----------------\n");
                while (!regresar2) {
                    System.out.println("1. Mostrar clientes");
                    System.out.println("2. Mostrar clientes ascendentes");
                    System.out.println("3. Mostrar clientes descendente");
                    System.out.println("4. Regresar al menu principal");

                    opcion = leer.nextInt();

                 switch (opcion) {
                    case 1:
                        tablaClientes.mostrarClientes();
                        break;
                    case 2:
                        System.out.println("Desordenado:");
                        tablaClientes.mostrarClientes();
                        System.out.println("\n\nOrdenado:");
                        tablaClientes.ordenarPorNombre(true);
                        tablaClientes.mostrarClientes();
                        break;
                    case 3:
                        System.out.println("Desordenado:");
                        tablaClientes.mostrarClientes();
                        System.out.println("\n\nOrdenado:");
                        tablaClientes.ordenarPorNombre(false);
                        tablaClientes.mostrarClientes();
                        break;
                    case 4:
                        regresar2 = true;
                        break;
                    default:
                        System.out.println("La opcion selecionada no esta disponible");
                        break;
                    }
                }    
                break;
            case 7:
               System.out.println("\nReportes");
               System.out.println("--------\n");
               break;
            case -1:
            salir=true;
               break;
            default:
               System.out.println("Las opciones son entre 1 y 9 ");
            }
        }            
    }    
}
