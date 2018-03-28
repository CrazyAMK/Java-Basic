/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar anoAtual = Calendar.getInstance() ;
        
        int ano = anoAtual.get(Calendar.YEAR);
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int nasc = teclado.nextInt();
        
        int idade = ano - nasc;
        System.out.println("Sua idade é: "+idade);
        
        if(idade >= 18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }
        
    }
    
}
