/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;
import java.util.Scanner;

public class JavaApplication14 {

    
    public static void main(String[] args) {
      
        Scanner lectura = new Scanner (System.in);

System.out.println("Ingrese su nombre: ");

String nombre = lectura.next();

System.out.println("Ingrese su apellido: ");

String apellido = lectura.next();

System.out.println("Ingrese su edad: ");

int edad = lectura.nextInt();

System.out.println("Ahora ingresa un hobby: ");

String hobby = lectura.next();

System.out.println("¿Cual es tu editor de codigo preferido? ");

String editor = lectura.next();

System.out.println("  ¿ Y cual es tu SO preferido? ");

String sistemaOperativo = lectura.next();

System.out.println("Tu nombre es: " + nombre +" "+ apellido + " y tu edad es: " + edad + " años. Uno"
        + " de tus hobbys es " + hobby + ". Preferis el editor de codigo " +
        editor + ", usando el SO " + sistemaOperativo + ".");

    };
    
};
