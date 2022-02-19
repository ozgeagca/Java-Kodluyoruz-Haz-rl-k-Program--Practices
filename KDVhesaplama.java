import java.util.Scanner;
public class KDVhesaplama {
    public static void main (String [] args){
        double tutar;
        double kdvOran = 0.18;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        if (tutar > 1000) {
            kdvOran=0.08;
        }

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar +kdvTutar;
        System.out.println("KDV'siz Fiyat : " + tutar);
        System.out.println("KDV'li Fiyat : " + kdvliTutar);
        System.out.println("KDV Tutarı : " + kdvTutar);
    }
}
