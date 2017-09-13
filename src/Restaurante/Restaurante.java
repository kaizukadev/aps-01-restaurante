package Restaurante;


public class Restaurante {
	
	private Prato prato1;
	private Prato prato2;
	private Prato prato3;
	
	public Restaurante(Prato prato1, Prato prato2, Prato prato3) {
		this.prato1 = prato1;
		this.prato2 = prato2;
		this.prato3 = prato3;
	}

	public Prato getPrato1() {
		return prato1;
	}

	public Prato getPrato2() {
		return prato2;
	}

	public Prato getPrato3() {
		return prato3;
	}

	public static void mostrarCardapio(Restaurante rest){
		String me = "     ";
		Tools.msg("CARDÁPIO:\n=========\n\n");
		Tools.msg(me + rest.prato1.getNome() + ": " + rest.prato1.getPreco() + "\n");
		Tools.msg(me + rest.prato1.getDescricao() + ".\n\n");
		Tools.msg(me + rest.prato2.getNome() + ": " + rest.prato2.getPreco() + "\n");
		Tools.msg(me + rest.prato2.getDescricao() + ".\n\n");
		Tools.msg(me + rest.prato3.getNome() + ": " + rest.prato3.getPreco() + "\n");
		Tools.msg(me + rest.prato3.getDescricao() + ".\n\n");
	}
	
	public static Pedido criaPedido(Prato [] pedido) {
		return new Pedido(pedido);
	}

}
