/*  Nama File   : Asersi1.java
    Deskripsi   : Program untuk menunjukkan asersi
    Pembuat     : Gherald Abraham / 24060123140210
    Tanggal     : 09 - Maret - 2025
*/
public class Asersi1 {
    public static void main(String[] args) {
        int x= 0;
        if (x>0){
            System.out.println("bilangan posisitf");
        }else{
            assert (x<0):"ada kesalahan kode";
            System.out.println("bilangan negatif");
        }
    }
}
