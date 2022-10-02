package main.java.br.com.figueiredoisaac.models;

public class Produto {

	private int id;
	private String descricao;
	private double preco;
	private static int total;
	
	public Produto(String descricao, double preco){
		int novoId = Produto.getTotal() + 1; 
		setID(novoId);
		setDescricao(descricao);
		setPreco(preco);
		Produto.total ++;
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
	public static int getTotal() {
		return Produto.total;
	}
	@Override
	public String toString() {
		return this.getDescricao();
	}
	
}

