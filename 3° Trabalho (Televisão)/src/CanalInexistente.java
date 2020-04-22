public class CanalInexistente extends Exception{
	private int numeroCanal;
	private Televisao televisao;
	
	public CanalInexistente(String mensagem) {
		super(mensagem);
		this.televisao = televisao;
		this.numeroCanal = numeroCanal;
	}
	
	public String getMensagem() {
		return super.getMessage();
	}
	
}