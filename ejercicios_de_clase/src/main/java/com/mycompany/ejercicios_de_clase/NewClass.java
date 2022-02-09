/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios_de_clase;

import java.util.Scanner;

/**
 *
 * @author recin
 */
public class NewClass {
    public static void main(String[] args) {
        int n,num,x,count;
        Scanner sc = new Scanner(System.in);
        num = 0;
        System.out.println("Ingrese un numero entero");
        n = sc.nextInt();
        while(n>0){
            num = num + 1;
            
            x=1;
           count = 0;
           
           while(x<=num){
               if(num%x==0){
                   count = count + 1;
               }
               x = x+1;
           }
           if(count == 2){
               System.out.println("El numero " + num +" es primo");
               n = n-1;
           }
        }
    }
}
