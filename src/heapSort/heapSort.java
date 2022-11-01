/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heapSort;

/**
 *
 * @author Mikey
 */
public class heapSort {
     public void heapSort(int[] datos){
        int n = datos.length;
        for(int i=n/2-1; i>=0; i--){
            ordenar(datos, n, i);
        }
        
        for(int i=n-1; i>=0; i--){
            int m=datos[0];
            datos[0]=datos[i];
            datos[i] = m;
            
            ordenar(datos, i, 0);
        }
    }
    
    public void ordenar(int[] datos, int n, int i){
        int m=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && datos[l]>datos[m]){
            m=l;
        }
        if(r<n && datos[r]>datos[m]){
            m=r;
        }
        if(m !=i){
            int mant = datos[i];
            datos[i] = datos[m];
            datos[m] = mant;
            
            ordenar(datos, n, m);
        }
    }
    
    public void imprimirArreglo(int[] a) {
        System.out.println("-------------------------");
        System.out.println("Lista ordenada");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%4d", a[i]);
        }
        System.out.println();
    }
}
