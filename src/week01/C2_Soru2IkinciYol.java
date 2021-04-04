package week01;

import java.util.Scanner;

public class C2_Soru2IkinciYol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Soru 2: Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
		 * ekrana yazdiran java kodunu yaziniz.
		 * INPUT : Y
		 * 	OUTPUT : YES
		 */             
		
Scanner scan = new Scanner(System.in) ;
		
		System.out.println("lutfen " + "\"Y\"" + " veya " + "\"N\"" + "giriniz");
		
	char input = scan.next().charAt(0)	 ;
	
	if (input == 'Y' ||input=='y') {
		System.out.println("YES");
		
	} else if (input== 'N' || input == 'n') {
		System.out.println("NO");
		
	} else {
		System.out.println("yanlis giris yaptiniz. lutfen tekrar deneyiniz");

	}
	
	
	
	
	
	scan.close();
	

	}
	
		
	}


