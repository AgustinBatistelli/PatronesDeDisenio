package Decorator;

public class Cuenta {
    private int id;
    private String cliente;

    public Cuenta(){}

    public Cuenta(int id, String cliente){
        this.id = id;
        this.cliente = cliente;
    }

    public String getCliente(){
        return cliente;
    }
}
