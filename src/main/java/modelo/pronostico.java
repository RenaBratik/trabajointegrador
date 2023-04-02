package modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class pronostico {
    private String partido;
    private String equipo;
    private int resultadoEnum;
    /* faltan los atributos de clase estaticos (si es que lleva)*/

    /*constructor de la clase*/
    public pronostico(String partido, String equipo, int resultadoenum) {
        this.partido = partido;
        this.equipo = equipo;
        this.resultadoEnum = resultadoenum;
    }
    /* getter and setter*//* setter no se si lleva, hay que fijarse en eso */

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
    /*En el metodo que sigue, tengo la duda si es public static VOID o STRING, ya que esto me puede traer problemas cuando sea llamado desde la clase main o por alguna herencia */
    public static void pronostico() throws IOException {
        String direccionPronostico="C:/Users/renat/Desktop/trabajo integrador/pronostico.csv";
        for(String linea : Files.readAllLines(Paths.get(direccionPronostico))){
            System.out.println(linea);
        }
    }
}
