/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burbujas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Burbujas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int n;
        System.out.println("INGRESE CUANTOS NUMEROS QUIERE GENERAR: ");
        n=entrada.nextInt();
        int[] numeros=new int[n];
        for(int i=0;i<numeros.length;i++)
        {
        numeros[i]=(int) Math.floor(Math.random()*100 + 1);
        System.out.print(" "+numeros[i]);
        }
        System.out.println(" ");   
        MetodoBurbuja(numeros);
        for(int i=0;i<numeros.length;i++)
        {
            System.out.print(" "+numeros[i]);
        }
        System.out.println(" ");
    }
    
     public static int[] MetodoBurbuja(int arreglo[])
     {
      int aux;
      for(int i=0;i<arreglo.length;i++)
        {
            for(int j=i+1;j<arreglo.length;j++)
            {
                if(arreglo[i]>arreglo[j]) 
                {
                aux=arreglo[i];
                arreglo[i]=arreglo[j];
                arreglo[j]=aux;
                }
            }
        }
         System.out.println("ARREGLO ORDENADO CON EXITO");
     return arreglo;    
     }
    
}

