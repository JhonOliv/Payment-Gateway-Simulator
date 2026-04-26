package models;


public class Produtos {
	
	
	
	public Produtos(String nomeProduto, double preco, int qtdEstoque) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	private String nomeProduto;
	private double preco;
	private int qtdEstoque;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	@Override
	public String toString() {
		return "Produtos [nomeProduto=" + nomeProduto + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque + "]";
	}
	
	
	
}
