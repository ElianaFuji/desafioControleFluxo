import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception ex) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
	
		scanner.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws IOException {
	//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroDois < parametroUm) {
			throw new IOException("IOException");
		}else {
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for(int indice = 0; indice < contagem; indice++) {
				System.out.println("Contagem: " + (indice + 1));
			}
		}
	}
}
