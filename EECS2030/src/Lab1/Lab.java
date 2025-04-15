package Lab1;

import java.util.ArrayList;

public class Lab {

	
	public static String getMyID()
	{
		return "219506864";
	}

	
	public static String getLetterGrade(double grade)
	{
		if (grade>=90)
		{
			return "A+";
		}
		else if(grade>=80)
		{
			return "A";
		}
		else if(grade>=75)
		{
			return "B+";
		}
		else if(grade>=70)
		{
			return "B";
		}
		else if(grade>=65)
		{
			return "C+";
		}
		else if(grade>=60)
		{
			return "C";
		}
		else if(grade>=55)
		{
			return "D+";
		}
		else if(grade>=50)
		{
			return "D";
		}
		else if(grade>=45)
		{
			return "E";
		}
		else
		{
			return "F";
		}
	}
	
	public static double addAndChangeScale(ArrayList<Double> grades)
	{
		double arraySize= grades.size();
		double sum = 0;
	    for (double value : grades) {
	        sum += value;
	    }
	    
	    return ((sum/arraySize)/10);
	}
	
	
}
