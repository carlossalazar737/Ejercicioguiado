public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public  void mostrarInformacion(){
        System.out.println("Nombre:" +getNombre() + "\n Precio:" +getPrecio() + "\n categoria:" + getCategoria());

    }
    void mostrarCategoria(){
        String Categoria= categoria;
        System.out.println("Categoria de producto: " + getCategoria());

    }
}