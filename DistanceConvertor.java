package calc;

import java.text.DecimalFormat;

/*
 * 	Meter(1000)		->	KM
 *  Miles(0.621)	->	KM
 *  (and vice versa)
 */

public class DistanceConvertor 
{
	public void meterToKM(double data)
	{
		double result = data / 1000;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The "+ data +" meter is " + result + "Km");
	}
	
	public void milesToKM(double data)
	{
		double result = data / 0.621;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + data +" meter is " + result + "Km");
	}
	
	public void KMToMeter(double data)
	{
		double result = data * 1000;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The "+ data +" KM is " + result + "meter");
	}
	
	public void KMTomiles(double data)
	{
		double result = data * 0.621;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + data +" KM is " + result + "miles");
	}
}

