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
        int n,num,x,count;//aqui declaramos las variablea que uaremos
        Scanner sc = new Scanner(System.in);//usamos el scanner para que lea lo ingresado por el usuario
        num = 0;//lo empezamo asi para no halla conflictos depues
        System.out.println("Ingrese un numero entero");
        n = sc.nextInt();// aqui le reacinamos un valor a la varible
        while(n>0){//en el buble decimos que mientra n sea mayor a cero va ha hacer esto
            num = num + 1;//incrementamos la variable
            
            x=1;//la declamos con un vamor icinial asi como variable de control
           count = 0;// la declaramos asi para que no halla conflictos despues
           
           while(x<=num){ // aqui condicionamos que x debe ser menor o igual a num y si eso se cumple va a hacer lo siguiente
               if(num%x==0){// aqui decidimos si el numero en num es primo
                   count = count + 1;//aqui count sera igual a el mismo mas 1 solo si se cumple la condicion de arriba
               }
               x = x+1;//aqui subimos la variable x para que no se quede en un ciclo infinito
           }
           if(count == 2){ // aqui decimos si la variable count es igual a dos esto lo que euire decir es que si los numero ingesado solo tuvieon dos divisores y si los tuvo entonces es primo
               System.out.println("El numero " + num +" es primo");//aqui escribimos en pantalla que es primo
               n = n-1;//aqui la decrementamos siempre y cuando halla un numero primo
           }
        }
    }
}
