import java.util.Scanner;

public class UocSo {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        a = inputNumber.nextInt();

        System.out.println("Nhap so b: ");
        b = inputNumber.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Khong co uoc so lon nhat");
        } else {
            while (a != b) {
                if (a>b) {
                    a = a -b;
                } else {
                    b = b -a;
                }
            }
            System.out.println("uoc so chung lon nhat la: " + a);
        }
    }
}
