package labPackageHolder;

public class WaterSystem {

	public static void main(String args[]){
        int precipitation = 0;
        int waterOutput = 0;
        int temperature = 80;

        //start an if-statement
        if (precipitation < 20){
            waterOutput = 30;
            if(temperature <= 75) {
            	waterOutput = 30;
            }else {
            	waterOutput = 45;
            }
        }else if (precipitation < 31){
        	if(temperature <= 75) {
        		waterOutput = 25;
        	}
        	else {
            waterOutput = 10; 
        	}
        }else if (precipitation < 56){
        	if(temperature <= 75) {
        		waterOutput = 0;
        	}
        	else {
            waterOutput = 0;
        	}
        }else {
            waterOutput = 0;
        }

        System.out.println("The water output should be " + waterOutput);
    }
}
