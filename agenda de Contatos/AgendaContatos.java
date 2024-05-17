package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class AgendaContatos {
	public static void main(String[] args) {
		ArrayList<CadastrarContato> contatos = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Adicionar contato");
			System.out.println("2. Mostrar todos os contatos");
			System.out.println("3. Excluir contato");
			System.out.println("4. Pesquisar contato");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do contato: ");
				String nome = scanner.nextLine();
				System.out.print("Digite o telefone do contato: ");
				String telefone = scanner.nextLine();
				System.out.print("Digite o email do contato: ");
				String email = scanner.nextLine();

				CadastrarContato contato = new CadastrarContato(nome, telefone, email);
				contatos.add(contato);
				System.out.println("Contato adicionado com sucesso!");
				break;

			case 2:
				System.out.println("Contatos:");
				for (CadastrarContato c : contatos) {
					System.out.println(c);
				}
				break;

			case 3:
				System.out.print("Digite o nome do contato a ser excluído: ");
				String nomeExcluir = scanner.nextLine();
				CadastrarContato contatoParaRemover = null;

				for (CadastrarContato c : contatos) {
					if (c.getNome().equalsIgnoreCase(nomeExcluir)) {
						contatoParaRemover = c;
						break;
					}
				}

				if (contatoParaRemover != null) {
					contatos.remove(contatoParaRemover);
					System.out.println("Contato excluído com sucesso!");
				} else {
					System.out.println("Contato não encontrado.");
				}
				break;

			case 4:
				System.out.print("Digite o nome do contato a ser pesquisado: ");
				String nomePesquisar = scanner.nextLine();
				boolean encontrado = false;

				for (CadastrarContato c : contatos) {
					if (c.getNome().equalsIgnoreCase(nomePesquisar)) {
						System.out.println(c);
						encontrado = true;
					}
				}

				if (!encontrado) {
					System.out.println("Contato não encontrado.");
				}
				break;

			case 5:
				System.out.println("Saindo...");
				scanner.close();
				return;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

}
