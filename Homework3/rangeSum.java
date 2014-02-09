/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:
Dados 2 numeros (limite inferior y superior), recorra el rango e imprima los numeros dentro de este rango.

*/

public class rangeSum {   

   public static void main(String[] args) {
int cont=0;
		
 int n1= Integer.parseInt(args[0].toString());
 int n2= Integer.parseInt(args[1].toString());

for (cont = n1+1; cont < n2 ; cont++) {

         System.out.println(cont );
      
   }

}
}