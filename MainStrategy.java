package strategyPkg;

public class MainStrategy {

	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 3000);
		System.out.println(umFuncionario.calcularSalarioComImposto());

		Funcionario outroFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR, 2000);
		System.out.println(outroFuncionario.calcularSalarioComImposto());

	}

}
