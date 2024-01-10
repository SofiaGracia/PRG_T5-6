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
public class T6_5 {

    public static void main(String[] args) {
//        A un centre meteorològic volem guardar les temperatures d’un mes (31 dies),
//        mesurades 4 voltes al dia (a les 0, 6, 12 i 18 hores de cada dia).Al principi del programa es demanaran totes les temperatures del mes: per cada dia
//        es demanaran les 4 temperatures.

        final int DIES = 31;
        final int VOLTES = 4;

        float temp[][] = new float[DIES + 1][VOLTES];

        for (int dia = 1; dia <= DIES; dia++) {
            System.out.println("Dia "+dia+"\t");

            for (int volta = 0; volta < VOLTES; volta++) {
                temp[dia][volta] = Teclat.lligFloat("Hora " + (volta*6));

            }
        }

        int resposta;
        float sumatemp = 0;

        resposta = Teclat.lligInt("1. Temperatura mitja de un dia demanada per programa.\n2. Temperatura mitja d'una hora demanada per programa.\n3. Temperatura mitja del mes.\n0. Eixir.", 0, 3);

        switch (resposta) {
            case 0:
                break;

            case 1:

                int pregdia = Teclat.lligInt("De quin dia vols saber la temperatura mitja? :", 1, DIES);

                sumatemp = 0;
                for (int volta = 0; volta < VOLTES; volta++) {

                    sumatemp += temp[pregdia][volta];
                }

                System.out.println("Temperatura mitja del dia " + pregdia + " :" + (sumatemp / VOLTES));
                break;

            case 2:

                int preghora = Teclat.lligInt("Hora de la qual es vol saber la temperatura mitja (0,6,12,18): ", 0, 18);
                int volta = (preghora / 6);

                sumatemp = 0;
                for (int dia = 1; dia <= DIES; dia++) {

                    sumatemp += temp[dia][volta];
                }

                System.out.println("Temperatura mitja del mes durant l'hora " + preghora + ": " + (sumatemp / DIES));
                break;

            case 3:

                sumatemp = 0;
                for (int dia = 1; dia <= DIES; dia++) {
                    for (int voltes = 0; voltes < temp.length; voltes++) {
                        sumatemp += temp[dia][voltes];

                    }
                }

                System.out.println("Temperatura mitja del mes durant l'hora: " + (sumatemp / DIES));
                break;

            default:

                System.out.println("Error");
        }

        System.out.println("---Has ixit del programa---");
    }
}
