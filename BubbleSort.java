/*
Question : Bubble Sort Algorithm
*/

package linearsort;
import java.math.*;
import java.util.*;

public class BubbleSort {
    public static void sort(int[]array){
        
        int swap_count =0;  //to calculate no of time swapping operation : For time complexity study
        int for_count =0;   //to calculate no of time looping operation : For time complexity study
        int temp;   // For swapping elements
        
        for (int i=0;i<array.length-1;i++){
             for (int j=0;j<array.length-1;j++){
                 if (array[j] > array[j+1]){
                    temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    swap_count++;
                    System.out.println("\n");
                        for (int b : array){
                            System.out.print(" " +b +"");    // To see the iteration operation
                        }
                    }
                for_count++;
                }
        }
    
        System.out.println("\n");
     
        System.out.println("Printing Array After Sorting");
            for (int i : array){
                System.out.print(" " +i +"");
            }
            
        System.out.println("\n");
        
        System.out.println("Swap Loop executed " +swap_count +" Times " );
        System.out.println("For Loop executed : " +for_count +" Times" );
    
    }
    public static void main(String[] args) {
        
        int[]array = new int[10];  // Initialize array for 10 elements
        Random ran = new Random(); // Created an object for random no generation
        
        System.out.println("Printing Array elements : without Sorting");    // Adding elements in the array using random number generator
            
            for (int i =0; i<10;i++){
                array[i]= ran.nextInt(100);
                System.out.print(" " +array[i]);
            }
       // int[] array_worst_case = new  int[] {10,9,8,7,6,5,4,3,2,1};   //Pass this array to see the worst case time complexity i.e. O(N^2)
        
       sort(array); // calling sorting method
        
    }
    
}
