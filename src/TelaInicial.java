import java.util.Scanner;

public class TelaInicial {

	public static String[] Orientacoes_titulos = new String[20];
	public static String[] Orientacoes_tipos = {"Manual Operações", "Procedimento de Segurança", "Manutenção e Reparos",
	                                            "Testes e Diagnósticos", "Manual de Conduta e Operações Setoriais"};
	
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		ManualOperacao manualOperacaoPadrao1 = new ManualOperacao();
		
		int decisaoInicial;
		int tipoOrientacao;
		int tipoPesquisa;
		
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
			System.out.println("__________________________________________________");
            System.out.println("|--           CADASTRAR ORIENTAÇÃO             --|");
            System.out.println("|------------------------------------------------|");
            System.out.println("|-- 1. Manual de Operação                      --|");
            System.out.println("|------------------------------------------------|");
            System.out.println("|-- 2. Procedimento de Segurança               --|");
            System.out.println("|------------------------------------------------|");
            System.out.println("|-- 3. Manutenção e Reparos                    --|");
            System.out.println("|------------------------------------------------|");
            System.out.println("|-- 4. Testes e Diagnóstico                    --|");
            System.out.println("|------------------------------------------------|");
            System.out.println("|-- 5. Manual de Conduta e Operações Setoriais --|");
            System.out.println("|________________________________________________|");
            System.out.println(" ");

			System.out.println(" -- Escolha o tipo de orientação a ser cadastrado -- ");
            System.out.print(" --Resposta:");
			tipoOrientacao = leia.nextInt();

			switch(tipoOrientacao){

				case 1:
					manualOperacaoPadrao1.cadastrarManual();
					break;

			}

			break;
		
		case 2:
			System.out.println("________________________________");
            System.out.println("|-- Pesquisar Orientação 🔎   --|");
            System.out.println("|-------------------------------|");
            System.out.println("|-- 1. Título 📖              --|");
            System.out.println("|-------------------------------|");
            System.out.println("|-- 2. Código 🔢              --|");
            System.out.println("|_______________________________|");
			System.out.println(" ");
			
			System.out.print("Insira o tipo de pesquisa: ");
			tipoPesquisa = leia.nextInt();

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
