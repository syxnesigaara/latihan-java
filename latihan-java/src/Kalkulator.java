import java.util.Scanner;
public class Kalkulator {
        public static void main (String[] args){
            int result, select , number1 , number2;
            Scanner input= new Scanner(System.in);

            System.out.println("Kalkulator");

            System.out.println("Pilih Metode Perhitungan");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            select = input.nextInt();

            System.out.println("Input Number 1: ");
            number1 = input.nextInt();

            System.out.println("Input Number 2: ");
            number2 = input.nextInt();

            if (select == 1){
                result = number1 + number2;
                System.out.println("Hasil nya adalah : " + result);
            }
            else if (select == 2){
                result = number1 - number2;
                System.out.println("Hasil nya adalah : " + result);
            }
            else if (select == 3){
                result = number1 * number2;
                System.out.println("Hasil nya adalah : " + result);
            }
            else if (select == 4){
                result = number1 / number2;
                System.out.println("Hasil nya adalah : " + result);
            }
            else {
                System.out.println("Pilihan Tidak Tersedia ");
            }
        }
    }