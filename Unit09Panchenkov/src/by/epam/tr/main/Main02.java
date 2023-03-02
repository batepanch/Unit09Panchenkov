package by.epam.tr.main;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		double x = inputDoubleFromConsole("Введите значение x: ");
		double sum = addition(x);
		
		simplePrint (x, sum);
		richPrint (x, sum);
		

	}	
	
	public static double inputDoubleFromConsole (String message) {
		double x;
		Scanner sc= new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.println("Неверный ввод. " + message);
		}
		x = sc.nextDouble();
		return x;
				
	}
	
	public static double addition(double x) {
		double sum;
		sum = Math.sqrt(Math.pow(Math.E, (2.2 * x))) - Math.abs(Math.sin((Math.PI * x) / (x + (2.0 / 3.0)))) + 1.7;
		return sum;
	}
	
	public static void simplePrint (double x, double sum) {
		System.out.println("Результат выражения при x - " + x + " = " + sum);
	}
	
	public static void richPrint (double x, double sum) {
		System.out.printf("Результат выражения при x - [%.2f] = [%.7f]", x, sum);
	}

}
