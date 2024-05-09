package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    @DisplayName("Compara arrays")
    void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};
        int[] terceiroLancamento = {-1, 5, 2, 3, 10};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, terceiroLancamento);
    }

    @Test
    @DisplayName("Validar tipos diferentes de numeros")
    void validarTiposNumerosDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;
        assertEquals(valor, outroValor);
    }

}
