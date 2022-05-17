package Decorator;

public class CuentaCredito implements CuentaBancaria{
    @Override
    public void abrirCuenta(Cuenta c) {
        System.out.println("-------------------------");
        System.out.println("Se abrio una cuenta Credito");
        System.out.println("Cliente: " + c.getCliente());
    }
}
