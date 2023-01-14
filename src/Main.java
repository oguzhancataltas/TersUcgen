import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int basNumber;

        System.out.print("Üçgenin Basamak sayısını Giriniz : ");
        basNumber = scan.nextInt();

        for (int i = basNumber; i >= 1; i--){
            for (int j = 1; j <= basNumber - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
