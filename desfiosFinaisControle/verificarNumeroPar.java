package desfiosFinaisControle;

import java.util.Scanner;

public class verificarNumeroPar {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println("O n�mero " + i + " � par.");
			}
		}
		
		System.out.print("Digite um n�mero: ");
		int num = keyboard.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero: " + num + " � par.");			
		}		
		keyboard.close();
	}
}

