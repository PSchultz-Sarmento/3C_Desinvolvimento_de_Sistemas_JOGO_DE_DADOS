public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Tabuleiro.Nomes();
		Tabuleiro.Dado();
			
	}
	
	public static void Jogada() {	
		int jogada1 = Tabuleiro.j1.getDado1() + Tabuleiro.j1.getDado2();
		int jogada2 = Tabuleiro.j2.getDado1() + Tabuleiro.j2.getDado2();
		
		
		if ( jogada1 == 7 ) { // CONDIÇÃO DE VITORIA DO JOGADOR 1
			System.out.println("\n" + Tabuleiro.j1.getNome() + " Ganhou!");
		}
		else if ( jogada2 == 7 ) { // CONDIÇÃO DE VITORIA DO JOGADOR 2
			System.out.println("\n" + Tabuleiro.j2.getNome() + " Ganhou!");
		}
		else if ( jogada1 == jogada2 || jogada1 == 7 && jogada2 ==7) { // CONDIÇÃO DE EMPATE
			System.out.println("Empate");
		}
		else { // DETECTA QUE NINGUEM GANHOU, E REPETE O JOGO, ATÉ QUE ALGUÉM GANHE
			System.out.println("\n Ninguém ganhou, jogando novamente \n");
			Tabuleiro.Dado();
		}
				
	}

}
