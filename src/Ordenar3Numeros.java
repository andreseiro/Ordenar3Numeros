/**
 * 
 * @author andreseiro
 * @version 1.0 Feb 2022
 * 
 *  Lee tres números enteros por consola y los muestra ordenados de forma descendente
 *  
 */

import java.util.Scanner;

public class Ordenar3Numeros {

	public static void main(String[] args) {
		//Declaracion de variables enteras
		int a,b,c;
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
		
		//Leer los números
		System.out.print("Introduzca primer número: "); 
		a = leer.nextInt();
		
		System.out.print("Introduzca segundo número: "); 
		b = leer.nextInt(); 
		
		System.out.print("Introduzca tercer número: "); 
		c = leer.nextInt();
		
		//Realizar las comparaciones para determinar el orden de impresion (mostrar en pantalla)
		//Se usa el if anidado (es decir) uno dentro de otro.
		if (a>b && b>c) { 
			System.out.println(a + ", " + b + ", " + c); 
		} 
		else { 
			if(a>c && c>b) { 
				System.out.println(a + ", " + c + ", " + b);
			}
			else {
				if(b>a && a>c) { 
					System.out.println(b + ", " + a + ", " + c); 
				}
				else { 
					if(b>c && c>a) { 
						System.out.println(b + ", " + c + ", " + a);
					}
					else { 
						if(c>a && a>b) {
							System.out.println( c + ", " + a + ", " + b); 
						} 
						else { 
							if(c>b && b>a) { 
								System.out.println(c + ", " + b + ", " + a);
							}
							else {
								System.out.println(a + ", " + b + ", " + c);
							}
						} 
					}
				}
			}
		}
	}
}
