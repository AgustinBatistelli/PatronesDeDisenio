package Decorator;

public abstract class CuentaDecorador implements CuentaBancaria{
    protected  CuentaBancaria cuentaDecorada;

    public CuentaDecorador(CuentaBancaria cuentaDecorada){
        this.cuentaDecorada = cuentaDecorada;
    }

    @Override
    public void abrirCuenta(Cuenta c){
        this.cuentaDecorada.abrirCuenta(c);
    }
}
