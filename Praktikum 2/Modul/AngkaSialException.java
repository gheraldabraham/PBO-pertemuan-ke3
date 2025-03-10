/*  Nama File   : AngkaSialException.java
    Deskripsi   : Eksrpsi buatan sendiri, menolak angka 13
    Pembuat     : Gherald Abraham / 24060123140210
    Tanggal     : 09 - Maret - 2025
*/
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial !!!");
    }
}
