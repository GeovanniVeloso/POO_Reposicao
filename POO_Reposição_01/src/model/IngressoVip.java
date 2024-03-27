package model;

public class IngressoVip extends Ingresso {

	private String profissao;

	public IngressoVip(String profissao) {
		super();
		this.profissao = profissao;
	}

	@Override
	public float valorFinal(float taxa) {
		taxa = 0.18f;
		return (getValor() * taxa) + getValor();
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
