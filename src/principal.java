/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anderson.mazzotti
 */
public class principal {
    
    public static void main(String[] args) {
        
        
    agenda agenda1=new agenda();
    agenda agenda2=new agenda();
    
    agenda1.anotar(12, 12, "Dia da Criança");
    agenda2.anotar(12, 15, "Natal");
    
    agenda1.mostraAnotacao();
    agenda2.mostraAnotacao();
    
    
    
    /* NAO ACEITA MAIS POR CAUSA DO ENCAPSULAMENTO
    
    agenda2.dia=12;
    agenda2.mes=15;
    agenda2.anotacao="Natal";*/
    
    
  
        
        
    }
    
    
    
}
