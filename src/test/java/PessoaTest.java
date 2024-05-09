package test.java;

import main.java.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    @DisplayName("Informar a data de nascimento pra obter a idade atual")
    void getIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020,1,1));
        Assertions.assertEquals(4, pessoa.getIdade());
    }

    @Test
    @DisplayName("Verificar se e maior de 18 anos")
    void ehMaiorDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2000,1,1));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
    }

    @Test
    @DisplayName("Verifica Objeto NUll")
    void validarObjetoNulo(){
        Pessoa p = null;
        Assertions.assertNull(p);

        p = new Pessoa("Lucia", LocalDate.of(2006, 1, 1));
        Assertions.assertNotNull(p);
    }
}