package model;

public class Tour {

    //Atributos

    private String nombre;
    private String ubicacion;
    private Integer precio;
    private TipoTour tipo;


    public Tour(String nombre, String ubicacion, Integer precio, TipoTour tipo) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.tipo = tipo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public TipoTour getTipo() {
        return tipo;
    }

    public void setTipo(TipoTour tipo) {
        this.tipo = tipo;
    }



    @Override
    public String toString(){
        return "\n===== DATOS DEL TOUR =====" +
                "\nNombre: " + nombre +
                "\nUbicacion: " + ubicacion +
                "\nPrecio: " + precio +
                "\n" + tipo;

    }



}
