package model;

public class ProfessorTitular extends Professor {

	private int anosInstituicao;
	private double salario;

	public ProfessorTitular(int anosInstituicao, double salario) {
		super();
		this.anosInstituicao = anosInstituicao;
		this.salario = salario;
	}

	@Override
	public double calcSalario() {
		return salario + (salario * (0.05d * (anosInstituicao / 5)));
	}

	public int getAnosInstituicao() {
		return anosInstituicao;
	}

	public void setAnosInstituicao(int anosInstituicao) {
		this.anosInstituicao = anosInstituicao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
