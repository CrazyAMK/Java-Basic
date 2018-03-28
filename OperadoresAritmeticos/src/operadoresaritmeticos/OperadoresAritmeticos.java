/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author eduar
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Operadores Aritméticos
        /*int n1 = 3; 
        int n2 = 5;
        float m = (n1 + n2)/2;
        System.out.println("A média é igual a " + m);*/
        
        
        //Operadores Unários
        /*int numero = 10; 
        int valor =  4 + numero--;
        System.out.println(valor);
        System.out.println(numero);*/
        
        
        //Operadores de Atribuição
        /*int x = 4;
        x += 2; // x = x + 2;
        System.out.println(x);*/
        
        
        //Aredondamento
        /*float v = 8.4f; 
        int ar = (int) Math.round(v);
        System.out.println(ar);*/
        
        
        //Gerador de Numeros Aleatorios
        double aleatorio = Math.random(); 
        int n = (int) (15 + aleatorio * (50-15));
        System.out.println(n);
        
        
    }
    
}
