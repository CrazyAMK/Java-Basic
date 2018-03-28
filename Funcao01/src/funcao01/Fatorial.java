/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author eduar
 */
public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    
    public void setValor(int n){ //Faz a fatoração
        num = n;
        int f = 1;
        String s = "";
        for(int c = n; c > 1; c--){
            f *=c;
            s += c + " x ";
        }
        s+= "1 = ";
        fat = f;
        formula = s;
        
    }
    
    public int getFatorial(){ //Pega o valor do fatorial
        return fat;
    }
    
    public String getFormula(){ //Pega o valor da Formula
        return formula;
    }
    
}
