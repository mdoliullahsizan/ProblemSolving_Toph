package toph;

import java.util.Scanner;

public class T04PieAreSquared {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int r= input.nextInt();
        double pi= 3.141592653589793;
        double A= pi*r*r;
        
        System.out.println(""+A);
    }
    
}
