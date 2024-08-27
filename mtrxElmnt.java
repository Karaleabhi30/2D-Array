//taking  an matrix as input and print its elements
// package 2DArrays;
import java.util.Scanner;
public class mtrxElmnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];
        //input
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();    

            }
        }
        //output
 
        //     System.out.println(numbers[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        System.out.println("Enter the x");
        int x= sc.nextInt();
       for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
       if(numbers[i][j] == x){
       System.out.println("x found at loct("+i+", "+j+")");
      }
    }
    // System.out.println();
    }
}
}

