package fundamentos.DesafiosFinaisFundamentos;

import java.util.Scanner;

public class CalculoQuadradoECubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		double num = entrada.nextDouble();
		double quad = Math.pow(num, 2);
		double cub = Math.pow(num, 3);
		
		System.out.printf("O n�mero %.1f ao quadrado � %.1f e ao cubo %.1f", num, quad, cub);
		
		entrada.close();
	}	
}
