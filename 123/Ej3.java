import java.util.Scanner;

/**
 * 
 * Hecho y comentado por Ricardo Esteban
 * Escribe un programa simple que lea exactamente ocho n�meros enteros y luego escriba la suma de todos ellos.
 * No hay que guardar los valores individualmente; s�lo su suma acumulada.
 * Debe realizarse utilizando un bucle.
 * 20/10/2017
 */

import java.util.Scanner;
public class Ej3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int contador = 0;
		int sumatotal = 0;
		
		//En este bucle estamos indicando que se "repita" siempre y cuando el n�mero de cifras sea inferior a 8.
		while (contador < 8) {
			
			System.out.println("Introduce un n�mero: ");
			int entrada = teclado.nextInt();
			
			contador++;
			sumatotal = sumatotal + entrada;
		}
		
		//Ahora sumar� todos los n�meros introducidos anteriormente.
		System.out.println("El total es: " + sumatotal);

	}

}

