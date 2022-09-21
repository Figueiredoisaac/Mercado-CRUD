import java.util.Scanner;
public class CRUD {

	public static void main(String[] args) {
	
		
		System.out.println("Bem-vindo");
		System.out.println("Para adicionar um produto digite 1");
		System.out.println("Para remover um produto digite 2");
		System.out.println("Para consultar um produto digite 3");
		System.out.println("Para atualizar um produto digite 4");
		Scanner inputEscolha = new Scanner(System.in);
		int escolha = inputEscolha.nextInt();
        switch (escolha){
        	
        case 1:
        	Scanner inputDescricao = new Scanner(System.in);
        	System.out.println("Nome do produto: ");
        	String descricao = inputDescricao.next();
        	Scanner inputValor = new Scanner(System.in);
        	System.out.println("Valor do produto: ");
        	double valor = inputValor.nextDouble();
        	Produto p = new Produto (descricao, valor);
            System.out.println("Nome do Produto: " + p.getDescricao()+ "| ID do produto: " + p.getID() + "| Valor do produto: R$" + p.getPreco());
        	
        	break;
        
        case 2:
        	
        	break;
        
        case 3:
        	
        	break;
        
        case 4:
        	
        	break;
        
        default:
        	System.out.println("Opção Inválida");
        	break;
        }
				
		
        
     
	}
}