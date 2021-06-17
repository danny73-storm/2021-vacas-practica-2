package src.peliculas;

public class Peliculas {
    //Estableciendo atributos
    private int idPel;
    private String titulo;
    private String categoria;
    private int año;
    private boolean disponible;

    //constructor con parametros
    public Peliculas(int idPel,String titulo,String categoria,int año,boolean disponible){
        this.idPel = idPel;
        this.titulo = titulo;
        this.categoria = categoria;
        this.año = año;
        this.disponible = disponible; 
    }

    public Peliculas(int idPel,String titulo,String categoria,int año){
        this(idPel,titulo,categoria,año);
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

    public int getAño(){
        return año;
    }
    public void setAño(int año){
        this.año = año;
    }

    public boolean getDisponible(){
        return disponible;
    }
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public String getInformacionPeli() {
        String resultado = "Id: " + idPel + "titulo de la pelicula: " + titulo + "Categoria: " +categoria;
        return resultado;
    }



}
