package br.com.bytebank.banco.Testes.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		Integer idadeRef = 29; 
		int primitivo = new Integer(21);
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef);
		lista.add(primitivo);
		
		int i1 = lista.get(0);
		Integer i2 = lista.get(1);
		
		System.out.println(i1);
		System.out.println(i2);
		
		
		Integer valorRef = Integer.valueOf(33);
		int valorPri = valorRef.intValue();
		
		System.out.println(valorPri);
		
		Integer iParseado1 = Integer.valueOf("42");
		int iParseado2 = Integer.parseInt("44");
		
		System.out.println(iParseado1);
		System.out.println(iParseado2);
		

	}

}
