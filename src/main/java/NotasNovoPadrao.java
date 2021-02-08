import java.io.IOException;
import java.util.Scanner;

public class NotasNovoPadrao {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();


        if (grade > 85) {
            System.out.println("A");
        } else if (grade > 60) {
            System.out.println("B");
        } else if (grade > 35) {
            System.out.println("C");
        }  else if (grade > 0) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }

    }

}