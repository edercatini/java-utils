package br.com.objetos;

public class Gerente extends Funcionario<Long> {
	private static final long serialVersionUID = 1L;

	private Integer numeroEquipes;

	public Gerente(Long id, String nome, Double salario, Integer numeroEquipes) {
		super(id, nome, salario);
		this.numeroEquipes = numeroEquipes;
	}

	public Integer getNumeroEquipes() {
		return this.numeroEquipes;
	}

	public void setNumeroEquipes(Integer numeroEquipes) {
		this.numeroEquipes = numeroEquipes;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append("Gerente [numeroEquipes=");
		builder.append(this.numeroEquipes + ", ");
		builder.append(super.toString());

		return builder.toString();
	}
}