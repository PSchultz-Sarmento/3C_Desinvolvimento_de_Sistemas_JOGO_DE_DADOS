import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {
	
	static Random random = new Random();
		
	static Jogador j1 = new Jogador();
	static Jogador j2 = new Jogador();
	


public static void Nomes() { // DEFINE O NOME DOS JOGADORES
	Scanner scan = new Scanner(System.in);

	System.out.println("Insira o nome do jogador 1");
	j1.setNome(scan.next());
	System.out.println("Insira o nome do jogador 2");
	j2.setNome(scan.next());
}
	
	public static void Dado() { // ROLA DADOS EM NUMEROS ENTRE 1 E 6
		j1.setDado1(random.nextInt(6)+1); //ALEATORIZA A JOGADA, E NÃO PERMITE QUE SEJA 0 COMO RESULTADO
		j1.setDado2(random.nextInt(6)+1);
		
		j2.setDado1(random.nextInt(6)+1);
		j2.setDado2(random.nextInt(6)+1);
		
		System.out.println(Tabuleiro.j1);
		System.out.println(Tabuleiro.j2);
		
		Main.Jogada(); // EXECUTA A JOGADA
		
	}

}
