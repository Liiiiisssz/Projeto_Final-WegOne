import java.util.Scanner;

public class SistemaCadastroOrientacoes {

	public static String[] Orientacoes_titulos = new String[20];
	public static String[] Orientacoes_tipos = {"Manual Operações", "Procedimento de Segurança", "Manutenção e Reparos",
	                                            "Testes e Diagnósticos", "Manual de Conduta e Operações Setoriais"};
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int decisao;
		
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
		System.out.println("  |5.  encerrar programa    |");
		System.out.println("  |_________________________|");
		
		System.out.println(" ");

		System.out.println("  --O que deseja realizar?-- ");
		System.out.print("  --Resposta: ");
		decisao = leia.nextInt();
		
		System.out.println(" ");
		
		switch(decisao) {
		
		case 1:
			System.out.println("-- Cadastrar Orientação --");
			System.out.println("1. Manual de Operação");
			System.out.println("2. Procedimento de Segurança");
			System.out.println("3. Manutenção e Reparos");
			System.out.println("4. Testes e Diagnóstico");
			System.out.println("5. Manual de Conduta e Operações Setoriais");
			System.out.println("Escolha o tipo de orientação: ");
			break;
		
		case 2:
			break;
			
		case 3:
			break;
			
		case 4:
			break;
		}
	
		leia.close();
		
	}

}
