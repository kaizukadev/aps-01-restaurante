package Restaurante;

public class SistemaDePedidos {

	public static void main(String[] args) {

		Prato p1 = new Prato("Nome do prato 1", 100.00);
		p1.setDescricao("Descrição do prato 1");
		
		Prato p2 = new Prato("Nome do prato 2", 200.00);
		p2.setDescricao("Descrição do prato 2");
		
		Prato p3 = new Prato("Nome do prato 3", 300.00);
		p3.setDescricao("Descrição do prato 3");

		Restaurante rest1 = new Restaurante(p1,p2,p3);
		
		Restaurante.mostrarCardapio(rest1);
		
	}

}
