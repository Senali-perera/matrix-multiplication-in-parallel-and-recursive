/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;
import java.util.concurrent.*;
/**
 *
 * @author Senali Perera
 */
public class multiply implements Runnable {
    
	
	
        private int i = 0, j = 0, k = 0; 
        int row1 = 4, col1 = 4, row2 = 4, col2 = 4, A[][], B[][], C[][], x; 
        
        multiply(int row1, int col1, int A[][], 
					int row2, int col2, int B[][], 
					int C[][], int x){
            this.row1=row1;
            this.col1=col1;
            this.row2=row2;
            this.col2=col2;
            this.A=A;
            this.B=B;
            this.C=C;
            this.x=x;
        }
        
        public void run(){
            multiplyMatrixRec(this.row1, this.col1, this.A, this.row2, this.col2, this.B, this.C, this.x);
        }
	
	void multiplyMatrixRec(int row1, int col1, int A[][], 
					int row2, int col2, int B[][], 
					int C[][], int x) 
	{ 
		
            if (j >= col2) 
			return; 
            
               
			if (k < col1) 
			{ 
                            
				C[x][j] += A[x][k] * B[k][j]; 
				k++; 

				multiplyMatrixRec(row1, col1, A, row2, col2, B, C, x); 
                                
			} 

			k = 0; 
			j++; 
                       
			multiplyMatrixRec(row1, col1, A, row2, col2, B, C, x); 
		
                

		
	} 

	
	
    
}
