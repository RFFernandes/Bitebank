package br.com.bytebank.banco.Testes.util;

import java.util.ArrayList;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente (1377, 18439);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente (1377, 20993);
		lista.add(cc2);
		
		System.out.println("Tamanho :" + lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		Conta cc3 = new ContaCorrente (1377, 39438);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente (1377, 41672);
		lista.add(cc4);
		
		lista.remove(1);
		
		
		System.out.println("Tamanho: " + lista.size());
		
		for(int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------------------------");
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}

	}

}
