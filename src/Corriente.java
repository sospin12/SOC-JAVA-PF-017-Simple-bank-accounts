public class Corriente extends Cuenta {

    protected double sobregiro;

    public Corriente(double saldoInicial, double interes, double sobregiro) {
        super(saldoInicial, 0, interes);
        this.sobregiro = sobregiro;
    }

    @Override
    public void retirar(double monto) {
        if (saldo + sobregiro >= monto) {
            saldo -= monto;
            numeroRetiros++;
            if (saldo < 0) {
                saldo += (saldo * interes);
                consultarSaldo();
            } else {
                consultarSaldo();
            }
        }

    }
}
