package secondProject;
import java.util.*; 
import java.lang.Math; 

public class MatrixAshwiniAphale {
	
	public static void main(String[] args) {
		String ans = ""; 
		do {
		Scanner scan = new Scanner(System.in); //Using Scanner class for user input
		System.out.println("What dimensions do you want the matrices to be?");
		String dimensions = scan.next(); 
		int dim = Integer.parseInt(dimensions); //casting String user input to an integer
		while(dim < 50) {  // allowing only a user input of 50 or greater
			System.out.println("Please enter a number greater than or equal to 50!");
			dimensions = scan.next(); 
			dim = Integer.parseInt(dimensions); 
		}
		
		int[][] one = new int[dim][dim]; //initialize user input 2d arrays 
		int[][] two = new int[dim][dim]; 
			
		for(int i=0; i <one.length; i++) { //randomly generating 0-50 integers in the first 2d array
			for(int j=0; j < one[i].length; j++) {
				one[i][j] = (int)(Math.random()* 51);
				
			}
		}
		
		for(int i=0; i <two.length; i++) { //randomly generating 0-50 integers in the second 2d array
			for(int j=0; j < two[i].length; j++) {
				two[i][j] = (int)(Math.random()* 51); 
			}
		}
		
		System.out.println("First Matrix: " + Arrays.deepToString(one)); //display both 2d arrays
		System.out.println("Second Matrix: " + Arrays.deepToString(two)); 
			
		long startTime = System.currentTimeMillis(); //begins the time execution of the multiplication
		//dot product of both matrices
		int[][] product = new int[dim][dim];
		for(int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                for (int k = 0; k < dim; k++) {
                    product[i][j] += one[i][k] * two[k][j];
                }
            }
        }
		long endTime = System.currentTimeMillis(); //calculates the end time of the multiplication execution
		System.out.println(); 
		System.out.println("Multiplied Matrix: " + Arrays.deepToString(product)); //displays the product matrix
	

		

		long duration = (endTime - startTime);
		System.out.println("The program execution takes " + duration + " milliseconds"); //prints out the 
																						//final execution time
		
		System.out.println("Want to repeat the program? (Y/N)"); //prompts user if they would like to repeat the program
		ans = scan.next(); 
		System.out.println(); 
		} while(ans.equals("Y") || ans.equals("y")); //do while loop to ask the user if they would enter
    }												// y or n, case insensitive 


}
	

