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
public class T6_3 {
    public static void main(String[] args) {
        
//        a) Crea 3 vectors d'enters (v1, v2 i v3) sense reservar memòria (sense indicar la
//        grandària ni posar valors inicials).
            
    int v1[];
    int v2[];
    int v3[];

//    b) Pregunta per teclat quantes dades es volen guardar en els vectors (només 1
//    quantitat, igual per als 3).

    int qdades = Teclat.lligInt("Quantes dades es volen guardar en els vectors?");
    
//    c) Reserva memòria al vector1 amb eixa quantitat d'elements introduïda.
    
    v1 = new int[qdades];
    
//    d) Ompli v1 amb dades introduïdes per teclat.
    
        for (int i = 0; i < v1.length; i++) {
            v1[i] = Teclat.lligInt("Número per a la posició "+i);
            
        }
//e) Copia el vector v1 al vector v2, en una sola operació.
    
    v2  = v1;

//f) Copia el vector v1 al vector v3, copiant component a component. Primer caldrà
//reservar memòria per a v3.    

    v3 = new int [qdades];

        for (int i = 0; i < v3.length; i++) {
            v3[i] = v1[i];
            
        }
        
//g) Mostra per pantalla si v1 és igual a v2, en una sola operació. Fes el mateix per
//a v1 i v3        

//    vore si són iguals amb (==)

    if (v1==v2){
        System.out.println("v1 i v2 són iguals");
    
    }else{
        System.out.println("v1 i v2 no són iguals");
    }
    
    if (v1==v3){
        System.out.println("v1 i v3 són iguals");
    
    }else{
        System.out.println("v1 i v3 no són iguals");
    }
    
//h) Mostra per pantalla si v1 és igual a v3, component a component (però només
//haurà de dir: "vectors iguals" o "vectors diferents").    

    boolean vecdif = false;
    
        for (int i = 0; i < v1.length; i++) {
            if (v1[i]!=v3[i]);
            vecdif = true;
            break;
        }
        
        if(vecdif){
            System.out.println("v1 i v3 no són iguals");
        }else{
            System.out.println("v1 i v3 són iguals");
        }
        
//g) Mostra el que hi ha en cada posició de cada vector (format lliure).
        System.out.println("\tv1\tv2\tv3");
        System.out.println("\t---\t---\t---");
        for (int i = 0; i < v1.length; i++) {
            System.out.println(i + "\t" + v1[i] + "\t" + v2[i] + "\t" + v3[i]);            
        }
        
// j) Que els 3 vectors tinguen 5 elements i tot inicialitzat a -1. Mostra
       qdades = 5;
       v1 = new int[qdades]; 
       v2 = new int[qdades];
       v3 = new int[qdades];
       
        for (int i = 0; i < v3.length; i++) {
            v1[i] = v2[i] = v3[i] = -1;
        }
        
// Mostrar vectors (copiem el codi d'abans ja que encara no sabem fer funcions):
        System.out.println("\tv1\tv2\tv3");
        System.out.println("\t---\t---\t---");
        for (int i = 0; i < v1.length; i++) {
            System.out.println(i + "\t" + v1[i] + "\t" + v2[i] + "\t" + v3[i]);            
        }        
        
    }
}
