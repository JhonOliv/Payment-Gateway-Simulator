package models;

import java.util.ArrayList;
import java.util.List;

public class HistoricoCompra {

	private List<Checkout> historicoCompra = new ArrayList<>(); 
	
	public void setHistoricoCompra(Checkout checkout) {
		this.historicoCompra.add(checkout);
	}
}
