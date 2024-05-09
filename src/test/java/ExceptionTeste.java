package test.java;

import main.java.Conta;
import main.java.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTeste {

    @Test
    void validarExcecaoTransferencia(){

        Conta origem = new Conta("123456", 0);
        Conta destino = new Conta("987654", 250);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
            transferenciaEntreContas.transfere(origem, destino, -1)
        );

        Assertions.assertDoesNotThrow(() ->
                transferenciaEntreContas.transfere(origem, destino, 100)
        );
    }
}
