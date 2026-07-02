import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
		
		
		int escolha = 0;
		
		while(escolha != 5 /*&& escolha <=5*/){
			System.out.println("===== LOJA =====");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Buscar produto");
			System.out.println("4 - Remover produto");
			System.out.println("5 - Sair");

			System.out.printf("%nEscolha uma opção: ");
			
			escolha = sc.nextInt();
			
		}
		
		
		
		sc.close();

		
		
	}

}
