package modelo;

public class equipo {
    private String nombre;
    private String descripcion;

    /*Constructor*/

    public equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    /* getter y setter*/    /* Hacerlo con anotaciones de lombok*/

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
