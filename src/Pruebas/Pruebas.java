package Pruebas;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] argumentos) {
		System.out.println("Hola Mundo");
		System.out.println("Ingrese tu nombre");
		Scanner NombreUsuario = new Scanner(System.in);
		String Nombre = NombreUsuario.nextLine();
		System.out.println("Chau " + Nombre);

		System.out.println("Ingrese un numero");
		Scanner numero = new Scanner(System.in);
		int n1 = numero.nextInt();
		int n2 = numero.nextInt();
		int suma = n1 + n2;
		System.out.printf("La suma de %s mas %s es: %s",n1,n2,suma);
	}
}
