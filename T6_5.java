/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5;

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
        
        float temp[][] = new float [DIES+1][VOLTES];
        
        for (int dia = 1; dia <= DIES; dia++) {
            
            for (int volta = 0; volta < VOLTES; volta++) {
                System.out.println("dia: "+dia+". Volta: "+volta);
                
            }
        }
    }
}
