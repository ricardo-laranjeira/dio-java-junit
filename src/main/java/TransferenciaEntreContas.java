package main.java;

public class TransferenciaEntreContas {
    public void transfere(Conta origem, Conta destino, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
    }
}
