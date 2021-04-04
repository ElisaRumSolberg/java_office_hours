package week01;

import java.util.Scanner;

public class C3_Soru3Ikinciyol {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
        System.out.println("Lutfen uc basamakli bi sayi giriniz");
        int sayi=scan.nextInt();
        if (sayi>99&& sayi<1000) {
            
        int birlerBas=sayi%10;
        System.out.println("birler basamagi:"+birlerBas);
        int onlarBas=(sayi/10)%10;
        System.out.println("onlar basamagi:"+onlarBas);
        int yuzlerBas=((sayi/100));
        System.out.println("yuzlerler basamagi:"+yuzlerBas);
        }else {
            System.out.println("lutfen uc basamakli bir sayi giriniz");
        }
        scan.close();


	}

}
