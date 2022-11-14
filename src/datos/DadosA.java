/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos;

import java.util.Random;

/**
 *
 * @author Hp
 */
public class DadosA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random numerosAlatorios = new Random();
        //Arrglo de contadores de freecuncia
        int[] frecuencia = new int[7];
        int p=0;
        for (int tiro = 1; tiro <= 60000; tiro++) {
            ++p;
            ++frecuencia[1 + numerosAlatorios.nextInt(6)];
            System.out.println("Dado "+p+";");
            System.out.printf("%5s%10s\n","Cara ", " Frecuencia");

            for (int cara = 1; cara < frecuencia.length; cara++) {
                System.out.printf("%4d%10d\n", cara, frecuencia[cara]);
            }

        }
    }
    }
    

