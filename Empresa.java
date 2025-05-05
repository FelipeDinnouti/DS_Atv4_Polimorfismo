public class Empresa {
    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor("Carlos",200, 500);
        Funcionario funcionario = new FreeLancer("Joao", 20,150);
        Funcionario gerente = new Gerente("Leonardo", 400, 200000);

        System.out.println("Salário do Vendedor: " + obterSalarioDoFuncionario(vendedor) + "R$");
        System.out.println("Salário do FreeLancer: " + obterSalarioDoFuncionario(funcionario) + "R$");
        System.out.println("Salário do Gerente: " + obterSalarioDoFuncionario(gerente) + "R$");
    }

    public static double obterSalarioDoFuncionario(Funcionario funcionario) {
        return funcionario.calcularSalarioFinal();
    }
}