package taller4_arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Taller4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		Actividad2();
	}
	
	public static void Actividad1() {
		int[][] array = new int [3][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = ThreadLocalRandom.current().nextInt(1, 50);
			}
		}
		System.out.println("Resultado: " + Arrays.toString(array[0]));
		System.out.println("Resultado: " + Arrays.toString(array[1]));
		System.out.println("Resultado: " + Arrays.toString(array[2]));
	}

	public static void Actividad2() {
		String[][] array = new String [4][4];
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Escriba el pais numero: " + (i+1));	
			String country = sc.nextLine();
			array[i][0] = country; 
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				System.out.println("Escriba la ciudad " + (j) + " del pais: " + (i+1));	
				String city = sc.nextLine();
				array[i][j] = city; 
			}
		}
		String ax = "";
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				ax+= array[i][j] + "   ";
			}
			ax+= "\n";
		}
		System.out.println(ax);
//		System.out.println("Resultado: " + Arrays.toString(array[1]));
//		System.out.println("Resultado: " + Arrays.toString(array[2]));
	}
	
	
}