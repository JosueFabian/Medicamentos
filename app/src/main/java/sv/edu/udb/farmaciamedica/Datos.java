package sv.edu.udb.farmaciamedica;

public class Datos {
    private int Id;
    private String Nombre;
    private String Precio;
    private int Imagen;

    public Datos(int id, String nombre, String precio, int imagen) {
        Id = id;
        Nombre = nombre;
        Precio = precio;
        Imagen = imagen;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String precio) {
        Precio = precio;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
