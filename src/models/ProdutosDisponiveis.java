package models;

import java.util.ArrayList;
import java.util.List;

import Exception.ArrayIsEmptyException;

public class ProdutosDisponiveis {

	private List<Produtos> ProdutoDisponiveis = new ArrayList<Produtos>();
	
	public Produtos getProdutoDisponiveis(String name) throws ArrayIsEmptyException {	
		
		for(Produtos produto: this.ProdutoDisponiveis) {
			
			return produto;
			
		}
		
		return null;
	}
	
	public Produtos getProdutoDisponiveis1(String name) {
		return null;
	}

	public void setProdutoDisponiveis(Produtos produtoDisponiveis) {
		this.ProdutoDisponiveis.add(produtoDisponiveis);
	}

	@Override
	public String toString() {
		return "ProdutosDisponiveis [ProdutoDisponiveis=" + ProdutoDisponiveis + "]";
	}
	
	
}
