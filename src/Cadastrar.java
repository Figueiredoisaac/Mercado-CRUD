import java.util.Scanner;
public class Cadastrar {

	public static void main(String[] args) {
		
		
		Scanner inputDescricao = new Scanner(System.in);
        System.out.println("Nome do produto: ");
        String descricao = inputDescricao.next();
        Scanner inputValor = new Scanner(System.in);
        System.out.println("Valor do produto: ");
        double valor = inputValor.nextDouble();
        
        System.out.println(descricao);
        System.out.println(valor);
        
        Produto p = new Produto(1, descricao, valor);
        System.out.println("Nome do Produto " + p.getDescricao()+ "| ID do produto " + p.getID() + "| Valor do produto " + p.getPreco());
	}
}