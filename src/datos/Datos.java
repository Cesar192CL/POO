/*
Cesar Alejandro Cervnates Legarreta
21550871

 */
package datos;

/**
 *
 * @author Hp
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Informacion info = new Informacion("Cesar C,L","SISTEMAS",2);
    //Encapsulamiento
    String NumCom = info.getNombre()+" "+info.getCarrera()+" "+info.getSemestre();
        System.out.println("\nDatos generales alumno(a) : "+ NumCom);
        System.out.println("Hola");
        System.out.println("???????");
    }
    // Se crean metodos
}
