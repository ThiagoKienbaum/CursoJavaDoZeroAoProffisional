package desfiosFinaisControle;

import java.util.Scanner;

public class maiorDeDez {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int maior = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Digite um n�mero: ");
			int num = entrada.nextInt();
			
			if(num > maior) {
				maior = num;
			}
		}
		System.out.println("O maior n�mero �: " + maior + ".");
		
		entrada.close();
	}
}
