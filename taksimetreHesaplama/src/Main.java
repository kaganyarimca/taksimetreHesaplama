import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

/*  Taksimetre km başına 2.20 TL tutmaktadır.
    Min ödenecek tutar 20 TL'dir. 20 tl nin altındaki ücretlerde yine 20 tl alınacaktır.
    Taksimetre açılıc ücreti 10 tl dir.

*/

        int km;
        double perKm =2.20, total, startPrice = 10 ;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km olarak giriniz");

        km= input.nextInt();

        total = (km+perKm);
        total += startPrice;

        total = (total<20 ) ? 20 : total;
        System.out.println("Toplam tutar : "+ total);


    }
}