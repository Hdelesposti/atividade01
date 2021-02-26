
package com.mycompany.atividade01;

/**
 *
 * @author Heloiza
 */
public class GerenteGeral implements Funcionario {
    
   boolean disponibilidade;


    public GerenteGeral(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }
      
   
   @Override
    public int aprovaPagamento(Pagamento pagamento){
        String resposta = "";
        
        if ( this.disponibilidade == true){
            if (pagamento.getValor()>500){
                if (pagamento.getValor()<= 1500){
                   System.out.println("Aprovado pelo Gerente Geral"); 
                } else{
                   return 3;
                }
            } else{
                System.out.println("Aprovação Emergencial Efetuada pelo Gerente Geral");
            }
        } else {
            
            System.out.println ("Gerente Geral Indisponivel");
            return 2;
        } 
       return 1;
    }
    
}
