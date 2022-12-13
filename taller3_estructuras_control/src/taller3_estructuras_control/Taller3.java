package taller3_estructuras_control;
import java.util.*;
public class Taller3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		Actividad1();
	}
	
	public static void Actividad1 () {
		System.out.println("Digite 1 para ejecuar la suma con una sentencia for \nDigite 2 para ejecutar la sentencia con while\nDigite 3 para comprobar un numero primo");	
		int type_sum = sc.nextInt();
		switch(type_sum) {
			case 1: {
				SumWithFor();
				break;
			}
			case 2: {
				SumWithWhile();
				break;
			}
			case 3: {
				CheckNumber();
				break;
			}
			default: {
				System.out.println("Se ha digitado una opcion no disponible, se ejecutara el tipo 1 Sentencia For: ");	
				SumWithFor();
				break;
				
			}
		}
		
	}
	
	public static void SumWithFor() {
		int check_number = 0;
		do {
			System.out.println("Digite el valor numerico positivo: ");	
			int number_value = sc.nextInt();
			check_number = number_value;
		} while (check_number < 0);
		int sumatoria = 1;
		for (int i = 1; i <= check_number; i++) {
			System.out.println("voy a sumar" + sumatoria + "con" + i);	
			sumatoria = sumatoria + i;
		}
		System.out.println("La suma de entre 1 y el numero: " + check_number + " es: " + sumatoria);	
	}

	public static void SumWithWhile() {
		int check_number = 0;
		do {
			System.out.println("Digite el valor numerico positivo: ");	
			int number_value = sc.nextInt();
			check_number = number_value;
		} while (check_number < 0);
		int sumatoria = 1;
		int i = 1;
		while (i <= check_number) {
			sumatoria = sumatoria + i;
			i++;
		}
		System.out.println("La suma de entre 1 y el numero: " + check_number + " es: " + sumatoria);	
	}
	public static void CheckNumber() {
		System.out.println("Digite el valor numerico positivo: ");	
		int check_number = 0;
		int number_value = sc.nextInt();
		check_number = number_value;
		
		if (check_number == 0 || check_number == 1 || check_number == 4) {
			System.out.println("El numero digitado:  " + check_number + " no es primo");	
		} else {
			boolean isPrimo = true;
			for (int i = 2; i < check_number / 2; i++) {
				if (check_number % 2 == 0) {
					isPrimo = false;
				}
			}
			if (isPrimo) {
				System.out.println("El numero digitado:  " + check_number + " es primo");	
			}

		}
	}
}
