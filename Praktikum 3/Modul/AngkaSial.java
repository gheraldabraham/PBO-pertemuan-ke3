/*  Nama File   : AngkaSial.java
    Deskripsi   : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
    Pembuat     : Gherald Abraham / 24060123140210
    Tanggal     : 09 - Maret - 2025
*/
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial ");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            //as.cobaAngka(10);
            as.cobaAngka(13);
            //as.cobaAngka(12);
        }catch(AngkaSialException ase ){
            System.out.println(ase.getMessage());
            System.out.println("hati hati dalam memasukan angka !!");
        }
    }
}

//PERTANYAAN: Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
//JAWABAN: Baris 12 tidak dieksekusi jika eksepsi terjadi. Baris 21 dieksekusi karena ada dalam blok catch.