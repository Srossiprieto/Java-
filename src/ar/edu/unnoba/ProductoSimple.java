package ar.edu.unnoba;

public class ProductoSimple extends Articulo {
    private float peso;
    private float precio;

    public ProductoSimple(float peso, float precio) {
        this.peso = peso;
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public float calcularPeso() {
        return getPeso();
    }

    @Override
    public float calcularPrecio() {
        return getPrecio();
    }

}
