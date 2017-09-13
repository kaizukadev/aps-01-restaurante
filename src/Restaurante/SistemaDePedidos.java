package Restaurante;

public class SistemaDePedidos {

	public static void main(String[] args) {
		
		int np = 3;                            // Nº de Pratos do Cardápio
		int ni = 3;                            // Nº de Ingredientes em cada prato
		int npp = 3;                           // Nº de Pratos no Pedido

		int pedido = 532 ;
		
		Prato [] pratos = new Prato [np];	
		Ingrediente [] ingre = new Ingrediente [ni];	

		pratos[0] = new Prato("Nome do prato 1", 100.00);
		pratos[0].setDescricao("Descrição do prato 1");
		ingre[0] = new Ingrediente("Ingrediente1-Prato1",0,true);
		ingre[1] = new Ingrediente("Ingrediente2-Prato1",2,true);
		ingre[2] = new Ingrediente("Ingrediente3-Prato1",4,false);
		pratos[0].setIng(ingre);

		pratos[1] = new Prato("Nome do prato 2", 200.00);
		pratos[1].setDescricao("Descrição do prato 2");
		ingre[0] = new Ingrediente("Ingrediente1-Prato2",2,true);
		ingre[1] = new Ingrediente("Ingrediente2-Prato2",3,true);
		ingre[2] = new Ingrediente("Ingrediente3-Prato2",5,false);
		pratos[1].setIng(ingre);

		pratos[2] = new Prato("Nome do prato 3", 300.00);
		pratos[2].setDescricao("Descrição do prato 3");
		ingre[0] = new Ingrediente("Ingrediente1-Prato3",0,false);
		ingre[1] = new Ingrediente("Ingrediente2-Prato3",1,true);
		ingre[2] = new Ingrediente("Ingrediente3-Prato3",2,true);
		pratos[2].setIng(ingre);

		Restaurante rest1 = new Restaurante(pratos[0],pratos[1],pratos[2]);    // Cria Cardápio com os 3 pratos
		
		Restaurante.mostrarCardapio(rest1);                                    // Mostra cardápio
		

		//==================================================================== SIMULAÇÃO DE PEDIDO
		
		Prato [] ped_pratos = new Prato [npp];	     						   // Array simulador de pedido
		ped_pratos[0] = pratos[2];
		ped_pratos[1] = pratos[0];
		ped_pratos[2] = pratos[1];
		
		Pedido ped = Restaurante.criaPedido(ped_pratos);
		
		Tools.msg("\n[ PEDIDO Nº: " + ++pedido + " ]\n\n");
		int ci = 0;
		for (int k=0 ; k<npp ; k++) {
			Prato prato = ped.detalhe[k];
			if ( prato == null)
				continue;
			Tools.msg("  - Item " + ++ci + ": " + criaLinhaPrato(prato) + "\n");
		}

		double vlr_recebido = 1000d;
		
		Tools.msg("=============================================================================");
		Tools.msg("\n   Total do Pedido: " + ped.getTotal());
		Tools.msg("\n   Valor recebido.: " + vlr_recebido);
		Tools.msg("\n   Troco..........: " + (vlr_recebido - ped.getTotal()));
		
	} //-------------------------------------------------------------------- Final do Main

	public static String criaLinhaPrato(Prato prato) {
		return prato.getNome() + "    Preço: " + prato.getPreco();
		
	}

}
