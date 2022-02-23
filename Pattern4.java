public class Pattern4 {
    public static void main(String args[]){

        for(int i = 0; i < 5; i++){
            for(int j = 1; j <= 5-i; j++){
                System.out.print(j);
            }
            for(int j = 0; j <= i*2; j++){
                if(j == 0){
                    continue;
                }
                else{
                    System.out.print(" ");
                }
            }
            
            for(int j = 5-i; j > 0; j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
