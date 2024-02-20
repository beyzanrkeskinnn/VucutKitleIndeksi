import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, kilo,bodyindex;

        Scanner input=new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz(m cinsinden): ");
        height=input.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo=input.nextDouble();
        
        bodyindex=kilo/(height*height);

        System.out.println("Vücut Kitle İndeksiniz: "+ bodyindex);
    }
}