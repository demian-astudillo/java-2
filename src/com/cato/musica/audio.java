package com.cato.musica;

public class audio {

    private String nombre;
    private int duración;
    private int totaldemegusta;
    private int cantidad_reproducciones;
    private int clasificacion;

    public void meGusta(){
        this.totaldemegusta ++;
    }

    public void reproducciones(){
            this.cantidad_reproducciones++;
    }
//-----------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public int getTotaldemegusta() {
        return totaldemegusta;
    }

    public void setTotaldemegusta(int totaldemegusta) {
        this.totaldemegusta = totaldemegusta;
    }

    public int getCantidad_reproducciones() {
        return cantidad_reproducciones;
    }

    public void setCantidad_reproducciones(int cantidad_reproducciones) {
        this.cantidad_reproducciones = cantidad_reproducciones;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
