
public class Produto {

	private int id;
	private String descricao;
	private double preco;
	
	
	public Produto(int id, String descricao, double preco){
		setID(id);
		setDescricao(descricao);
		setPreco(preco);	
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id = id;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return this.getDescricao();
	}
	
}

