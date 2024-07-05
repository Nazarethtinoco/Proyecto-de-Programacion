public class Producto {

//Los atributos de la clase

    public int Id;
    public String nombre;
    public int cantidad;
    public double precio;

   //El contructor
    public Producto(int Id, String nombre, int cantidad, double precio){
        this.Id = Id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;

    }

    @Override
    public String toString() {
        return "Producto(" +
               "Id=" + Id +
               ", nombre='" + nombre + '\'' +
               ", precio=" + precio +
               ')';
    } 


}
