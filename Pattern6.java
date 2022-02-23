import java.util.Scanner;

public class Pattern6 {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in); //creating Scanner object
        System.out.print("Enter the no. of rows: ");    
        int rows = input.nextInt(); // Taking no. of rows from user
        
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <=i; j++){
                if(j == 1 || j == i || i==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
       }
    }
}

    