/*  Nama File   : Asersi2.java
    Deskripsi   : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
    Pembuat     : Gherald Abraham / 24060123140210
    Tanggal     : 09 - Maret - 2025
*/
//class lingkaran 
class Lingkaran{
    private double jariJari;
    public Lingkaran (double  jariJari){
        this.jariJari = jariJari;
    }public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
}

//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.  
//JAWABAN : Assertion (assert(jariJari > 0)) tidak mencegah eksekusi jika dinonaktifkan (karena defaultnya nonaktif). Objek Lingkaran tetap dibuat meskipun jariJari = 0, menyebabkan hasil keliling lingkaran = 0.0.