import java.util.Scanner;

public class Taksimetre {
    public static void main (String [] args){
        double km;
        double perKm=2.20 , total, startPrice =10;
        Scanner input = new Scanner(System.in);
        System.out.print ("Mesafeyi girin : ");
        km=input.nextDouble();

        total = km*perKm;
        total += startPrice;
        total= (total < 20) ? 20 : total ;
        System.out.println("Toplam Tutar : " +total);


    }
}
