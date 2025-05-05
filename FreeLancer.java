public class FreeLancer extends Funcionario {
    private int diasTrabalhados;
    private double valorDia;

    public FreeLancer(String nome, int diasTrabalhados, double valorDia) {
        this.diasTrabalhados = diasTrabalhados;
        this.valorDia = valorDia;
        this.setNome(nome);
    }

    @Override
    public double calcularSalarioFinal() {
        return diasTrabalhados * valorDia;
    }
    
}
