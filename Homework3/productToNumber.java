/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		int resultado = 1;
   		int n= Integer.parseInt(args[0].toString());
                 int cont =0;
           for (cont=0; cont<n; cont++)  {
resultado = resultado*(cont+1);

                                 
      
   }
 System.out.println( resultado);
}
}