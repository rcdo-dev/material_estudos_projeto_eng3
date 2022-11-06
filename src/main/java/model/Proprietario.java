package model;

import java.util.Date;

public class Proprietario {
	private String nome;
	private Date data_emprestimo;

	public Proprietario() {
		super();
	}

	public Proprietario(String nome, Date data_emprestimo) {
		super();
		this.nome = nome;
		this.data_emprestimo = data_emprestimo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(Date data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

}
