package sample;
 
class Calculator
{
		//addition method
	    double adds(double a,double b) {
	        double answer = a+b;
	        return answer;          
	    }
	    //Subtraction method
	    double subtracts(double a, double b) {
	        double answer = a-b;
	        return answer;          
	    }
	    //multiplication method
	    double multiplies(double a, double b) {
	        double answer = a*b;
	        return answer;          
	    }
	    //division method
	    double divides(double a, double b) {
	    	double answer = a/b;
	        return answer;          
	    }
	    //divide by zero method
	    public String dndby0(double a, double b){
	    	if(b==0){
	    		String answer = "NaN";
	    		return answer;
	    	}
	    	else{
	    		String answer = Double.toString(a/b); 
	    		return answer;
	    	}
	    }
	    boolean ext(){
	    	return true;
	    }
	    
}
 
