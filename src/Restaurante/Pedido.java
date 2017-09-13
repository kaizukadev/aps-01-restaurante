package Restaurante;

public class Pedido {
	
	int np = 3;
	Prato [] detalhe = new Prato [np];	
	double total;

	public Pedido(Prato[] detalhe) {
		this.detalhe = detalhe;
		this.total = CalculaTotalPedido();
	}

	public Prato[] getDetalhe() {
		return detalhe;
	}

	public void setDetalhe(Prato[] detalhe) {
		this.detalhe = detalhe;
		this.total = CalculaTotalPedido();
	}

	public double getTotal() {
		return total;
	}

	private double CalculaTotalPedido(){
		double tot = 0;
				
		for (int k=0; k<np ; k++)
			tot +=  (detalhe[k] == null) ? 0 : detalhe[k].getPreco();
		return tot;
	}
	
}
