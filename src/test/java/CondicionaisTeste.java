package test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "rc_la")
    void validarSomenteNoUsuario(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "rc_la")
    void naoValidarSomenteNoUsuario(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarNoWindows(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_22)
    void validarNoJava17(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_20, max = JRE.JAVA_22)
    void validarNoJava(){
        Assertions.assertEquals(10, 5+5);
    }
}
