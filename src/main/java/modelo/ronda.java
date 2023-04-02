package modelo;

public class ronda {
    private String nro;
    private partido [] partidos;

    /*constructor*/

    public ronda(String nro, partido[] partidos) {
        this.nro = nro;
        this.partidos = partidos;
    }
    /*getter y setter*//*cambiarlo por anotacion de lombok*/

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public partido[] getPartidos() {
        return partidos;
    }

    public void setPartidos(partido[] partidos) {
        this.partidos = partidos;
    }
}
