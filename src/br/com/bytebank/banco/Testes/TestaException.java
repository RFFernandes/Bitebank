package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.SaldoInsuficienteException;

public class TestaException {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(1377, 32400);
		cc.deposita(200.0);
		try {
		cc.saca(700.0);
		} catch (Exception ex) {
			System.out.println("deu ruim " + ex.getMessage());
			ex.getStackTrace();
		}
		
		System.out.println(cc.getSaldo());
	}

}
