import java.util.Scanner;

public class SistemaCadastroOrientacoes {

	public static String[] Orientacoes_titulos = new String[20];
	public static String[] Orientacoes_tipos = {"Manual Operações", "Procedimento de Segurança", "Manutenção e Reparos",
	                                            "Testes e Diagnósticos", "Manual de Conduta e Operações Setoriais"};
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int decisaoInicial;
		int tipoOrientacao;
		
		System.out.println("-- Bem vindo(a) ao Sistema de --");
		System.out.println("--Cadastro de Orientações WEG!--");

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
		System.out.println("  |5.  ENCERRAR PROGRAMA    |");
		System.out.println("  |_________________________|");
		
		System.out.println(" ");

		System.out.println("  --O que deseja realizar?-- ");
		System.out.print("  --Resposta: ");
		decisaoInicial = leia.nextInt();
		
		System.out.println(" ");
		
		switch(decisaoInicial) {
		
		case 1:
			System.out.println("-- Cadastrar Orientação --");
			System.out.println("1. Manual de Operação");
			System.out.println("2. Procedimento de Segurança");
			System.out.println("3. Manutenção e Reparos");
			System.out.println("4. Testes e Diagnóstico");
			System.out.println("5. Manual de Conduta e Operações Setoriais");
			System.out.print("Escolha o tipo de orientação a ser cadastrado: ");
			tipoOrientacao = leia.nextInt();

			switch(tipoOrientacao){

				case 1:
					
					break;

				case 2: 

					break;

				case 3:
					
					break;

				case 4:

					break;

				case 5:

					break;

				default:
					break;

			}

			break;
		
		case 2:
			System.out.println("-- Pesquisar Orientação --");
			System.out.println("1. Título");
			System.out.println("2. Código");
			System.out.print("Insira o tipo de pesquisa: ");
			break;
			
		case 3:
			System.out.println("-- Editar Orientação --");

			break;
			
		case 4:
			System.out.println("-- Excluir Orientação --");

			break;
		}
	
		leia.close();
		
	}

}
