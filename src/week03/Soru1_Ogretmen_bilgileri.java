package week03;

public class Soru1_Ogretmen_bilgileri {
	 String ogretmenAdi;
	 String ogretmenBrans;
	 int ogretmenYas;
	public 	Soru1_Ogretmen_bilgileri(String brans, String isim,int yas) {
		this.ogretmenBrans=brans;
		this.ogretmenAdi=isim;
		this.ogretmenYas=yas;
		
	}
	public Soru1_Ogretmen_bilgileri() { } // default constructor

	public static void main(String[] args) {
		// ogretmen bilgileri ile alakali contructor olusturunuz

		Soru1_Ogretmen_bilgileri ogretmen1= new Soru1_Ogretmen_bilgileri("hafsa","matematik" ,29);
		System.out.println(ogretmen1.ogretmenBrans+" " + ogretmen1.ogretmenAdi+ " " + ogretmen1.ogretmenYas);
		
		Soru1_Ogretmen_bilgileri ogretmen2= new Soru1_Ogretmen_bilgileri("ruya","geometri" ,28);
		System.out.println(ogretmen2.ogretmenBrans+" " + ogretmen2.ogretmenAdi+ " " + ogretmen2.ogretmenYas);
	
	}

}
