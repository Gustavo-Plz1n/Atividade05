/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade05;

import java.util.Scanner;

/**
 *
 * @author 322121746
 */
public class Atividade05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        double metro, centimetro;
        System.out.println("Insira o valor em metros");
        metro = leia.nextDouble();
        centimetro = (metro*100);
        
        System.out.println("O valor em centimetros convertido e " + centimetro);
        
        
    }
    
}
