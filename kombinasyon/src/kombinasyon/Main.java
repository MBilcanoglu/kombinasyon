package kombinasyon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ilkDeger,ikinciDeger, ilkFaktoriyel=1,ikinciFaktoriyel=1,ucFaktoriyel=1;
	
		Scanner scan=new Scanner(System.in);
		
		System.out.print("�lk de�eri giriniz: ");
		ilkDeger=scan.nextInt();
		
		System.out.print("�kinci de�eri giriniz: ");
		ikinciDeger=scan.nextInt();
		
		if(ilkDeger>2 && ikinciDeger<=ilkDeger) {

			for(int i=2; i<=ilkDeger; i++) {
				ilkFaktoriyel*=i;
			}
			
			for(int i=2; i<=ikinciDeger; i++) {
				ikinciFaktoriyel*=i;
			}
			
			if(ilkDeger-ikinciDeger>2) {
				for(int i=2; i<=(ilkDeger-ikinciDeger); i++) {
					ucFaktoriyel*=i;
				}
			}else{
				ucFaktoriyel=(ilkDeger-ikinciDeger)==2?2:1;
			}
			
			System.out.println("C("+ilkDeger+","+ikinciDeger+")= "+(ilkFaktoriyel/(ikinciFaktoriyel*(ucFaktoriyel))));
			
		}else {
			System.out.println("�lk de�er ikinci de�erden b�y�k olmal�d�r !");
		}
		
		
		
	}

}
