package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double devide (double num1, double num2){
		if (num1/num2 == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return num1/num2;
			}
		}
	}
