package com.mycompany.atividade01;

/**
 *
 * @author Heloiza
 */
public class Cliente {

    public static void main(String args[]) {

        Pagamento pagamento = new Pagamento(10000);
        Aprova aprova = new Aprova(pagamento);

    }

}
