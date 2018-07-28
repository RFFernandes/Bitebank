package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.Modelo.*;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
	
		ContaCorrente cc = new ContaCorrente(1382, 83449);
		cc.deposita(200.0);
		
		ContaPoupanca cp = new ContaPoupanca(1382, 27332);
		cp.deposita(300.0);
	
		
		cc.transfere(50.0, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		

	}

}
