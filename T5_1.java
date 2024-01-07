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
public class T5_1 {
    public static void main(String[] args) {
        
        String nomart = Teclat.lligString("Dis-me el nom de l'article: ");
        
        int quan = Teclat.lligInt("Dis-me quantitat d'articles: ");
        
        float preu = Teclat.lligFloat("Dis-me preu d'article: ");
        
        System.out.println(quan+" "+nomart+" a "+preu+" la unitat, són "+(preu*quan));
        
    }
}
