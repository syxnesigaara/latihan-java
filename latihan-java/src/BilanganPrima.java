import java.util.Scanner;
public class BilanganPrima {
    public static void main(String[] args) {

        Scanner userScan = new Scanner(System.in);
        int a , b , c, d, fix;

        System.out.printf("Masukkan Angka Terendah =");
        a = userScan.nextInt();

        System.out.printf("Masukkan Angka Tertinggi =");
        b = userScan.nextInt();

        System.out.printf("Hasil Dari Bilangan Prima Adalah = " , a , b);


        for (c = a; c <= b; c++){

            if( c == 1 || c == 0)
                continue;

            fix = 1;

            for(d = 2; d <= c / 2; d++){
                if (c % d == 0) {
                    fix = 0;
                    break;
                }
            }
            if (fix == 1 )
                System.out.println(c);
        }

    }

}
