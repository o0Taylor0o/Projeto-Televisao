import java.util.ArrayList;
import java.util.List;

public class SmartTV extends Televisao{
	private int polegadas;
	
	public SmartTV(String id, int polegadas) {
		super(id);
		this.polegadas = polegadas;
	}

	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}
	
	public void cadastrarCanais(List<Canal> canais) {
		for(Canal canal: canais) {
			this.canaisCadastrados.add(canal);
			this.canalAtual = this.canaisCadastrados.get(0);
		}
	}
	
	public void cadastrarCanais() {
		cadastrarCanais(this.canaisDisponiveis);
	}

}