public class MainProducto {
    public static void main(String[] args){
        Producto P1 = new Producto();
        Producto P2 = new Producto();
        P1.nombre = "Sillas";
        P1.precio = 29.99;
        P1.categoria = "Sala";
        P2.nombre = "Mesa";
        P2.precio = 49.99;
        P2.categoria = "Sala";
        P1.mostrarInformacion();
        P1.mostrarCategoria();
        P2.mostrarInformacion();
        P2.mostrarCategoria();
    }
}
