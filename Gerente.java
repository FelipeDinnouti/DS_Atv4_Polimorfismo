public class Gerente extends Funcionario {
    private double bonus = 1000;
    private double salarioBase;

    public Gerente(String nome, double salarioBase, double bonus) {
        this.bonus = bonus;
        this.salarioBase = salarioBase; 
        this.setNome(nome);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + bonus;
    }
}
