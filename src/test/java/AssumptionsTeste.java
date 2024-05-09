package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    @DisplayName("Validar usuario")
    void validarSomenteNoUsuario(){
        Assumptions.assumeTrue("rc_la".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
