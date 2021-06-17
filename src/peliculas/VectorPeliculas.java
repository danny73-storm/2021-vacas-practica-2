package src.peliculas;

import src.tienda.*;

public class VectorPeliculas {

    private Peliculas[] peliculas = new Peliculas[15]; 
    private int siguienteCodigoPeli;
    
    //constructor po defecto 
    public VectorPeliculas(){
        siguienteCodigoPeli = 1;
    }
    
    //Agregar peliculas
    public void agregarPelis(String titulo, String categoria, int year) {
        if (siguienteCodigoPeli > 15) {
            System.out.println("Límite de peliculas alcanzadas");
        } else {
            peliculas[(siguienteCodigoPeli - 1)] = new Peliculas(siguienteCodigoPeli, titulo, categoria,year);
        }
        siguienteCodigoPeli++;
    }
    public void agregarPelis(){
        String titulo = IngresoDatos.getTexto("Ingrese el titulo de la pelicula");
        String categoria = IngresoDatos.getTexto("Ingrese la categoria");
        int year = IngresoDatos.getEntero("Ingrese el año de estreno de la pelicula",false);
        agregarPelis(titulo,categoria,year);
    }
    //fin de agregar peliculas

    // mostrar peliculas
    public void mostrarPelis() {
        System.out.println("\n\n Peliculas en memorabilia");
        for (int i = 0; i < (siguienteCodigoPeli - 1); i++) {
            System.out.println("-" + i + ") " + peliculas[i].getInformacionPeli());
            // System.out.println("-"+i+") "+clientes[i].getId() + " nombre
            // "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());

        }

        System.out.println("\n\n");
    }

    // Ordenamiento
    public void ordenarPorNombrePeli(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigoPeli-1); i++) {
            for (int j = 0; j < (siguienteCodigoPeli-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (peliculas[j].getTitulo().compareTo(peliculas[j+1].getTitulo()) > 0 );
                else
                    cambio= (peliculas[j].getTitulo().compareTo(peliculas[j+1].getTitulo()) < 0 );

                if(cambio ){
                    //pelicula i va antes que pelicula j <0 descendente
                    Peliculas aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }
    }
}  
