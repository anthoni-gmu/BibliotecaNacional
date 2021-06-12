package negocio;

public class CategoriaLibro {
    private int idCat;
    private String nombre;

    public CategoriaLibro() {
    }

    public CategoriaLibro(int idCat, String nombre) {
        this.idCat = idCat;
        this.nombre = nombre;
    }

    public int getIdCat() {
        return idCat;
    }

    public void setIdCat(int idCat) {
        this.idCat = idCat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}