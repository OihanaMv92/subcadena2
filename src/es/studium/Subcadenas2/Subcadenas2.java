package es.studium.Subcadenas2;

import java.util.Scanner;

public class Subcadenas2
{

	public static void main(String[] args)
	{

        Scanner teclado = new Scanner(System.in);
        String cadena;
        int posicion;
        System.out.println("Escriba un texto:");
        cadena = teclado.nextLine();
        System.out.println("Indique un valor numérico:");
        posicion = teclado.nextInt();
        System.out.println (cadena.substring((cadena.length()-posicion),cadena.length()));
        teclado.close();
}
}
