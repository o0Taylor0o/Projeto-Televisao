public class TVJaCadastrada extends Exception{
	private Televisao televisao;
	
	public TVJaCadastrada(String mensagem, Televisao televisao) {
		super(mensagem);
		this.televisao = televisao;
	}
	
	public String getMensagem() {
		return super.getMessage() + "TV de id: " + televisao.getId();
	}
}