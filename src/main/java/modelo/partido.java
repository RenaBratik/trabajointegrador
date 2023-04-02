package modelo;

public class partido {
    private equipo equipo1;
    private equipo equipo2;
    private int golesequipo1;
    private int golesequipo2;

    /*constructor*/

    public partido(equipo equipo1, equipo equipo2, int golesequipo1, int golesequipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesequipo1 = golesequipo1;
        this.golesequipo2 = golesequipo2;
    }
    /*getter y setter*/

    public equipo getEquipo1() {
        return equipo1;
    }

    public equipo getEquipo2() {
        return equipo2;
    }

    public int getGolesequipo1() {
        return golesequipo1;
    }

    public int getGolesequipo2() {
        return golesequipo2;
    }

    public void setEquipo1(equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public void setGolesequipo1(int golesequipo1) {
        this.golesequipo1 = golesequipo1;
    }

    public void setGolesequipo2(int golesequipo2) {
        this.golesequipo2 = golesequipo2;
    }
}
