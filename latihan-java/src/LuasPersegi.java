import java.util.Scanner;
public class LuasPersegi {
    public static void main(String[] args) {

        int sisi, luas;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Panjang Sisi Persegi = ");

        sisi = scan.nextInt();
        luas = sisi * sisi;

        System.out.println("Luas Persegi Adalah = " + luas);

    }
}
