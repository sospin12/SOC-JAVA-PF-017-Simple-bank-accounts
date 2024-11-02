import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cuenta ahorro1 = new Ahorro(500000, 400);
        Cuenta corriente1 = new Corriente(300000, 0.05, 100000);
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\nEn cúal cuenta quieres realizar las consultas? ");
            System.out.println("1. Ahorros.");
            System.out.println("2. Corriente.");
            System.out.println("3. Finalizar programa. ");
            int c = scan.nextInt();
            scan.nextLine();

            switch (c) {
                case 1:
                    menu(ahorro1);
                    continue;
                case 2:
                    menu(corriente1);
                    continue;
                case 3:
                    System.out.println("FINALIZANDO. ");
                    scan.close();
                    break;
                default:
                    System.out.println("Opcion incurrecta, porfavor siga las instrucciones");
            }
            break;

        }
    }

    public static void menu(Cuenta cuenta) {
        Scanner scan = new Scanner(System.in);
        double monto;

        System.out.println("\nQue desea hacer? ");
        System.out.println("1. Consignar. ");
        System.out.println("2. Retirar. ");
        System.out.println("3. Consultar saldo. ");
        System.out.println("4. finalizar programa. ");
        if (scan.hasNextInt()) {
            int c = scan.nextInt();
            scan.nextLine();
            switch (c) {
                case 1:
                    System.out.println("Cuánto desea depositar? ");
                    monto = scan.nextDouble();
                    scan.nextLine();
                    cuenta.depositar(monto);
                    break;
                case 2:
                    System.out.println("Cuánto desea retirar? ");
                    monto = scan.nextDouble();
                    scan.nextLine();
                    cuenta.retirar(monto);
                    break;
                case 3:
                    cuenta.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Finalzado.");
                    scan.close();
                    break;
                default:
                    System.out.println("Opcion incurrecta, porfavor siga las instrucciones");
            }
            
        }
    }
}
