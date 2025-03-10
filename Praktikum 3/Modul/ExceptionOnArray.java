/*  Nama File   : ExceptionOnArray.java
    Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
    Pembuat     : Gherald Abraham / 24060123140210
    Tanggal     : 09 - Maret - 2025
*/
public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansi object array integer 
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
