package model;

public class Emprestimo {
	private boolean emprestado;
	private Proprietario proprietario;

	public Emprestimo() {
		super();
	}

	public Emprestimo(boolean emprestado, Proprietario proprietario) {
		super();
		this.emprestado = emprestado;
		this.proprietario = proprietario;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

}
