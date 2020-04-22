import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws TVJaCadastrada {
		
		Canal c1 = new Canal(10, "Globo", true);
		Canal c2 = new Canal(12, "Record", true);
		Canal c3 = new Canal(8, "Band", true);
		
		Canal c4 = new Canal(10, "Globo", false);
		Canal c5 = new Canal(12, "Record", false);
		Canal c6 = new Canal(8, "Band", false);
		
		Televisao t1 = new SmartTV("LG553",24);
		Televisao t2 = new TVHD("LG448","LED");
		
		t1.cadastrarCanais(c1);
		t1.cadastrarCanais(c2);
		t1.cadastrarCanais(c3);
		t1.cadastrarCanais(c4);
		t1.cadastrarCanais(c5);
		t1.cadastrarCanais(c6);
		
		t2.cadastrarCanais(c1);
		t2.cadastrarCanais(c2);
		t2.cadastrarCanais(c3);
		t2.cadastrarCanais(c4);
		t2.cadastrarCanais(c5);
		t2.cadastrarCanais(c6);
		
		ControleRemoto cr1 = new ControleRemoto();
		
		Scanner scan = new Scanner(System.in);
		int aux;
		System.out.println("Escolha qual tv deseja operar.");
		System.out.println("Digite 1 para SmartTV.");
		System.out.println("Digite 2 para TVHD.");
		aux = scan.nextInt();
		
		int i;
		if(aux == 1) {
			cr1.adicionarTV(t1);
			do {
				System.out.println("Digite 1 para avancar o canal.");
				System.out.println("Digite 2 para voltar um canal.");
				System.out.println("Digite 3 para aumentar o volume.");
				System.out.println("Digite 4 para diminuir o volume.");
				System.out.println("Digite 5 para sintonizar canal.");
				System.out.println("Digite 6 para mostrar a grade de canais.");
				System.out.println("Digite 7 para sair.");
				i = scan.nextInt();
				
				switch(i) {
				case 1:
					cr1.proxCanal();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 2:
					cr1.antCanal();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 3:
					cr1.aumentaVolume();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 4:
					cr1.diminuiVolume();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 5:
					System.out.println("Canais disponiveis para sintonizar.");
					System.out.println();
					for(int j = 0; j < t1.canaisCadastrados.size(); j++) {
						String x = (j+1) + " - " + "Canal de nome " + t1.canaisCadastrados.get(j).getNome() + " de numero " + t1.canaisCadastrados.get(j).getNumero() + " HD ? " + t1.canaisCadastrados.get(j).getHd();
						System.out.println(x);
					}
					System.out.println("Qual canal deseja sintonizar de acordo com a numeracao ?");
					int aux1 = scan.nextInt();
					switch(aux1) {
					case 1:
						cr1.sintonizarCanal(c1);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 2:
						cr1.sintonizarCanal(c2);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 3:
						cr1.sintonizarCanal(c3);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 4:
						cr1.sintonizarCanal(c4);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 5:
						cr1.sintonizarCanal(c5);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 6:
						cr1.sintonizarCanal(c6);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					default:
							System.out.println("Canal inexistente !");	
					}
						break;
				case 6:
					for(int j = 0; j < t1.canaisCadastrados.size(); j++) {
						String x = (j+1) + " - " + "Canal de nome " + t1.canaisCadastrados.get(j).getNome() + " de numero " + t1.canaisCadastrados.get(j).getNumero() + " HD ? " + t1.canaisCadastrados.get(j).getHd();
						System.out.println(x);
					}
						break;
				}
				
			}while(i != 7);
		}else if(aux == 2) {
			int j;
			cr1.adicionarTV(t2);
			do {
				System.out.println("Digite 1 para avancar o canal.");
				System.out.println("Digite 2 para voltar um canal.");
				System.out.println("Digite 3 para aumentar o volume.");
				System.out.println("Digite 4 para diminuir o volume.");
				System.out.println("Digite 5 para sintonizar canal.");
				System.out.println("Digite 6 para mostrar a grade de canais.");
				System.out.println("Digite 7 para sair.");
				j = scan.nextInt();
				
				switch(j) {
				case 1:
					cr1.proxCanal();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 2:
					cr1.antCanal();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 3:
					cr1.aumentaVolume();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 4:
					cr1.diminuiVolume();
					System.out.println("Informacoes atuais.");
					cr1.informarDados();
					System.out.println();
						break;
				case 5:
					System.out.println("Canais disponiveis para sintonizar.");
					System.out.println();
					for(int k = 0; k < t2.canaisCadastrados.size(); k++) {
						String x = (k+1) + " - " + "Canal de nome " + t2.canaisCadastrados.get(k).getNome() + " de numero " + t2.canaisCadastrados.get(k).getNumero() + " HD ? " + t2.canaisCadastrados.get(k).getHd();
						System.out.println(x);
					}
					System.out.println("Qual canal deseja sintonizar de acordo com a numeracao ?");
					int aux1 = scan.nextInt();
					switch(aux1) {
					case 1:
						cr1.sintonizarCanal(c1);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 2:
						cr1.sintonizarCanal(c2);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 3:
						cr1.sintonizarCanal(c3);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 4:
						cr1.sintonizarCanal(c4);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 5:
						cr1.sintonizarCanal(c5);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					case 6:
						cr1.sintonizarCanal(c6);
						System.out.println("Informacoes atuais.");
						cr1.informarDados();
						System.out.println();
							break;
					default:
							System.out.println("Canal inexistente!");	
					}
						break;
				case 6:
					for(int h = 0; h < t1.canaisCadastrados.size(); h++) {
						String x = (h+1) + " - " + "Canal de nome " + t2.canaisCadastrados.get(h).getNome() + " de numero " + t2.canaisCadastrados.get(h).getNumero() + " HD ? " + t2.canaisCadastrados.get(h).getHd();
						System.out.println(x);
					}
						break;
				}
			}while(j != 7);
		}
		

	}

}