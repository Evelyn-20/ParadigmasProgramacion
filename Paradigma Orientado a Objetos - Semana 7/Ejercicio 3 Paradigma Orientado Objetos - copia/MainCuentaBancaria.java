public class MainCuentaBancaria {

    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("123456", "Evelyn Masís", 80);

        System.out.printf("Saldo inicial: %.2f%n", cuenta.consultarSaldo());

        cuenta.depositar(50);

        cuenta.retirar(30);

        cuenta.retirar(200);
    }
}