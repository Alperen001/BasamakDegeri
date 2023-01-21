import java.util.Scanner;

public class BasamakDegeri {

	public static void main(String[] args) {
		int gsayi;
		Scanner inp = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayý Giriniz: ");
		gsayi = inp.nextInt();
	 
	        int adet = 0,toplam=0;
	 
	        while(gsayi != 0)
	        {
	           toplam=(gsayi%10)+toplam;
	           gsayi /= 10;
	    
	        }
	 
	        System.out.println("Basamak Toplamý: " + toplam);
	    } 

	}


