package desfiosFinaisControle;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner entrada = new Scanner(System.in);
		
		int num1 = random.nextInt(100);
		
		for(int i = 10; i > 0; i--) {
			System.out.print("Digite um n�mero: ");
			int num2 = entrada.nextInt();
			if(num1 > num2 ){
				System.out.println("O n�mero secreto � maior que " + num2 + " e voc� tem mais "
						+ i + " tentativas");
			}
			else if(num1 < num2 ){
				System.out.println("O n�mero secreto � menor que " + num2 + " e voc� tem mais "
						+ i + " tentativas");
			}
			else if(num1 == num2) {
				System.out.println("Parab�ns voc� acertou");
				break;
			}
		};
		entrada.close();
	}

}
