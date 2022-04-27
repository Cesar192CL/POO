/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
    }
    // Se crean metodos
}
