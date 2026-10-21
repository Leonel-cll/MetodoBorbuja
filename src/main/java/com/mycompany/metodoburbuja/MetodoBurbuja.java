/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodoburbuja;
import java.util.Arrays;

/**
 *
 * @author leonel
 */
public class MetodoBurbuja {

   public static void main(String[] args) {
        // CASO DE PRUEBA: Arreglo desordenado para ambos algoritmos
        int[] arregloOriginal = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("=== PRUEBA DEL MÉTODO BURBUJA NORMAL ===");
        int[] copiaBurbujaNormal = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        System.out.println("Antes:  " + Arrays.toString(copiaBurbujaNormal));
        ordenamientoBurbuja(copiaBurbujaNormal);
        System.out.println("Después: " + Arrays.toString(copiaBurbujaNormal));

        System.out.println("\n=== PRUEBA DEL MÉTODO BURBUJA MEJORADA ===");
        int[] copiaBurbujaMejorada = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        System.out.println("Antes:  " + Arrays.toString(copiaBurbujaMejorada));
        ordenamientoBurbujaMejorada(copiaBurbujaMejorada);
        System.out.println("Después: " + Arrays.toString(copiaBurbujaMejorada));
    }

    /**
     * Algoritmo de Ordenamiento Burbuja Normal.
     * Recorre el arreglo varias veces comparando elementos adyacentes.
     */
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, los intercambiamos
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Algoritmo de Ordenamiento Burbuja Mejorado.
     * Utiliza una bandera (intercambiado) para detenerse si el arreglo ya está ordenado,
     * ahorrando iteraciones innecesarias.
     */
    public static void ordenamientoBurbujaMejorada(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambiado;
        
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio de elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    
                    intercambiado = true; // Hubo un cambio
                }
            }
            
            // Si en toda esta vuelta no hubo ningún intercambio, significa que ya está ordenado
            if (!intercambiado) {
                break;
            }
        }
    }
}

