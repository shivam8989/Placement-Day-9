package Patterns;

public class Numbers {
    public static void main(String args[]){
        int  n = 5;
        int a =0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
