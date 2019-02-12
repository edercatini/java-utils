package br.com.objetos;

public class TesteInstanciaGerente {
	public static void main(String[] args) {
		Funcionario<Long> gerente = new Gerente(1L, "Gerente Teste", 10000.0, 3);
		System.out.println(gerente);
	}
}