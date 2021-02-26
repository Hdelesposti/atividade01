
package com.mycompany.atividade01;

/**
 *
 * @author Heloiza
 */
public class DiretorFinanceiro implements Funcionario {
    boolean disponibilidade; 

   
    public DiretorFinanceiro(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    } 

    @Override
        public int aprovaPagamento(Pagamento pagamento){
        String resposta = "";
        
        if (this.disponibilidade == true){
            if (pagamento.getValor()>1500){
                if (pagamento.getValor()<= 5000){
                     resposta = "Aprovado pelo Diretor Financeiro"; 
            } else{
                return 3;
                }                                                         
            } else{
                System.out.println("Aprovação Emergencial Efetuada Pelo diretor Financeiro");
            } 
        } else {
               
               System.out.println("Diretor Financeiro Indisponivel");
               return 2;
        }
        return 1;
       
    }
    
    
}
