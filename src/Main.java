import ar.edu.unnoba.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("santino", "hipolito17");
        Contenedor contenedor = new Contenedor(12, "eeuu",123);
        Contenedor contenedor2 = new Contenedor(123, "canada",123);
        ProductoSimple p1 = new ProductoSimple(12, 1000);
        ProductoSimple p2 = new ProductoSimple(14, 2000);
        ProductoSimple p3 = new ProductoSimple(15, 3000);
        ProductoSimple p4 = new ProductoSimple(16, 4000);
        ProductoSimple p5 = new ProductoSimple(17, 5000);
        ProductoSimple p6 = new ProductoSimple(18, 6000);

        Caja caja1 = new Caja();
        caja1.addProductos(p1);
        caja1.addProductos(p2);

        Caja caja2 = new Caja();
        caja2.addProductos(p3);
        caja2.addProductos(p4);

        contenedor.agregarArticulo(caja1);

        contenedor.agregarArticulo(p5);
        contenedor.agregarArticulo(p6);

        contenedor2.agregarArticulo(caja2);

        empresa.addContenedores(contenedor);
        empresa.addContenedores(contenedor2);

        System.out.println(empresa.pesoTotalContenedor());
        System.out.println(empresa.valorDeTodosLosArticulos());

    }
}