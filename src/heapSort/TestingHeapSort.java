/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heapSort;

/**
 *
 * @author Mikey
 */
public class TestingHeapSort {
    
    public static void main(String[] args) {
        int[]arreglo = new int[10];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = (int)(Math.random()*100);
        }
        
        heapSort h = new heapSort();
        System.out.println("Programa que ejeucta un algoritmo de HeapSort: ");
        /*Este programa esta orientado a obejtos para ir practicando esta modalidad.*/
        
        h.heapSort(arreglo);
        h.ordenar(arreglo, 0, 0);
        h.imprimirArreglo(arreglo);
    }
    
}
