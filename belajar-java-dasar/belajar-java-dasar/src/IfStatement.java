public class IfStatement {
    public static void main(String[] args) {


        var nilai = 80;
        var absen = 85;

        var lulusNilai = nilai >= 75;
        var lulusAbsen = nilai >= 75;

        var lulus = lulusNilai && lulusAbsen;

        if(nilai >=75 & absen >= 75){
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA BELUM LULUS, SILAHKAN COBA LAGI TAHUN DEPAN");
        }

        if(nilai >=80 & absen >= 80){
            System.out.println("Nilai Anda A");
        } else if(nilai >=70 & absen >= 70){
            System.out.println("Nilai Anda B");
        } else if(nilai >=60 & absen >= 60){
            System.out.println("Nilai Anda C");
        } else if(nilai >=50 & absen >= 50){
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }

    }
}
