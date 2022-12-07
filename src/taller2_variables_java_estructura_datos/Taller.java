package taller2_variables_java_estructura_datos;
import java.util.*;

public class Taller {
	public static void main(String args[]) {
//		actividad1();
//		int notas[];
//		notas = new int[] {1, 4, 3, 5, 2, 4};
//		PromedioAlumno(notas);
//		CrearArray();
		Sum100Numbers();
	}

	public static void actividad1 (){
		int E = 1;
		double D = 1.2;
		char C = 'C';
		
		System.out.println("E es: " + E + " D es: " + D + " C es: " +  C);
	}
	
	/* Actividad 2
	 * Mostrar el promedio de 6 notas de un alumno y
	 * que se ordene de Mayor a menor
	 */
	public static void PromedioAlumno(int args[]) {
		int acc_notas = 0;
		for (int i = 0; i < args.length; i++) {
			acc_notas = args[i] + acc_notas;
		}
		double promedio = acc_notas / args.length;
		System.out.println("El promedio es: " + promedio);
	}
	
	
	public static void CrearArray() {
		Scanner sc = new Scanner(System.in);
		int new_array[] = new int[6];
		for (int i = 0; i < new_array.length; i++) {
			System.out.println("Digite el valor numerico de la posicion: " + (i + 1));
			int number_value = sc.nextInt();
			new_array[i] = number_value;
		}
		int negatives = 0, positives = 0;
		int count_negatives = 0, count_positives = 0;
		for (int i = 0; i < new_array.length; i++) {
			if (new_array[i] > 0) {
				positives = positives + new_array[i];
				count_positives = count_positives + 1;
			} else {
				negatives = negatives + new_array[i];
				count_negatives = count_negatives + 1;
			}
		}

		if (count_positives > 0) {
			System.out.println("El promedio de numeros positivos es: " + positives / count_positives);
		}
		if (count_negatives > 0) {
			System.out.println("El promedio de numeros negativo es: " + negatives / count_negatives);
		}
		System.out.println("El array final es: " + Arrays.toString(new_array));
	}

	public static void Sum100Numbers() {
		int new_array[] = new int[100];
		int sum = 0;
		for (int i = 0; i < new_array.length; i++) {
			new_array[i] = i + 1;
			sum = sum + new_array[i];
		}
		System.out.println("La suma de los 100 numeros es: " + sum);
		System.out.println("y la media es: " + sum / new_array.length);

	}
}


