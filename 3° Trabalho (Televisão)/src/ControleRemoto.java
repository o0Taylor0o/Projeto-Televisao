import java.util.ArrayList;
import java.util.List;

public class ControleRemoto {
	private List<Televisao> tvs = new ArrayList<Televisao>();
	
	public void ControleRemeto() {
		this.tvs = new ArrayList<Televisao>();
	}

	public List<Televisao> getTvs() {
		return tvs;
	}
	public void setTvs(List<Televisao> tvs) {
		this.tvs = tvs;
	}
	
	public void adicionarTV(Televisao televisao) throws TVJaCadastrada{
		if(this.tvs.contains(televisao)) {
			throw new TVJaCadastrada("Essa televisao ja esta cadastrada! ",  televisao);
		}else {
			this.tvs.add(televisao);
		}
	}
	
	public void aumentaVolume() {
		this.tvs.forEach(televisao -> televisao.alterarVolume("aumentar"));
	}
	
	public void diminuiVolume() {
		this.tvs.forEach(televisao -> televisao.alterarVolume("diminuir"));
	}
	
	public void sintonizarCanal(Canal canal) {
		this.tvs.forEach(televisao -> {
			try {
				televisao.sintonizar(canal.getNumero());
			}catch(CanalInexistente e){
				System.err.println(e.getMensagem());
			}
				
	});
	}
	
	public void proxCanal() {
		this.tvs.forEach(televisao -> televisao.alterarCanal(1));
	}
	
	public void antCanal() {
		this.tvs.forEach(televisao -> televisao.alterarCanal(-1));
	}
	
	public void informarDados() {
		this.tvs.forEach(televisao -> {
			televisao.informarDados();
		});
	}
	
	public void grade() {
		this.tvs.forEach(televisao -> televisao.grade());
	}
}