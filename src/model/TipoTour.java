package model;

public class TipoTour {
    private String tipo;
    private String duracion;

    public TipoTour(String tipo, String duracion) {
        this.tipo = tipo;
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString(){
        return "Tipo de Tour: " + tipo +
                "\nDuracion: " + duracion;
    }



}
