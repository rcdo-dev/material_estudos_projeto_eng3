package model;

public class Componente {
	private String titulo;
	private String autor;
	private String origem;
	private String link;
	private Emprestimo emprestimo;
	private Condicao condicao;

	public Componente() {
		super();
	}

	public Componente(String titulo, String autor, String origem, String link) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.origem = origem;
		this.link = link;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}

	public Condicao getCondicao() {
		return condicao;
	}

	public void setCondicao(Condicao condicao) {
		this.condicao = condicao;
	}

}
