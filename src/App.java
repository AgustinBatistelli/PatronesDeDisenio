import Decorator.BlindajeDecorador;
import Decorator.Cuenta;
import Decorator.CuentaAhorro;
import Decorator.CuentaBancaria;

public class App {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(1, "CuentaTest");

        CuentaBancaria cuenta = new CuentaAhorro();
        CuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

        //cuenta.abrirCuenta(c);
        cuentaBlindada.abrirCuenta(c);
    }
}
