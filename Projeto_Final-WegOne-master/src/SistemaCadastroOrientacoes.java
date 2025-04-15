import java.util.Scanner;

public class SistemaCadastroOrientacoes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int decisao;
		
		System.out.println("-- Bem vindo(a) ao Sistema de --");
		System.out.println("--Cadastro de Orientações WEG! --");

		System.out.println(" ");
		
		System.out.println("  ___________________________");
		System.out.println("  |1.  Cadastrar Orientação |");
		System.out.println("  |-------------------------|");
		System.out.println("  |2.  Pesquisar Orientação |");
		System.out.println("  |-------------------------|");
		System.out.println("  |3.  Editar Orientação    |");
		System.out.println("  |-------------------------|");
		System.out.println("  |4.  Excluir Orientação   |");
		System.out.println("  |-------------------------|");
		System.out.println("  |5.  encerrar programa    |");
		System.out.println("  |_________________________|");
		
		System.out.println(" ");

		System.out.println("  --O que deseja realizar?-- ");
		System.out.print("  --Resposta: ");
		decisao = leia.nextInt();
		
		switch(decisao) {
		
		case 1:
			break;
		
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		}
		
	}

}
