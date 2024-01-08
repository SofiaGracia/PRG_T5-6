/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5;

import Teclat.Teclat;

/**
 *
 * @author sofia
 */
public class T6_7 {

    public static void main(String[] args) {
        //        7. Fes un programa que guarde en una matriu les notes de programació que han tret
        //        15 alumnes en cadascuna de les 3 avaluacions.

        final int AVA = 3;  //Per a poder comprobar el resultat.
        final int ALU = 4;

        float notes[][] = new float[AVA + 1][ALU + 1];

        for (int aval = 1; aval <= AVA; aval++) {

            System.out.println("Avaluació " + aval+"\n");

            for (int alu = 1; alu <= ALU; alu++) {

                notes[aval][alu] = Teclat.lligFloat("Dis-me la nota de l'alumne " + alu + ": ");

            }
        }
        //    A continuació trau de cada alumne: el número (1 a 15), la nota mitja i quantes suspeses.
        
        System.out.println("ALUMNE\tMITJA\tSUSPESES");

        for (int alu = 1; alu <= ALU; alu++) {
            
            float sumanotes = 0;
            int sus = 0;

            for (int aval = 1; aval <= AVA; aval++) {

                if (notes[aval][alu] < 5) {
                    sus++;
                }

                sumanotes += notes[aval][alu];

            }

            System.out.println(alu +"\t"+ (sumanotes / AVA) +"\t"+ sus);

        }
        
        //També trau de cada avaluació: el número (1 a 3), la nota màxima i la mínima.
        
        float notamin = notes[1][1];

        float notamax = notes[1][1];
        
        System.out.println("AVAL\tMÍNIMA\tMÀXIMA");

        for (int aval = 1; aval <= AVA; aval++) {

            for (int alu = 1; alu <= ALU; alu++) {

                if (notes[aval][alu] < notamin) {

                    notamin = notes[aval][alu];

                }

                if (notes[aval][alu] > notamax) {

                    notamax = notes[aval][alu];

                }
            }

            System.out.println(aval+"\t"+notamin +"\t"+ notamax);

        }

    }
}
