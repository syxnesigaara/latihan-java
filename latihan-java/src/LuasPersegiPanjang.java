import java.util.Scanner;
public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.print("Masukan Panjang : ");
        panjang=input.nextInt();
        System.out.print("Masukan Lebar   : ");
        lebar=input.nextInt();

        luas=panjang*lebar;

        System.out.println("Hasil Luas Persegi Panjang adalah : " + luas);
    }
}
