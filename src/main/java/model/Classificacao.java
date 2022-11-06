package model;

public class Classificacao {
	private boolean basico;
	private boolean intermediario;
	private boolean avancado;

	public Classificacao() {
		super();
	}

	public Classificacao(boolean basico, boolean intermediario, boolean avancado) {
		super();
		this.basico = basico;
		this.intermediario = intermediario;
		this.avancado = avancado;
	}

	public boolean isBasico() {
		return basico;
	}

	public void setBasico(boolean basico) {
		this.basico = basico;
	}

	public boolean isIntermediario() {
		return intermediario;
	}

	public void setIntermediario(boolean intermediario) {
		this.intermediario = intermediario;
	}

	public boolean isAvancado() {
		return avancado;
	}

	public void setAvancado(boolean avancado) {
		this.avancado = avancado;
	}

}
