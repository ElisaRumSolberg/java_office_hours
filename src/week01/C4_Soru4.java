package week01;

import java.util.Scanner;

public class C4_Soru4 {

	public static void main(String[] args) {
		
		/* Soru 4:
		 * Kullanicinin girmis oldugu  1 ile 12 arasindaki sayinin yilin hangi ayi oldugunu 
		 * yazdiran Switch Case java kodunu yaziniz.
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen kacinci ayda oldugunuzu giriniz");
	     byte ay = scan.nextByte();

		switch(ay) {
		
		case 1:
			System.out.println("ocak");
			break;
		case 2:
			System.out.println("subat");
			break;
		case 3:
			System.out.println("mart");
			break;
		case 4:
			System.out.println("nisan");
			break;
		case 5:
			System.out.println("mayis");
			break;
		case 6:
			System.out.println("haziran");
			break;
		case 7:
			System.out.println("temmuz");
			break;

		case 8:
			System.out.println("agustos");
			break;
		case 9:
			System.out.println("eylul");
			break;

			
	default:
			System.out.println("lutfen gecerli bir sayi giriniz");
			break;
		}
scan.close();
	}



	}


