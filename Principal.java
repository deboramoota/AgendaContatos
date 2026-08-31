package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "";
		String celular = "";
		String email = "";
		boolean continuar = true;
		
		System.out.println("==========================");
		System.out.println("    AGENDA DE CONTATOS    ");
		System.out.println("          v0.0.0          ");
		System.out.println("==========================");
		
		System.out.println("");
		
		System.out.println();
		System.out.println("1 - Adicionar contato");
		System.out.println("2 - Listar contato");
		System.out.println("3 - Procurar contato");
		System.out.println("4 - Excluir contato");
		System.out.println("5 - Sair");
		System.out.println();
		
		System.out.println("Escolha uma opção: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		
		switch(opcao) {
			case 1:
				System.out.println("Adicionar contato");
				
				System.out.println("Digite o nome: ");
				nome = sc.nextLine();
					
				System.out.println("Digite o celular: ");
				celular = sc.nextLine();
				
				System.out.println("Digite o email: ");
				email = sc.nextLine();
				
				System.out.println("Contato salvo com sucesso!");
				break;
			case 2:
				System.out.println("Listar contato");
				break;
			case 3:
				System.out.println("Procurar contato");
				break;
			case 4:
				System.out.println("Excluir contato");
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
		}
	}
}