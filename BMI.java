import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        double boy, kilo ;
        Scanner inp = new Scanner(System.in);
        System.out.print ("Lütfen boyunuzu (metre cinsinde) giriniz) : ");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo=inp.nextDouble();
        double BMI= kilo/(boy*boy);
        System.out.print("Vücut kitle indeksiniz : " +BMI);

    }
}
