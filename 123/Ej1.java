/**
 * Ej1.java
 * Programa simple que pide tres datos de tipo entero por teclado, los guarda y
 * los muestre ordenados (de menor a mayor) por pantalla.
 * Hecho y comentado por Ricardo Esteban.
 * 11/10/2017
 */

import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner teclado = new Scanner(System.in);
	
	int entero1, entero2, entero3;
	
	System.out.println("Escribe un n�mero");
	entero1 = teclado.nextInt();
	
	System.out.println("Escribe otro n�mero");
	entero2 = teclado.nextInt();
	
	System.out.println("Escribe el �ltimo n�mero");
	entero3 = teclado.nextInt();
	
		//En este caso he utilizado el IF para saber cual es el mayor de los 3 n�meros es el mayor
		//Si entero1 es mayor que entero2 y entero 3, ir� primero. Luego quedar� saber si entero2 es mayor que entero3 o al rev�s.
	if (entero1 > entero2) {
			if (entero1 > entero3) {
				System.out.println("El mayor n�mero es " + entero1);
				if (entero2 > entero3) {
					System.out.println("El 2� n�mero es " + entero2);
					System.out.println("El menor n�mero es " + entero3);
										}
				else {
					System.out.println("El 2� n�mero es" + entero3);
					System.out.println("El menor n�mero es " + entero2);
					}
									}			
									
								}
		
		//Si entero2 es mayor que entero1 y entero 3, ir� primero. Luego quedar� saber si entero1 es mayor que entero3 o al rev�s.
	if (entero2 > entero1) {
			if (entero2 > entero3) {
				System.out.println("El mayor n�mero es " + entero2);
				if (entero1 > entero3) {
					System.out.println("El 2� n�mero es " + entero1);
					System.out.println("El menor n�mero es " + entero3);
										}
				else {
					System.out.println("El 2� n�mero es" + entero3);
					System.out.println("El menor n�mero es " + entero1);
					}
									}			
									
								}
		//Si entero3 es mayor que entero2 y entero 1, ir� primero. Luego quedar� saber si entero2 es mayor que entero1 o al rev�s.
	if (entero3 > entero1) {
			if (entero3 > entero2) {
				System.out.println("El mayor n�mero es " + entero3);
				if (entero2 > entero1) {
					System.out.println("El 2� n�mero es " + entero2);
					System.out.println("El menor n�mero es " + entero1);
										}
				else {
					System.out.println("El 2� n�mero es " + entero1);
					System.out.println("El menor n�mero es " + entero2);
					}
									}			
									
								}
		
}
}
