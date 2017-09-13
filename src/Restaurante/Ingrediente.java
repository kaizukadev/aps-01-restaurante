package Restaurante;


public class Ingrediente {
	
	String [] stipo = {"Carne","Legume","Verdura","Tempero","Acompanhamento"};
	
	private String nome;
	private int tipo;
	private boolean obrigatorio;

	public Ingrediente(String nome, int tipo, boolean obrigatorio) {
		this.nome = nome;
		this.tipo = tipo;
		this.obrigatorio = obrigatorio;
	}

	public String getStipo() {
		return stipo[tipo];
	}

	public String getNome() {
		return nome;
	}

	public int getTipo() {
		return tipo;
	}

	public boolean isObrigatorio() {
		return obrigatorio;
	}
}
