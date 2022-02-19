import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args){
        double armut,elma,domates,muz,patlican;

        double armutb= 2.14,elmab=3.67,domatesb=1.11,muzb=0.95,patlicanb=5;
        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armut = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = inp.nextDouble();

        double armutf =armut*armutb;
        double elmaf=elma*elmab;
        double domatesf=domates*domatesb;
        double muzf=muz*muzb;
        double patlicanf=patlican*patlicanb;
        double toplam = armutf+elmaf+domatesf+muzf+patlicanf;

        System.out.print("Toplan tutar :" +toplam);


    }
}
