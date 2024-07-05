import java.util.ArrayList;
import java.util.List;
public class Inventario {

    
    
    public List<Producto> Productos = new ArrayList<>();

    //Metodos que posteriormente seran usado en el main,
    public void agregarProducto(Producto producto) {
        Productos.add(producto);
    }

    public void eliminarProducto(int Id) {
        Productos.removeIf(p-> p.Id == Id);
    }

    public Producto buscarProducto(int Id) {
        for (Producto producto : Productos) {
            if (producto.Id == Id) {
                return producto;
            }
        }
        return null;
    }

    public void modificarProducto(int id, String nombre, int cantidades, double precio) {
        Producto producto = buscarProducto(id);
        if (producto != null) {
            producto.nombre = nombre;
            producto.cantidad = cantidades;
            producto.precio = precio;
        } 
    }

    public void rebastecer(int Id, int cantidad) {
        Producto producto = buscarProducto(Id);
        if (producto != null) {
            producto.cantidad += cantidad;
        }
    }

    public void vender(int Id, int cantidad) {
        Producto producto  = buscarProducto(Id);
        if (producto != null) {
            if (producto.cantidad >= cantidad) {
                producto.cantidad -= cantidad;
            } else {
                System.out.println("No hay suficiente Producto para vender");
            }
        }
    }
 
    public void mostrarInventario() {
        for (Producto producto : Productos) {
            System.out.println(producto.toString());
        }
    }

    

    
} 

        


