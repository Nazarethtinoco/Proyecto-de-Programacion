import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }

    public Producto buscarProducto(int id) {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }

    public void modificarProducto(int id, String nombre, int cantidad, double precio) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            producto.nombre = nombre;
            producto.cantidad = cantidad;
            producto.precio = precio;
        }
    }

    public void reabastecer(int id, int cantidad) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            producto.cantidad += cantidad;
        }
    }

    public void vender(int id, int cantidad) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            if (producto.cantidad >= cantidad) {
                producto.cantidad -= cantidad;
            } else {
                System.out.println("No hay suficiente stock para vender");
            }
        }
    }

    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public void listarProductos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarProductos'");
    }
}