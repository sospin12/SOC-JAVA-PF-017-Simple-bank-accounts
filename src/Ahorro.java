public class Ahorro extends Cuenta{

    final int LIMITE_RETIROS_SIN_COMISION = 4;

    public Ahorro(double saldoInicial, double comision){
        super(saldoInicial,comision,0);
    }

    @Override
    public void retirar(double monto) {
        if (saldo < monto) {
            System.out.println("\nSaldo insuficiente");
            consultarSaldo();
        } else if (numeroRetiros <= LIMITE_RETIROS_SIN_COMISION) {
            this.saldo = saldo - monto;
            numeroRetiros++;
            System.out.println("\nRetiro realizado.");
            consultarSaldo();
        } else {
            this.saldo = saldo - monto - this.comision;
            numeroRetiros++;
            System.out.println("\nRetiro realizado.");
            consultarSaldo();
        }
    }

}
