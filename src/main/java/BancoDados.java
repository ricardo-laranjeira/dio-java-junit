package main.java;

import java.util.logging.Logger;

public class BancoDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexao");
    }

    public static void inserirDados(){
        LOGGER.info("Inseriu dados");
    }

    public static void removerDados(){
        LOGGER.info("Removeu dados");
    }
}
