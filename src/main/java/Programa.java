package main.java;
import java.util.Scanner;
import main.java.br.com.figueiredoisaac.models.GuardaProdutos;

import main.java.br.com.figueiredoisaac.models.Produto;

public class Programa {

	public static void main(String[] args) {

		GuardaProdutos listaProdutos = new GuardaProdutos();
		boolean contador = true;
		while (contador) {
			System.out.println("Bem-vindo");
			System.out.println("Para adicionar um produto digite 1");
			System.out.println("Para remover um produto digite 2");
			System.out.println("Para consultar um produto digite 3");
			System.out.println("Para listar todos os produto digite 4");
			System.out.println("Para atualizar um produto digite 5");
			System.out.println("Para encerrar digite 6");
			Scanner inputEscolha = new Scanner(System.in);
			int escolha = inputEscolha.nextInt();

			switch (escolha) {
			case 1:
				try {	
				listaProdutos.AdicionaProduto();
				}catch (Exception ex){
					System.out.println("Operação Inválida");
					break;
				}
				break;

			case 2:
				try {
					listaProdutos.RemoverPorId();
				}catch (Exception ex){
					System.out.println("Operação Inválida");
					break;
				}
				break;

			case 3:
				try {
					listaProdutos.ConsultarPorId();
				}catch (Exception ex){
					System.out.println("Operação Inválida");
					break;
				}
				break;

			case 4:
				try {
					listaProdutos.ListarProdutos();
				}catch (Exception ex){
					System.out.println("Operação Inválida");
					break;
				}
				break;
			case 5:
				try {
					listaProdutos.ModificaPorId();
				}catch (Exception ex){
					System.out.println("Operação Inválida");
					break;
				}
				break;

			case 6:
				try {
				contador = false;
				}catch (Exception ex){
					System.out.println("Operação Inválida");
					break;
				}
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
		}System.out.println("Fim do Programa");
	}
}