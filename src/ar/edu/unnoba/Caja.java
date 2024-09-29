package ar.edu.unnoba;

import java.util.ArrayList;
import java.util.List;

public class Caja extends Articulo {
    private List<ProductoSimple> productos;

    public Caja() {
    setProductos();
    }

    public List<ProductoSimple> getProductos() {
        return productos;
    }

    public void setProductos() {
        this.productos = new ArrayList<ProductoSimple>();
    }

    @Override
    public float calcularPeso() {
        float peso = 0;
        for (ProductoSimple producto : getProductos()) {
            peso += producto.calcularPeso();
        }
        return peso;
    }

    @Override
    public float calcularPrecio() {
        float precio = 0;
        for (ProductoSimple producto : getProductos()) {
            precio += producto.calcularPrecio();
        }
        return precio;
    }

    public void addProductos(ProductoSimple producto) {
        getProductos().add(producto);
    }



}
