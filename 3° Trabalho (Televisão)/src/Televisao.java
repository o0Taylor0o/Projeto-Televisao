import java.util.ArrayList;

public class Televisao {
	protected String id;
	protected int volumeAtual;
	protected Canal canalAtual;
	protected ArrayList<Canal> canaisCadastrados = new ArrayList<Canal>();
	protected ArrayList<Canal> canaisDisponiveis = new ArrayList<Canal>();
	
	public static final int volumeMax = 10;
	public static final int volumeMin = 0;
	public static final String aumentaVolume = "aumentar";
	public static final String diminuiVolume = "diminuir";
	
	
	public Televisao(String id) {
		this.id = id;
		this.volumeAtual = 5;
	}
	
	public int getVolumeAtual() {
		return volumeAtual;
	}
	public void setVolumeAtual(int volumeAtual) {
		this.volumeAtual = volumeAtual;
	}
	
	public Canal getCanalAtual() {
		return canalAtual;
	}
	public void setCanalAtual(Canal canalAtual) {
		this.canalAtual = canalAtual;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean alterarVolume(String tipoAlteracao) {
		int novoVolume = 0;
		
		if(tipoAlteracao == aumentaVolume) {
			novoVolume = this.volumeAtual + 1;
			if(novoVolume > volumeMax) {
				System.out.println("Volume nao pode ser maior que dez.");
				return false;
			}
		}else if(tipoAlteracao == diminuiVolume) {
			novoVolume = this.volumeAtual - 1;
			if(novoVolume < volumeMin) {
				System.out.println("Volume nao pode ser menor que 0.");
				return false;
			}
		}else {
			System.out.println("Acao invalida!");
			return false;
		}
		this.setVolumeAtual(novoVolume);
		return true;
	}
	
	public void cadastrarCanais(Canal canal) {
		this.canaisCadastrados.add(canal);
	}
	
	public boolean verificarCanal(Canal canal) {
		return this.canaisCadastrados.contains(canal);
	}
	
	public void sintonizar(int numero) throws CanalInexistente{
		Canal canais = this.canaisCadastrados.stream().filter(canal -> canal.getNumero() == numero).findFirst().orElse(null);
		
		if(verificarCanal(canais)) {
			this.canalAtual = canais;
		}else {
			throw new CanalInexistente("Esse canal nao foi cadastrado !");
		}
	}
	
	public void alterarCanal(int alt) {
		if(alt == 1) {
			int i = canaisCadastrados.indexOf(this.canalAtual);
			i = (i + alt) % canaisCadastrados.size();
			i = (i < 0) ? canaisCadastrados.size() + i: i;
			setCanalAtual(this.canaisCadastrados.get(i));
		}else if(alt == -1) {
			int i = canaisCadastrados.indexOf(this.canalAtual);
			i = (i + alt) % canaisCadastrados.size();
			i = (i < 0) ? canaisCadastrados.size() + i: i;
			setCanalAtual(this.canaisCadastrados.get(i));
		}
	}
	
	public void informarDados() {
		System.out.println(toString());
	}
	
	public void grade() {
		for(int i = 0; i < canaisCadastrados.size(); i++) {
			String x = "Canal de nome " + canaisDisponiveis.get(i).getNome() + " de numero " + canaisDisponiveis.get(i).getNumero() + " HD ? " + canaisDisponiveis.get(i).getHd();
			System.out.println(x);
		}
	}
	
	public String toString() {
		return "Televisao de id: " + id + " no canal de nome: " + canalAtual.getNome() + " de numero: " + canalAtual.getNumero() + " com volume: " + volumeAtual + ". HD ? " + canalAtual.getHd();
	}

	public void listaDisponivel() {
		for(int i = 0; i < canaisDisponiveis.size(); i++) {
			System.out.println(canaisDisponiveis.get(i));
		}
	}
}