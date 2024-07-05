public class main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto(1, "Producto 1", 10, 100.0);
        Producto p2 = new Producto(2, "Producto 2", 20, 200.0);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        inventario.listarProductos();

        inventario.modificarProducto(1, "Producto Modificado", 15, 150.0);
        inventario.listarProductos();

        inventario.eliminarProducto(2);
        inventario.listarProductos();
    }
}