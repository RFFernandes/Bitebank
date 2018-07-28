package br.com.bytebank.banco.Modelo;

public class GuardadorDeConta {
	
	private Conta[] referencias;
	private int posicaoLivre; 
	
	public GuardadorDeConta() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {
		referencias[this.posicaoLivre] = ref; 
		this.posicaoLivre++;
		}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencias(int pos) {
		return this.referencias[pos];
	}

}
