import java.util.ArrayList;
import java.util.List;

public class TVHD extends Televisao{
	private String modelo;
	
	public TVHD(String id, String modelo) {
		super(id);
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void informarDados() {
		System.out.println("Televisao de id: " + id + " de modelo: " + modelo + " no canal: " + canalAtual.getNome() + " de numero: " + canalAtual.getNumero() + " com volume: " + volumeAtual + ". HD ? " + canalAtual.getHd());
	}
	
	public void cadastrarCanaisHD(List<Canal> canais) {
		for(Canal canal: canais) {
			if(canal.getHd() == true) {
				this.canaisCadastrados.add(canal);
				this.canalAtual = this.canaisCadastrados.get(canaisCadastrados.size()-1);
			}
		}
	}
	
}