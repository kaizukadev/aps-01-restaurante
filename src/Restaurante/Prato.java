package Restaurante;

public class Prato {
	
	private String nome;
	private double preco;
	private String descricao;

	Ingrediente [] ing = new Ingrediente [3];	
	
	public Prato(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Ingrediente[] getIng() {
		return ing;
	}

	public void setIng(Ingrediente[] ing) {
		this.ing = ing;
	}

}

