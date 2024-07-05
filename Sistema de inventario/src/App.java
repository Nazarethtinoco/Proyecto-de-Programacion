public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar productos
        inventario.agregarProducto(new Producto(1, "Producto 1", 10, 10.0));
        inventario.agregarProducto(new Producto(2, "Producto 2", 20, 20.0));
        inventario.agregarProducto(new Producto(3, "Producto 3", 30, 30.0));

        // Mostrar inventario
        inventario.mostrarInventario();

        // Reabastecer
        inventario.reabastecer(1, 5);
        inventario.mostrarInventario();

        // Vender
        inventario.vender(2, 10);
        inventario.mostrarInventario();

        // Modificar
        inventario.modificarProducto(3, "Producto 3 modificado", 40, 40.0);
        inventario.mostrarInventario();

        // Eliminar
        inventario.eliminarProducto(1);
        inventario.mostrarInventario();
    }
}