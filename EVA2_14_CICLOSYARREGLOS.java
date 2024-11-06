/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclos.y.arreglos;

/**
 *
 * @author flac3
 */
public class EVA2_14_CICLOSYARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dato,valores[];//un solo arreglo--> valore
        int[]datos,x,y,z;//todos los arreglos
        int[] arreglo= new int [10];
        for(int i = 0; i<10;i++){
          arreglo[i]=(int)(Math.random()* 100);  
        }
        
        //solo imprimir la direccion en mi
        for(int i = 0; i<10;i++){
        
             System.out.print(arreglo[i]+"-");
    }
}
}  

