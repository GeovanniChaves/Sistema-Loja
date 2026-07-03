import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int escolha = 0;
		int totalProdutos = 0;
		boolean continuar = true;
		
		String [] produto = new String [10];
		double [] valor = new double [10];
		
		
		while(escolha != 5){
			
			System.out.println("");
			System.out.println("===== LOJA =====");
			System.out.println("1 - Cadastrar produto");
			System.out.println("2 - Listar produtos");
			System.out.println("3 - Buscar produto");
			System.out.println("4 - Remover produto");
			System.out.println("5 - Sair");

			System.out.printf("%nEscolha uma opção: ");
			
			escolha = sc.nextInt();		
			sc.nextLine();
		

		
			switch(escolha){
				
				case 1:
					
					continuar = true;	
					
					while(continuar && totalProdutos < produto.length){
											
						System.out.println("");
						System.out.println("Nome do Produto: ");
						produto[totalProdutos] = sc.nextLine();
						
						System.out.println("Valor do Produto: ");
						valor[totalProdutos] = sc.nextDouble();
						sc.nextLine();
						
						System.out.println("Cadastro realizado com sucesso!");
						
						System.out.println("Deseja Cadastrar Produto? (S/N)");
						String resposta = sc.nextLine();
						
						if(resposta.equalsIgnoreCase("N")){										
							continuar = false;					
							System.out.println("Cadastro finalizado. Voltando ao menu...");
							
						}else {
							System.out.println("Continuando cadastro...");
							totalProdutos++;
						}
						
						
					}
					
					if(totalProdutos>=produto.length){
						System.out.println("Limite de Produtos Excedido.");
					}
						
					break;
					
					
				case 2:
					
					break;
					
					
				case 3:
					
					break;
					
					
				case 4:
					
					break;
					
					
				case 5:
					
					System.out.println("Saindo do Sistema.");
					break;
					
					
				default:
					System.out.println("");
					System.out.println("Escolha uma opção válida.");
			
			
					
			
			}
			
		}
			
			
			
			sc.close();
			
		}

}
