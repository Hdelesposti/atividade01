package com.mycompany.atividade01;

/**
 *
 * @author Heloiza
 */
public class GerenteImediato implements Funcionario {

    boolean disponibilidade;
    Aprova aprova;

    public GerenteImediato(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public int aprovaPagamento(Pagamento pagamento) {

        if (this.disponibilidade == true) {
            if (pagamento.getValor() > 0) {
                if (pagamento.getValor() <= 500) {
                    System.out.println("Aprovado pelo Gerente Imediato");
                } else {
                    return 3;
                }
            } else {
                System.out.println("Valor do Pagamento não deve ser 0");
            }
        } else {
            System.out.println("Gerente Imediato Indisponível");
            return 2;
        }
        return 1;
    }

}
