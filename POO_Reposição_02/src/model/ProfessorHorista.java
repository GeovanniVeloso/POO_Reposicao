package model;

public class ProfessorHorista extends Professor {

	private int horasAula;
	private double valorHoraAula;

	public ProfessorHorista(int horasAula, double valorHoraAula) {
		super();
		this.horasAula = horasAula;
		this.valorHoraAula = valorHoraAula;
	}
	
	

	@Override
	public double calcSalario() {
		return valorHoraAula * horasAula;
	}



	public int getHorasAula() {
		return horasAula;
	}

	public void setHorasAula(int horasAula) {
		this.horasAula = horasAula;
	}

	public double getValorHoraAula() {
		return valorHoraAula;
	}

	public void setValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}

}
