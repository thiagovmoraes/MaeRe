/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maere;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class MaeRe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Digite um numero, esse numero será um numero que vai descobrir"
                + "se eu sou um cabeção ou não");
        int i = 0;
        Scanner entrada = new Scanner(System.in);
        i = entrada.nextInt();
        
        
        if(i > 0){
            System.out.println("Eu sou um cabeção");
        }else System.out.println("Eu estou testando o GitHub");
    }
    
}
