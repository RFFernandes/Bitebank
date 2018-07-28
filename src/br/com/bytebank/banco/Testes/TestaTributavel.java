package br.com.bytebank.banco.Testes;

import br.com.bytebank.banco.Modelo.*;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1377, 39221);
		cc.deposita(3000.0);
		
		SeguroVida sv = new SeguroVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(sv);
		
		System.out.println(calc.getTotalImposto());

	}

}
