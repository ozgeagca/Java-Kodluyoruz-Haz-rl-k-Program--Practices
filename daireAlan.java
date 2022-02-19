import java.util.Scanner;

public class daireAlan {
    public static void main (String [] args) {

        double yaricap;
        double pi =3.14 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("yarıçap girin : ");
        yaricap = inp.nextDouble();

        double alan = pi* Math.sqrt(yaricap);
        double cevre = 2*pi*yaricap;
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

        // açı girdirip daire diliminin alanını bulduralım
        double merkAci;
        System.out.print("Merkez açıyı girin : ");
        merkAci= inp.nextDouble();
        double dilimAlan = (pi*Math.sqrt(yaricap)*merkAci)/360;
        System.out.println("Daire diliminin alanı :" + dilimAlan);

    }

}
