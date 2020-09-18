package toph;

import java.util.Scanner;

public class T05MissingNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int Sum= input.nextInt();
        int Fir= input.nextInt();
        int Sec= input.nextInt();
        int Thi= input.nextInt();
        int Fou= (Sum-(Fir+Sec+Thi));
        
        System.out.println(""+Fou);
        
    }
    
}
