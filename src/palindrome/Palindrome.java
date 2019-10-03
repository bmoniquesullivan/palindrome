/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Monique Sullivan
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String original="";
        String reverse="";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or a string to check  if it's a Palindrome");
        original = sc.nextLine();
        
        int lenght = original.length();
        
        for(int i=lenght - 1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)) {
            System.out.println("You typed a palindrome.");
        } else {
            System.out.println("You didn't type a palindrome");
        }
    }
}
    

