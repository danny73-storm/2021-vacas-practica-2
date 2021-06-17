package src.peliculas;

public class Peliculas {
    //Estableciendo atributos
    private int idPel;
    private String titulo;
    private String categoria;
    private int year;

    //constructor con parametros
    public Peliculas(int idPel,String titulo,String categoria,int year){
        this.idPel = idPel;
        this.titulo = titulo;
        this.categoria = categoria;
        this.year = year; 
    }

    public Peliculas(int idPel,String titulo,String categoria){
        this(idPel,titulo,categoria,0);
    }
    
    //creando getters y setters
    public int getIdPel(){
        return idPel;
    } 
    public void setIdPel(int idPel){
        this.idPel = idPel;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getCategoria(){
        return categoria;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria; 
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    // terminado metodos getters y setters 

    public String getInformacionPeli() {
        String resultado = "Id: " + idPel + "titulo de la pelicula: " + titulo + "Categoria: " +categoria;
        return resultado;
    }



}
