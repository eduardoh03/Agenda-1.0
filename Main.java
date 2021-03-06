package Lista04.q01;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static BaseDeDados bd = new BaseDeDados();

	public static void main(String[] args) {
				
		do {
			
			int escolha = escolhaOtipoDePessoa();
			if (escolha==0) {
			
			imprimeMenu();
			int opcao = coletarOpcaoDesejada();
			switch (opcao) {
			case 1:
				
					Contato novoContato = criarContato();
					bd.adicionar(novoContato, novoContato);
			
				break;

			case 2:
				imprimeContatos();
				System.out.println("\nVoce deve escolher uma das opcoes para remover");
				opcao = coletarOpcaoDesejada();
				bd.remover(opcao);
				break;

			case 3:
				buscaContato();
				break;
			
			case 4:
				imprimeContatos();
				alteraContato();
				
				break;
				
			case 0:
				System.exit(0);
			default:
				break;
			}
		} 
		else if (escolha==1) {
			imprimeMenu();
		int opcao = coletarOpcaoDesejada();
		switch (opcao) {
		case 1:
			Contato novoContato = criarContato();
			bd.adicionar(novoContato, novoContato);
			break;

		case 2:
			imprimeContatos();
			System.out.println("\nVoce deve escolher uma das opcoes para remover");
			opcao = coletarOpcaoDesejada();
			bd.remover(opcao);
			break;

		case 3:
			buscaContato();
			break;
		
		case 4:
			imprimeContatos();
			alteraContato();
			
			break;
			
		case 0:
			System.exit(0);
		default:
			break;
		}
	} 
			
		}while (true);

	}


	private static void imprimeContatos() {
		for (int posicao = 0; posicao < bd.contatos.length; posicao++) {
			if (bd.buscar(posicao) != null) {
				Contato tmp = bd.buscar(posicao);
				System.out.println(
						posicao + ": NOME: " + tmp.getNome().toUpperCase() + ", TEL: " + tmp.getTelefone() + ", END: " + tmp.getEndereco().toUpperCase() +", DOC: "+tmp.getDoc());
			}
		}
	}

	private static void buscaContato() {
		do {
			System.out.println("\n## Buscar Contato ##");
			System.out.println("(1) Buscar por NOME :");
			System.out.println("(2) Buscar por TELEFONE :");
			System.out.println("(3) Voltar ao menu :\n");
			
			int opcao = coletarOpcaoDesejada();
			if (opcao == 1) {
				System.out.println("Digite o NOME do contato que voce esta procurando: ");
				String nome = sc.nextLine();
				for (int posicao = 0; posicao < bd.contatos.length; posicao++) {
					if (bd.buscar(posicao) != null) {
						Contato tmp = bd.buscar(posicao);
						if (tmp.getNome().toUpperCase().contentEquals(nome.toUpperCase())) {
							System.out.println("====== NOME "+ tmp.getNome().toUpperCase() + " LOCALIZADO ====");
							System.out.println("TELEFONE: " + tmp.getTelefone().toUpperCase()	+ "\nENDERECO: " + tmp.getEndereco().toUpperCase());
							System.out.println("DOC: " +tmp.getDoc());
						} 						
					}
	
				}
				
			}

			if (opcao == 2) {
				System.out.println("Digite o TELEFONE de quem voce esta procurando: ");
				String telefone = sc.nextLine();
				for (int posicao = 0; posicao < bd.contatos.length; posicao++) {
					if (bd.buscar(posicao) != null) {
						Contato tmp = bd.buscar(posicao);
						if (tmp.getTelefone().contentEquals(telefone)) {
							System.out.println("====== Telefone "+ tmp.getTelefone() + " LOCALIZADO ====");
							System.out.println("NOME: " + tmp.getNome().toUpperCase() + "\nENDERECO: " + tmp.getEndereco().toUpperCase());
							System.out.println("DOC: " +tmp.getDoc());
						}
					}
				}
			}

			if (opcao == 3) {
				break;
			}
		} while (true);
	}

	
	private static void alteraContato() {
		System.out.println("Qual Contato voce deseja alterar? ");
		int posicaofinal = coletarOpcaoDesejada();		
		
		do {
			System.out.println("================================");
			System.out.println("======Contato Atual======");
			Contato tmp = bd.buscar(posicaofinal);
			System.out.println("NOME: " + tmp.getNome().toUpperCase() + "| ENDERECO: " + tmp.getEndereco().toUpperCase() + "| TELEFONE: " + tmp.getTelefone().toUpperCase());
			System.out.println("================================");
			System.out.println("\n## Alterar Contato ##");
			System.out.println("(1) Altera NOME :");
			System.out.println("(2) Altera TELEFONE :");
			System.out.println("(3) Altera ENDERECO :\n");
			System.out.println("(4) Voltar ao menu principal. :\n");
			int opcao = coletarOpcaoDesejada();
			if (opcao == 1) {
				System.out.println("Digite o novo NOME: ");
				String nome = sc.nextLine();
				bd.alterarNome(posicaofinal,nome);
			}
			if (opcao == 2) {
				System.out.println("Digite o novo TELEFONE: ");
				String telefone = sc.nextLine();
				bd.alterarTelefone(posicaofinal,telefone);
			}
			if (opcao == 3) {
				System.out.println("Digite o novo ENDERECO: ");
				String endereco = sc.nextLine();
				bd.alterarEndereco(posicaofinal,endereco);
			}

			if (opcao == 4) {
				break;
			}
				}while(true);
			}

	private static int escolhaOtipoDePessoa() {
		System.out.println("Escolhe o tipo de pessoa:\" + \"(0)Jur�dica\" + \" (1)Fisica ");
		return Integer.valueOf(sc.nextLine());
	}
	private static void imprimeMenu() {
		System.out.println("\n::: Agenda :::");
		System.out.println(":::- Menu -:::");
		System.out.println("(1) Adicionar novo contato :");
		System.out.println("(2) Remover novo contato :");
		System.out.println("(3) Buscar contatos:");
		System.out.println("(4) Alterar contato :");
		System.out.println("(0) Sair do programa :");
	}
	private static int coletarOpcaoDesejada() {
		System.out.print("Digite a sua opcao:");
		return Integer.valueOf(sc.nextLine());
	}

	private static Contato criarContato() {
		System.out.print("Digite o nome: ");
		String novoNome = sc.nextLine();
		System.out.print("Digite o telefone: ");
		String novoTelefone = sc.nextLine();
		System.out.print("Digite o endereco: ");
		String novoEndereco = sc.nextLine();
		System.out.println("Digite os dados do documento:");
		String novoDoc = sc.nextLine();

		return new Contato(novoNome, novoTelefone, novoEndereco,novoDoc);
	}
}
