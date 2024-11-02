import Interfaces.ICuenta; //IMPORT THE INTEREFACE. by secure politics no setters are available.

public abstract class Cuenta implements ICuenta {// IMPLEMENTS ICuneta AND SET cUENTA AS ABSTRACT CLASS

    // ATRIBUTES
    protected double saldo;
    static int numeroConsignaciones;
    static int numeroRetiros;
    protected double comision;
    protected double interes;

    // CONSTRUCTOR
    public Cuenta(double saldoInicial, double comision, double interes) {
        this.saldo=saldoInicial;
        this.comision = comision;
        this.interes = interes;
    }

    // SETTERS AND GETTERS
    public double getSaldo() {// solo se puede ver el valor del saldo, no se puede modificar
        return saldo;
    }

    public static int getNumeroConsignaciones() {// solo se pudee obtener el valor del numero de consignaciones
        return numeroConsignaciones;
    }

    public static int getNumeroRetiros() {// solo se puede ver el numero de retiros
        return numeroRetiros;
    }

    public double getComisiones() { // se puede obtener el valor de comisiones
        return comision;
    }

    public double getInteres() { // se puede obtener el valor del interes
        return interes;
    }

    // METHODS
    @Override
    public void depositar(double monto) {
        this.saldo = saldo + monto;
        numeroConsignaciones++;
        consultarSaldo();
    }

    @Override
    public abstract void retirar(double monto);

    @Override
    public void consultarSaldo() {
        System.out.println("\nSu saldo actualmente es de: " + this.saldo + " COP");
    }

    // @Override

}
