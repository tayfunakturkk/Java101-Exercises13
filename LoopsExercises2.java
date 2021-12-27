package Loops.Exercises2;
import java.util.Scanner;

public class LoopsExercises2 {
    public static void main(String[] args) {
        int n;
        int sum=0;
        try (Scanner scan = new Scanner(System.in)) {
            do{
                System.out.print("Sayı Giriniz:");
                n =scan.nextInt();

                if(n%4==0){
                    sum+=n;
                }
            }
            while(n%2==0);
        }
        
        System.out.println("Toplam:"+sum);

    }
}
