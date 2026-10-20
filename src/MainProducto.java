public class MainProducto {
    public static void main(String[] args) {
        Producto P1 = new Producto();
        Producto P2 = new Producto();

        P1.setNombre("Sillas");
        P1.setPrecio(29.99);
        P1.setCategoria("Sala");

        P2.setNombre("Mesa");
        P2.setPrecio(49.99);
        P2.setCategoria("Sala");

        P1.mostrarInformacion();
        P1.mostrarCategoria();
        P2.mostrarInformacion();
        P2.mostrarCategoria();
    }
}
