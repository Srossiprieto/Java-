package ar.edu.unnoba;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String direccion;
    private List<Contenedor> contenedores;

    public Empresa() {
    }

    public Empresa(String nombre, String direccion) {
        setNombre(nombre);
        setDireccion(direccion);
        setContenedores();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setContenedores() {
        this.contenedores = new ArrayList<Contenedor>();
    }

    public void addContenedores(Contenedor contenedores) {
        getContenedores().add(contenedores);
    }

    public float pesoContenedor(Contenedor contenedor) {
        return contenedor.calcularPeso();
    }

    public float precioContenedor(Contenedor contenedor) {
        return contenedor.calcularPrecio();
    }

    public float pesoTotalContenedor() {
        float pesoTotal = 0;
        for (Contenedor contenedor : getContenedores()) {
            pesoTotal += pesoContenedor(contenedor);
        }
        return pesoTotal;
    }

    public float valorDeTodosLosArticulos(){
        float valorTotal = 0;
        for (Contenedor contenedor : getContenedores()) {
            valorTotal += precioContenedor(contenedor);
        }
        return valorTotal;
    }



}
