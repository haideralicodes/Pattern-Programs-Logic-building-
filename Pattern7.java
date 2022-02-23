public class Pattern7 {
    public static void main(String args[]){

////////////////////////UPPER PYRAMID////////////////////////

        for(int i =0; i< 5; i++){
            for(int j = 5-i; j> 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


////////////////////////LOWER PYRAMID////////////////////////

        for(int i = 0; i < 5; i++){
            for(int j = 0 ; j <= i; j++){
                System.out.print(" ");
            }   // loop for spaces
            for(int j = 5-i ; j > 0; j--){
                System.out.print("*");
            }   // loop for right half triangle
            for(int j =5-i; j > 0; j--){
                System.out.print("*");
            }// loop for left half triangle
            System.out.println();
        }

    /*   
        *****  *****
         ****  ****
          ***  ***
           **  **
            *  *
             * 
    */


    // for(int i =0; i < 5; i++){
    //     for(int j =5-i; j > 0; j--){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    }
}


