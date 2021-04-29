
public class Jogador { // CLASSE ABSTRATA DO JOGADOR
	
	private String nome;
	private int dado1;
	private int dado2;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDado1() {
		return dado1;
	}
	public void setDado1(int dado1) {
		this.dado1 = dado1;
	}
	public int getDado2() {
		return dado2;
	}
	public void setDado2(int dado2) {
		this.dado2 = dado2;
	}
	@Override
	public String toString() { // PRINTA NOME DOS JOGADORES E O VALOR DE AMBOS OS DADOS JOGADOS
		return "\nNome: " + nome + "\ndado 1: " + dado1 + "\ndado 2: " + dado2;
	}
	
	
	
	

}
