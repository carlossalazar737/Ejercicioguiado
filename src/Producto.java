public class Producto {
    public String nombre;
    double precio;
    String categoria;
    public  void mostrarInformacion(){
        System.out.println("Nombre:" +nombre + "\n Precio:" +precio + "\n categoria:" + categoria);

    }
    void mostrarCategoria(){
        String Categoria= categoria;
        System.out.println("Categoria de producto: " + Categoria);

    }
}
