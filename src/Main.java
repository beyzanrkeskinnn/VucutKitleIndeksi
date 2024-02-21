import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height, kilo,bodyindex; //Değişkenlerimizi tanımladık

        //Kullanıcıdan bilgilerimizi aldık
        Scanner input=new Scanner(System.in);

        System.out.print("Boyunuzu Giriniz(m cinsinden): ");
        height=input.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo=input.nextDouble();

        //kullanıcının girmiş olduğ bilgiler ile vücut kitle index formülünü uyguladık
        bodyindex=kilo/(height*height);

        //Çıkan sonucu ekrana yazdırdık
        System.out.println("Vücut Kitle İndeksiniz: "+ bodyindex);
    }
}