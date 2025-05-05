public class Vendedor extends Funcionario {
    private double salarioBase;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        this.salarioBase = salarioBase;
        this.comissao = comissao;
        this.setNome(nome);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + comissao;
    }
}
