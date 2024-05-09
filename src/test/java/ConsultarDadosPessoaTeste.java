package test.java;

import main.java.BancoDados;
import org.junit.jupiter.api.*;

public class ConsultarDadosPessoaTeste {

    @BeforeAll
    static void configurarConexao(){
        BancoDados.iniciarConexao();
    }

    @BeforeEach
    void inserirDadosTeste(){
        BancoDados.inserirDados();
    }

    @AfterEach
    void removerDadosTeste(){
        BancoDados.removerDados();
    }

    @Test
    @DisplayName("Valida dados retorno")
    void validarDadosRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDados.finalizarConexao();
    }
}
