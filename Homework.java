*Worked on with Will Popik*

The code is the following:

public class Problem13 {
	
	
	public int swapTensAndUnits(int n) {
	    int tens = (n / 10) % 10;
	    int units = n % 10;
	    int rest = n - n % 100;
	    int outputnumber = rest + units *10 + tens;
	    	return outputnumber ;
	}
	    
	public static void main(String args[]){
		Problem13 newProblem13 = new Problem13();
		System.out.println(newProblem13.swapTensAndUnits(3456));
	}
	
}

The output is:
3465


public class January {
	

	
	public int findDay(int day) {
		int dayOfWeek1 = 0;
		int dayOfWeek = (dayOfWeek1 + (day - 1)) % 7;
		return dayOfWeek;
		}
	public static void main(String args[]){
		January result = new January();
		System.out.println(result.findDay(13));
	
	}
}

15. 

int remainingTime = (depHour - curHour)*60 + (depMin - curMin);

System.out.println(remainingHour / 60 + " hours and " + remainingMin % 60 + " minutes.")
