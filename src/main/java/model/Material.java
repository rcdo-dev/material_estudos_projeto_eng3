package model;

public class Material {
	private String area;
	private Livro livro;
	private Video video;
	private Arquivo arquivo;
	private Classificacao classificacao;

	public Material() {
		super();
	}

	public Material(String area, Livro livro, Video video, Arquivo arquivo) {
		super();
		this.area = area;
		this.livro = livro;
		this.video = video;
		this.arquivo = arquivo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

}
