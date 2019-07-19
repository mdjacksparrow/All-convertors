package calc;

import java.text.DecimalFormat;

/*
 * 	Hour(60)	->	min
 * 	Hour(3600)	->	sec
 * (and vice versa)
 */
public class TimeConvertor
{
	void hourToMin(double data)		//2.0	->	120
	{
		double result =data * 60;
		System.out.println("The " + data + " hour is " + (int)result + " minutes");
	}
	
	void hourToSec(double data)		
	{
		double result =data * 3600;
		System.out.println("The " + data + " hour is " + (int)result + " sec");
	}	
	
	void minToHour(double data)		
	{
		double result =data / 60;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + (int)data + " min is " + result + " hour");
	}
	
	void secToHour(double data)		
	{
		double result = data / 3600;
		result = Double.parseDouble(new DecimalFormat("##.##").format(result));
		System.out.println("The " + data + " sec is " + result + " hour");
	}
}

