package week01;

import java.util.Scanner;

public class C2_Soru2 {

	public static void main(String[] args) {
		
		/*
		 * Soru 2: Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
		 * ekrana yazdiran java kodunu yaziniz.
		 * INPUT : Y
		 * 	OUTPUT : YES
		 */
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("lutfen " + "\"Y\"" + "veya " + "\"N\"" + "giriniz");
		
		String cevap = scan.next().toUpperCase();
		 
		if (cevap.equals("Y")) {
			
			System.out.println("YES");
			
		} else { 
			System.out.println("NO");
			

		}
		
		
		
		scan.close();
		
		
		
	}
}