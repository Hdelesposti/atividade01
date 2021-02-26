package com.mycompany.atividade01;

/**
 *
 * @author Heloiza
 */
public class Aprova {

    boolean dispoGerenteImediato;
    boolean dispoGerenteGeral;
    boolean dispoDiretorFinanceiro;
    boolean dispoDiretorGeral;

    public Aprova(Pagamento pagamento) {

        GerenteImediato fun1 = new GerenteImediato(false);
        dispoGerenteImediato = fun1.getDisponibilidade();

        GerenteGeral fun2 = new GerenteGeral(false);
        dispoGerenteGeral = fun2.getDisponibilidade();

        DiretorFinanceiro fun3 = new DiretorFinanceiro(false);
        dispoDiretorFinanceiro = fun3.getDisponibilidade();

        DiretorGeral fun4 = new DiretorGeral(true);
        dispoDiretorGeral = fun4.getDisponibilidade();

        GerenteImediato gerente = new GerenteImediato(dispoGerenteImediato);
        int res = gerente.aprovaPagamento(pagamento);
        if ((res == 2) || (res == 3)) {
            GerenteGeral gerente1 = new GerenteGeral(dispoGerenteGeral);
            int res1 = gerente1.aprovaPagamento(pagamento);
            if ((res1 == 2) || (res1 == 3)) {
                DiretorFinanceiro diretor = new DiretorFinanceiro(dispoDiretorFinanceiro);
                int res2 = diretor.aprovaPagamento(pagamento);
                if ((res2 == 2) || (res2 == 3)) {
                    DiretorGeral diretor1 = new DiretorGeral(dispoDiretorGeral);
                    diretor1.aprovaPagamento(pagamento);

                } else {
                    System.out.println("");
                }
            } else {
                System.out.println("");
            }
        }
    }

    ;
      
    
        public boolean getDispoGerenteImediato() {
        return dispoGerenteImediato;
    }

    public boolean getDispoGerenteGeral() {
        return dispoGerenteGeral;
    }

    public boolean getDispoDiretorFinanceiro() {
        return dispoDiretorFinanceiro;
    }

    public boolean getDispoDiretorGeral() {
        return dispoDiretorGeral;
    }
}
