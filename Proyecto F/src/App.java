public class App {
    public static void main(String[] args) throws Exception {
           

                 Inventario inventario = new Inventario();

                //Listado del inventario el cual contiene los datos dados por el usuario

                 Producto p1 = new Producto(600, "piñatas", 5, 500);
                 Producto p2 = new Producto(954, "invitaciones", 30, 350);
                 Producto p3 = new Producto(955, "banners", 2, 600);
                 Producto p4 = new Producto(486, "bolsas carameleras", 20, 900);
                 
                 //
                 
                 inventario.agregarProducto(p1);
                 inventario.agregarProducto(p2);
                 inventario.agregarProducto(p3);
                 inventario.agregarProducto(p4);


            

                 inventario.modificarProducto(1, "Producto Modificado" , 15, 150.0);
                



                 inventario.agregarProducto(p1);
                 inventario.agregarProducto(p2);
                 inventario.agregarProducto(p3);
                 inventario.agregarProducto(p4);

                 System.out.println(p1);
                 System.out.println(p2);
                 System.out.println(p3);
                 System.out.println(p4);
                 










    }       
    
}
