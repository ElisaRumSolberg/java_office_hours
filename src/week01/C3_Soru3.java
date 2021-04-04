package week01;

import java.util.Scanner;

public class C3_Soru3 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar
		 * ve yuzler basamagi olarak yazdirin
		 *
		 *
		 * Ornek : Inputs : 853 Output : Girdiginiz sayinin birler basamagi : 3
		 * Girdiginiz sayinin onlar basamagi : 5 Girdiginiz sayinin yuzler basamagi : 8
		 *
		 *
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen 3 basamakli bir sayi giriniz");

		int sayi = scan.nextInt();

		if (sayi >= 100 && sayi <= 999) {

			System.out.println("sayinin birler basamagi" + sayi % 10);

			System.out.println("sayinin onlar basamagi" + (sayi / 10) % 10);
			System.out.println("sayinin yuzler basamagi" + sayi / 100);

		} else {
			System.out.println("lutfen 3 basamakli sayi giriniz");

		}

		scan.close();

	}

}
