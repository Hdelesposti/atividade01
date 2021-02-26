package com.mycompany.atividade01;

/**
 *
 * @author Heloiza
 */
public class DiretorGeral implements Funcionario {

    boolean disponibilidade;

    public DiretorGeral(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public int aprovaPagamento(Pagamento pagamento) {
        String resposta = "";

        if (this.disponibilidade == true) {
            if (pagamento.getValor() > 5000) {
                if (pagamento.getValor() <= 15000) {
                    System.out.println("Aprovado pelo diretor Geral");
                } else {
                    System.out.println("Valor acima do permitido");
                }
            } else {
                System.out.println("Aprovação Emergencial Efetuada pelo Diretor Geral");
            }
        } else {
            System.out.println("Ninguem Disponivel para Aprovar o pagamento");
        }
        return 0;

    }
}
