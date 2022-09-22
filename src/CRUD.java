import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {

		Produto[] lista = new Produto[100];
		boolean contador = true;
		while (contador) {
			System.out.println("Bem-vindo");
			System.out.println("Para adicionar um produto digite 1");
			System.out.println("Para remover um produto digite 2");
			System.out.println("Para consultar um produto digite 3");
			System.out.println("Para atualizar um produto digite 4");
			System.out.println("Para encerrar digite 5");
			Scanner inputEscolha = new Scanner(System.in);
			int escolha = inputEscolha.nextInt();

			switch (escolha) {
			case 1:
				Scanner inputDescricao = new Scanner(System.in);
				System.out.println("Nome do produto: ");
				String descricao = inputDescricao.next();
				Scanner inputValor = new Scanner(System.in);
				System.out.println("Valor do produto: ");
				double valor = inputValor.nextDouble();
				Produto p = new Produto(descricao, valor);
				System.out.println("Nome do Produto: " + p.getDescricao() + "| ID do produto: " + p.getID()
						+ "| Valor do produto: R$" + p.getPreco());
				int posicao = (p.getID()-1);
				lista[posicao] = p;
				System.out.println(lista[posicao]);
				break;

			case 2:
				Scanner inputConsulta0 = new Scanner(System.in);
				System.out.println("Insira o ID do produto: ");
				int consulta0 = (inputConsulta0.nextInt()-1);
				lista[consulta0] = null;
				break;

			case 3:
				Scanner inputConsulta1 = new Scanner(System.in);
				System.out.println("Insira o ID do produto: ");
				int consulta1 = (inputConsulta1.nextInt()-1);
				System.out.println("Nome do Produto: " + lista[consulta1].getDescricao() + "| ID do produto: " + lista[consulta1].getID()
						+ "| Valor do produto: R$" + lista[consulta1].getPreco());
				break;

			case 4:
				Scanner inputConsulta2 = new Scanner(System.in);
				System.out.println("Insira o ID do produto: ");
				int consulta2 = (inputConsulta2.nextInt()-1);
				Scanner inputNovaDescricao = new Scanner(System.in);
				System.out.println("Novo nome do produto: ");
				String novaDescricao = inputNovaDescricao.next();
				Scanner inputNovoValor = new Scanner(System.in);
				System.out.println("Novo valor do produto: ");
				double novoValor = inputNovoValor.nextDouble();
				lista[consulta2].setDescricao(novaDescricao);
				lista[consulta2].setPreco(novoValor);
				System.out.println("Nome do Produto: " + lista[consulta2].getDescricao() + "| ID do produto: " + lista[consulta2].getID()
				+ "| Valor do produto: R$" + lista[consulta2].getPreco());
				
				break;

			case 5:
				contador = false;
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
			
		}System.out.println("fim do programa");
	}
}