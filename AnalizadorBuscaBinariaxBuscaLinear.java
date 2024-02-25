
package testedebuscabinaria;

import java.text.DecimalFormat;

/**
 *
 * @author Millychurch
 */
public class AnalizadorBuscaBinariaxBuscaLinear {

    public static int contador = 0;
    
    public static int  buscaBinaria(int[] vetor,int inicio, int fim,  int numeroEscolhido){
        
        
        int meio = (inicio+fim)/2;
        
        if(vetor[fim] == vetor[inicio]){
            return -1;
        }
        else if(vetor[meio] == numeroEscolhido){
            contador ++;
            return meio;
        }
        
        else if(numeroEscolhido > vetor[meio]){
            contador ++;
            return buscaBinaria(vetor, meio+1, fim, numeroEscolhido);
        }
       
        else {
            contador ++;
            return buscaBinaria(vetor, inicio, meio-1, numeroEscolhido);
        }
        
        
    }
    
    public static int buscaLinear(int[] vetor, int numeroEscolhido){
        for(int i=0; i<vetor.length;i++){
            
            contador++;
            
            if(numeroEscolhido == vetor[i]){
            
                return i;
                
            }
            
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        
        int i=0;
        int tamVet = 100;
        int numeroEscolhido = tamVet-1;
        int[] vetor = new int[tamVet];
        int posicao;
        DecimalFormat df = new DecimalFormat("00");
         
        //Enchendo o Vetor
        while(i<tamVet){
            vetor[i] = i+1;
            i++;
        }
  
        System.out.println("\nBusca Linear");
        for(i=1;i<=100;i++){
            contador=0;
            buscaLinear(vetor, i);
            System.out.printf( df.format(i) + " -> " + df.format(contador) + "  ");
            if(i%4==0)System.out.printf("\n");
        }
        
        System.out.println("\nBusca Binária");
        for(i=1;i<=100;i++){
            contador=0;
            buscaBinaria(vetor, 0, vetor.length-1, i);
            System.out.printf( df.format(i) + " -> " + df.format(contador) + "  ");
            if(i%4==0)System.out.printf("\n");
        }
        
        /*
        posicao = buscaBinaria(vetor, 0, vetor.length-1, numeroEscolhido);
        
        if(posicao == -1){
            System.out.println("O número escolhido não está no vetor");
        }
        else{
            System.out.println("O núemro escolhido está na posicão: " + posicao);
        }
        */
    }  
}
