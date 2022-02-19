import java.util.Scanner;
public class Ucgenhesap {
    public static void main(String[] args) {
        double kenar1,kenar2 ;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. dik kenarı girin : ");
        kenar1 = inp.nextDouble();
        System.out.print("2. dik kenarı girin : ");
        kenar2 = inp.nextDouble();
        double kenar3kare = (kenar1*kenar1)+(kenar2*kenar2);
        double sonuc = Math.sqrt(kenar3kare);
        System.out.println("hipotenüs :" + sonuc);
        double cevre = (kenar1 + kenar2 + sonuc);
        double yaricevre = cevre / 2;
        double alankare = yaricevre* (yaricevre-kenar1)* (yaricevre-kenar2)* (yaricevre-sonuc);
        double alan = Math.sqrt(alankare);
        System.out.println("Alan : " + alan);




    }



}
