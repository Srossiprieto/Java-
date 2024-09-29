package ar.edu.unnoba;


import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private int id;
    private String paisDestino;
    private int pesoMax;
    private List<Articulo> articulos;

    public Contenedor(int id, String paisDestino, int pesoMax) {
        this.id = id;
        this.paisDestino = paisDestino;
        this.pesoMax = pesoMax;
        setArticulos();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos() {
        this.articulos = new ArrayList<Articulo>();
    }

    public void agregarArticulo(Articulo articulo) {
        getArticulos().add(articulo);
    }

    public float calcularPeso() {
        float peso = 0;
        for (Articulo articulo : getArticulos()) {
            peso += articulo.calcularPeso();
        }
        return peso;
    }

    public float calcularPrecio() {
        float precio = 0;
        for (Articulo articulo : getArticulos()) {
            precio += articulo.calcularPrecio();
        }
        return precio;
    }
}
