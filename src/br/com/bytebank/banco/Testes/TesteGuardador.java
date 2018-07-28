package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.GuardadorDeConta;

public class TesteGuardador {

	public static void main(String[] args) {
		GuardadorDeConta guardador = new GuardadorDeConta();
		
		Conta cc = new ContaCorrente (1377, 23991);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente (1377, 23983);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencias(1);
		System.out.println(ref.getNumero());

	}

}
