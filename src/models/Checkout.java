package models;

import java.util.ArrayList;
import java.util.List;

import Exception.ArrayIsEmptyException;

public class Checkout {
	
	public Checkout(String nomeComprador, String numeroCartao, String codSeguranca, String dataVencimento, Produtos produtos) {
		// TODO Auto-generated method stub
		setNomeComprador(nomeComprador);
		setNumeroCartao(numeroCartao);
		setCodSeguranca(codSeguranca);
		setDataVencimento(dataVencimento);
		setListaDeProdutos(produtos);
	}

	private int idCheckout = (int) Math.random() * 1000;
	private List<Produtos> listaDeProdutos = new ArrayList<Produtos>();
	private String nomeComprador;
	private String numeroCartao;
	private String codSeguranca;
	private String dataVencimento;
	
	public int getIdCheckout() {
		return idCheckout;
	}
	
	public List<Produtos> getListaDeProdutos() {
		return this.listaDeProdutos;
	}
	public void setListaDeProdutos(Produtos listaDeProdutos) {
		this.listaDeProdutos.add(listaDeProdutos);
	}
	public String getNomeComprador() {
		return nomeComprador;
	}
	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getCodSeguranca() {
		return codSeguranca;
	}
	public void setCodSeguranca(String codSeguranca) {
		this.codSeguranca = codSeguranca;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	public double PagamentoAvista() throws ArrayIsEmptyException{
		
		if(!getListaDeProdutos().isEmpty()) {
		
			double subTotal = 0;
			for (Produtos produto : getListaDeProdutos()) {
					subTotal += produto.getPreco();				
			}
			
			double desconto = (subTotal * 10) / 100;
			return subTotal - desconto;
			
		}else {
			
			throw new ArrayIsEmptyException("Sua lista de produtos está vazia, adicione algum item a compra!");

		}
		
	}
	
public double PagamentoParcelado(int qtdParcelas) throws ArrayIsEmptyException{
		
		if(!getListaDeProdutos().isEmpty()) {
			double subTotal = 0;
			if(qtdParcelas > 1 && qtdParcelas <= 5) {
				
				for (Produtos produto : getListaDeProdutos()) {
						subTotal += produto.getPreco();				
				}
				
				return subTotal;
				
			}else {
				int juros = 7;
				for (Produtos produto : getListaDeProdutos()) {
						subTotal += produto.getPreco();				
				}
				
				subTotal += (subTotal * juros);
				System.out.print("Valor total da compra: " + subTotal);
				return subTotal / qtdParcelas;
			}
			
		}else {
			
			throw new ArrayIsEmptyException("Sua lista de produtos está vazia, adicione algum item a compra!");

		}
		
	}

}
