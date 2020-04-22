public class Canal {
	private int numero;
	private String nome;
	private boolean hd;
	
	public Canal(int numero, String nome, boolean hd) {
		this.hd = hd;
		this.nome = nome;
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean getHd() {
		return hd;
	}
	public void setHd(boolean hd) {
		this.hd = hd;
	}
	
	
}