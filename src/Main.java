import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac sayi gireceksiniz: ");
        int n = input.nextInt();

        int min = 0;
        int max = 0;
        int number;

        for(int i = 1; i <= n; i++ ) {
            System.out.print(i+ ".sayiyi giriniz: ");
            number = input.nextInt();
            if(number < min || min == 0){
                min = number;
            }
            if(number>max) {
                max = number;
            }
        }
        System.out.println("En kucuk sayi : " +min);
        System.out.println("En buyuk sayi: " +max);
    }
}