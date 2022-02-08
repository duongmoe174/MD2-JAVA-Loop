import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so tien gui ");
        money = input.nextDouble();

        System.out.println("nhap so thang gui ");
        month = input.nextInt();

        System.out.println("nhap lai suat ");
        interestRate = input.nextDouble();

        double total = 0;

        for (int i = 0; i < month; i++) {
            total += money * (interestRate/100) / 12 * month;
        }
        System.out.println("tien lai la " + total);
    }
}
