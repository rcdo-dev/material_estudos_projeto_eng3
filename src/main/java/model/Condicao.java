package model;

public class Condicao {
	private boolean bom;
	private boolean regular;
	private boolean ruim;

	public Condicao() {
		super();
	}

	public Condicao(boolean bom, boolean regular, boolean ruim) {
		super();
		this.bom = bom;
		this.regular = regular;
		this.ruim = ruim;
	}

	public boolean isBom() {
		return bom;
	}

	public void setBom(boolean bom) {
		this.bom = bom;
	}

	public boolean isRegular() {
		return regular;
	}

	public void setRegular(boolean regular) {
		this.regular = regular;
	}

	public boolean isRuim() {
		return ruim;
	}

	public void setRuim(boolean ruim) {
		this.ruim = ruim;
	}

}
