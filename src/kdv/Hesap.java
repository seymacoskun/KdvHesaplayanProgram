package kdv;
import java.util.Scanner;

public class Hesap 
{
	public static void main(String[] args) 
	{
		double ucret, kdvOran, kdvTutar, kdvliTutar;
		Scanner input = new Scanner(System.in);
		System.out.println("�creti giriniz: ");
		ucret = input.nextDouble();
		
		kdvOran = (ucret<=1000) ? 0.18 : 0.08;
		kdvTutar = ucret * kdvOran;
		kdvliTutar = ucret + kdvTutar;
		
		System.out.println("KDV'siz Fiyat: " +ucret);
		System.out.println("KDV Oran�: " +kdvOran);
		System.out.println("KDV Tutar�: " +kdvTutar);
		System.out.println("KDV'li Tutar" +kdvliTutar);
	}
}
