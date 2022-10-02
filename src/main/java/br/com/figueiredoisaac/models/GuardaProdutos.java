package main.java.br.com.figueiredoisaac.models;

import java.util.ArrayList;
import java.util.Scanner;

public class GuardaProdutos {

	ArrayList<Produto> produtos = new ArrayList<Produto>();

	public void AdicionaProduto() {
		Scanner inputDescricao = new Scanner(System.in);
		System.out.println("Nome do produto: ");

		String descricao = inputDescricao.next();
		Scanner inputValor = new Scanner(System.in);

		System.out.println("Valor do produto: ");
		double valor = inputValor.nextDouble();

		Produto p = new Produto(descricao, valor);
		produtos.add(p);
		System.out.println("Nome do Produto: " + p.getDescricao() + "| ID do produto: " + p.getID()
				+ "| Valor do produto: R$" + p.getPreco());
	}

	public void RemoverPorId() {
		Scanner inputConsulta = new Scanner(System.in);
		System.out.println("Insira o ID do produto: ");
		int consulta = (inputConsulta.nextInt());
		for (Produto p : produtos) {
			if (p.getID() == consulta) {
				produtos.remove(p);
				System.out.println("Concluído");
			}
		}
	}

	public void ConsultarPorId() {
		Scanner inputConsulta = new Scanner(System.in);
		System.out.println("Insira o ID do produto: ");
		int consulta = (inputConsulta.nextInt());
		for (Produto p : produtos) {
			if (p.getID() == consulta) {
				System.out.println("Nome do Produto: " + p.getDescricao() + "| ID do produto: " + p.getID()
						+ "| Valor do produto: R$" + p.getPreco());
			}
		}
	}
	public void ListarProdutos() {
		for (Produto p : produtos) {
			System.out.println("Nome do Produto: " + p.getDescricao() + "| ID do produto: " + p.getID()
						+ "| Valor do produto: R$" + p.getPreco());
		}
	}
	public void ModificaPorId() {
		Scanner inputConsulta = new Scanner(System.in);
		System.out.println("Insira o ID do produto: ");
		int consulta = (inputConsulta.nextInt());
		for (Produto p : produtos) {
			if (p.getID() == consulta) {
				Scanner inputNovaDescricao = new Scanner(System.in);
				System.out.println("Novo nome do produto: ");
				String novaDescricao = inputNovaDescricao.next();
				Scanner inputNovoValor = new Scanner(System.in);
				System.out.println("Novo valor do produto: ");
				double novoValor = inputNovoValor.nextDouble();
				p.setDescricao(novaDescricao);
				p.setPreco(novoValor);
				System.out.println("Nome do Produto: " + p.getDescricao() + "| ID do produto: " + p.getID()
						+ "| Valor do produto: R$" + p.getPreco());
			}
		}
	}
}