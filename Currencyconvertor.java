package calc;

import java.text.DecimalFormat;

/*	
 * Doller(68.85)	->	INR			
 * EURO(77.26)		->	INR			
 * Yen(0.64)		->	INR			
 * (and vice versa)	
*/

public class Currencyconvertor 
{
	public void dollerToINR(double data)
	{
		double result = data * 68.85;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The INR is Rs." + result + "/-");
	}
	
	public void euroToINR(double data)
	{
		double result = data * 77.26;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The INR is Rs." + result + "/-");
	}

	public void yenToINR(double data)
	{
		double result = data * 0.64;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The INR is Rs." + result + "/-");
	}
	
	public void inrToDoller(double data)
	{
		double result = data / 68.85;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The Doller is $" + result);
	}
	
	public void inrToEuro(double data)
	{
		double result = data / 77.26;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The Euro is 円 " + result +"ē");
	}
	
	public void inrToYen(double data)
	{
		double result = data / 0.64;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.print("The Yen is - " + result);
	}
}
