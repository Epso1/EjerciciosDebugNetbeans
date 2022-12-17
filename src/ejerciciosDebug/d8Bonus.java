package ejerciciosDebug;

/*
 * Mediante el uso de puntos de interrupcion e inspeccion de variables descubre que 
 * hace el siguiente programa y explica como lo hace.
 * 
 * 
 */

/********** PROGRAMA QUE CREA UN ARRAY DE ENTEROS DE 7 ELEMENTOS CON VALORES { 52, 11, 41, 5, 33, 27, 9 }, ************
 ********** LUEGO LOS ORDENA DE MENOR A MAYOR Y FINALMENTE MUESTRA EL ARRAY ORDENADO EN UNA LÍNEA CON *****************
 ********** UN ESPACIO DE SEPARACIÓN ENTRE LOS NÚMEROS QUE COMPONEN EL ARRAY ******************************************/

public class d8Bonus {
 
    public static void main(String args[])
    {
        //crea un array de enteros con 7 elementos
        int numeros[] = { 52, 11, 41, 5, 33, 27, 9 };
        //crea la variable n para la longitud del array (en este caso, n=7)
        int n = numeros.length;
        //empieza un bucle desde 0 hasta 6 (recorre los elementos de un array de 7 elementos)
        for (int i = 0; i < n - 1; i++) {
            //empieza un bucle desde 0 hasta 6 (recorre los elementos de un array de 7 elementos)
            for (int j = 0; j < n - i - 1; j++) {
                //si el int que está en la posición j es mayor al int de la siguiente posición(j+1)
                if (numeros[j] > numeros[j + 1]) {
                   //temp es igual al número en la posición j (el número mayor)
                    int temp = numeros[j];
                    //el número menor pasa a la posición anterior del array
                     //(el número que estaba en la posición j+1 pasa a la posición j)
                    numeros[j] = numeros[j + 1];
                    //el número mayor pasa a la posición posterior del array
                     //(el número que estaba en la posición j pasa a la posición j+1)
                    numeros[j + 1] = temp;
                }
            }
        }
       //inicia el método para mostrar el resultado
        muestraPorPantalla(numeros);
    }
    
    public static void muestraPorPantalla(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
