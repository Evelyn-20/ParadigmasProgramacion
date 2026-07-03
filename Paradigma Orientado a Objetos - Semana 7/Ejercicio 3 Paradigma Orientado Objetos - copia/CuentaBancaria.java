public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Getters
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.printf("Depósito exitoso. Nuevo saldo: %.2f%n", saldo);
        } else {
            System.out.println("Cantidad inválida para depósito.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.printf("Retiro exitoso. Nuevo saldo: %.2f%n", saldo);
        } else {
            System.out.println("Cantidad inválida para retiro.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String mostrarInformacion() {
        return "Número de cuenta: " + getNumeroCuenta() +
               ", Titular: " + getTitular() +
               ", Saldo: " + String.format("%.2f", getSaldo());
    }
}