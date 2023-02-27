package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("INGRESE UNA CADENA DE UNICAMENTE 3 CARACTERES: ");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        String Entrada_C = entrada;

        char c1 = entrada.charAt(0);
        char c2 = entrada.charAt(1);
        char c3 = entrada.charAt(2);

        int valor1 = (int) c1;
        int valor2 = (int) c2;
        int valor3 = (int) c3;


        if (valor1 +1==valor2 && valor2 +1==valor3 ){

           System.out.println("True");
        }
        else {

            System.out.println("False");
        }


    }
}