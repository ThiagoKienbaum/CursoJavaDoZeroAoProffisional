package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data nascimento = new Data(10, 07, 1990);
				
		Data inicialUnix = new Data();
		
		
		System.out.printf("Minha data de nascimento � %s e a data inicial Unix � %s.", 
				nascimento.obterDataFormatada(), inicialUnix.obterDataFormatada());
	}
}
