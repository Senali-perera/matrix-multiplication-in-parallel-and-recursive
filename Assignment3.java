/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.concurrent.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Senali Perera
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static int MAX = 100;  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
     System.out.print("Input a value for n of nxn matrices :"); 
int n = input.nextInt();
System.out.println(); 
        int row1 = n, col1 = n, row2 = n, col2 = n; 
        int [][]A = new int[MAX][MAX]; 
        int [][]B = new int[MAX][MAX]; 
        int[][] C = new int[MAX][MAX]; 
		
                 Random rand = new Random();


    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            A[i][j]=rand.nextInt(10);
        }
    }
    System.out.print("First Matrix : "); 
    System.out.println(); 
for (int i = 0; i < row1; i++) 
		{ 
			for (int j = 0; j < col2; j++) 
				System.out.print(A[i][j]+" "); 

			System.out.println(); 
		} 
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            B[i][j]=rand.nextInt(10);
        }
    }
     System.out.println(); 
    System.out.print("Second Matrix :"); 
    System.out.println(); 
    for (int i = 0; i < row1; i++) 
		{ 
			for (int j = 0; j < col2; j++) 
				System.out.print(B[i][j]+" "); 

			System.out.println(); 
		} 
        if (row2 != col1) 
		{ 
			System.out.println("Not Possible\n"); 
			return; 
		} 

Thread myThreads[] = new Thread[n];
for (int j = 0; j < n; j++) {
    myThreads[j] = new Thread(new  multiply(row1, col1, A, row2, col2, B, C, j));
    myThreads[j].start();
}
try{
for (int j = 0; j < n; j++) {
    myThreads[j].join(); 
}
}catch(InterruptedException e){
                System.out.println(e);
            }		
                

             System.out.println(); 
             System.out.print("Answer :"); 
    System.out.println(); 
            for (int i = 0; i < row1; i++) 
		{ 
			for (int j = 0; j < col2; j++) 
				System.out.print(C[i][j]+" "); 

			System.out.println(); 
		} 
		 
    }
    
}
