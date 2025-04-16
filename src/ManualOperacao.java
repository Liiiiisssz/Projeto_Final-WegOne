import java.util.Scanner;

public class ManualOperacao {

		Scanner leia = new Scanner(System.in);
		
		private String nome;
		private String descricao;
		
		public ManualOperacao() {
			
			this.nome = "Manual de Operação";
			this.descricao = "Orientações detalhadas sobre o uso correto e eficiente dos equipamentos.";
		}
		
		public void ManualMotores() {
			
			System.out.println("Nome: Manual de Operação de Motores");
		}
		
		public void ManualGeradores() {
			
			System.out.println("Nome: Manual de Operação de Geradores");
			System.out.println(" ");
		}
		
		public void mostrarManuais() {
			
			System.out.println("Escolha um manual para visualisar: ");
			System.out.println("1 - Motores");
			System.out.println("2 - Geradores");
			
			int opcao = leia.nextInt();
			leia.nextLine();
			
			switch (opcao) {
			
			case 1:
				ManualMotores();
			
			case 2:
				ManualGeradores();
				
			default:
				System.out.println("Opção inválida!");	
			}
		}
				
}
