package model;

public class Ingresso {

	private String código;
	private float valor;

	public Ingresso() {
		super();
	}
	
	public float valorFinal(float taxa) {
		float valorFinal = (valor * (taxa / 100)) + valor;
		return valorFinal;
	}

	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

}
