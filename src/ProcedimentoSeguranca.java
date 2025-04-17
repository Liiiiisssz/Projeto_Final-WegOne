import java.util.Scanner;
public class ProcedimentoSeguranca {
   Scanner leia = new Scanner(System.in);
   private String[] nomes;
   private String[] orientacoes;
   private int contador;
   public ProcedimentoSeguranca() {
       this.nomes = new String[15];
       this.orientacoes = new String[15];
       this.contador = 0;
       System.out.println("===============================================");
       System.out.println("||  ESTA PÁGINA FOI DESENVOLVIDA COM         ||");
       System.out.println("||  O INTUITO DE ADQUIRIR E ENVIAR           ||");
       System.out.println("||  ORIENTAÇÕES SOBRE AS PRÁTICAS DE         ||");
       System.out.println("||  SEGURANÇA NO USO DE EQUIPAMENTOS!        ||");
       System.out.println("===============================================");
       System.out.println(" ");
   }
    public void Cadastrar() {
       if (contador < nomes.length) {
           System.out.println("Insira o nome do equipamento: ");
           nomes[contador] = leia.nextLine();
           System.out.println(" ");
           System.out.println("Insira a sua orientação: ");
           orientacoes[contador] = leia.nextLine();
           System.out.println(" ");
           contador++;
       } else {
           System.out.println("Limite de 15 equipamentos cadastrados atingido.");
       }
   }
 
   public void imprimirOrientacoes() {
       if (contador == 0) {
           System.out.println("Nenhuma orientação cadastrada.");
           return;
       }
      
       for (int i = 0; i < contador; i++) {
           System.out.println("Equipamento: " + nomes[i]);
           System.out.println("Orientação: " + orientacoes[i]);
           System.out.println(" ");
       }
   }
 
   public void imprimirOrientacaoEspecifica() {
       if (contador == 0) {
           System.out.println("Nenhuma orientação cadastrada.");
           return;
       }
       System.out.println("Escolha o número do equipamento para visualizar a orientação (1 a " + contador + "): ");
       int indice = leia.nextInt() - 1;
       leia.nextLine();
       if (indice >= 0 && indice < contador) {
           System.out.println("Equipamento: " + nomes[indice]);
           System.out.println("Orientação: " + orientacoes[indice]);
           System.out.println(" ");
       } else {
           System.out.println("Índice inválido.");
       }
   }
   public void editarInformacao() {
       if (contador == 0) {
           System.out.println("Nenhum equipamento cadastrado para editar.");
           return;
       }
       System.out.println("Escolha o equipamento que deseja editar (1 a " + contador + "): ");
       int indice = leia.nextInt() - 1;
       leia.nextLine();
       if (indice < 0 || indice >= contador) {
           System.out.println("Índice inválido.");
           return;
       }
       System.out.println("Escolha o campo a ser editado:");
       System.out.println("1. Nome");
       System.out.println("2. Orientação");
       int campo = leia.nextInt();
       leia.nextLine();
       switch (campo) {
           case 1:
               System.out.println("Digite o novo nome do equipamento: ");
               nomes[indice] = leia.nextLine();
               break;
           case 2:
               System.out.println("Digite a nova orientação sobre o equipamento: ");
               orientacoes[indice] = leia.nextLine();
               break;
           default:
               System.out.println("Opção inválida.");
       }
   }
   public void menu() {
       int opcao;
       do {
           System.out.println("\nEscolha uma opção:");
           System.out.println("1. Cadastrar equipamento");
           System.out.println("2. Imprimir todas as orientações");
           System.out.println("3. Imprimir orientação específica");
           System.out.println("4. Editar informações");
           System.out.println("5. Sair");
           opcao = leia.nextInt();
           leia.nextLine();
           switch (opcao) {
               case 1:
                   Cadastrar();
                   break;
               case 2:
                   imprimirOrientacoes();
                   break;
               case 3:
                   imprimirOrientacaoEspecifica();
                   break;
               case 4:
                   editarInformacao();
                   break;
               case 5:
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção inválida.");
           }
       } while (opcao != 5);
   }
  
   public static void main(String[] args) {
       ProcedimentoSeguranca ps = new ProcedimentoSeguranca();
       ps.menu();
   }
}

