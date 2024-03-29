// exception used for Q5
class CalculateException extends RuntimeException{    
	public CalculateException(String err) {
		super(err);
	}
}

public class Calculator {

	public static int calculate(String [] cmds){
		Stack pstack = new Stack();
		
		int finalValue = 0; //Creating a variable to store the result of the operations
	
		
		for (int i =0; i < cmds.length; i++) {
			pstack.push(cmds[i]);
			//Using a push command 
		}
		//Using a foor loop to iterate through the values of the array and adding them to stack
		
		for (String reverseInput : cmds) {
	           pstack.push(reverseInput);
		}
		//Using a for loop to reverse the array, similar to part 2, but with different variables this time
		
		for(int i = 0; i<cmds.length; i++) {
			cmds[i] = (String) pstack.pop();
		}
		//Popping from the stack, that has been reversed, using a for loop.
		
		for (int i = 0; i < cmds.length; i++) {
			if(isNumber(cmds[i]) == true ) {
				pstack.push(cmds[i]);
		}
			//Using an if statement so that if the current value is a number, it is pushed on the stack
			else {
				finalValue = applyOp(pstack.pop().toString(), cmds[i], pstack.pop().toString());
				pstack.push(finalValue);
			}
		}
		//Using a for loop to iterate through the stack that has array contents.
		
		return Integer.valueOf(finalValue);
		//Returning an integer
		
		
		
	}	

	public static int convert(String s) throws NumberFormatException{
		return Integer.parseInt(s); 
	}
	//Using the convert method to change from string to an integer

	public static boolean isNumber(String s){
		try {
			convert(s);
			return true;
		}
		catch (NumberFormatException e) {
			return false; 
		}
		//Using a try and catch block for a numberformatexception, if a conversion does not occur
	}

	// apply the operator after converting the numbers
	public static int applyOp(String fst,String op,String snd){
		if (op.equals("+")) {
			return convert(fst) + convert(snd);
		}
		else {
			return convert(fst) - convert(snd);
		}
		//Adding the operators 
	}

	// main operation to calculate using Polish notation directly
   // public static int calculatePolish(String [] cmds){
    	 // dummy value
    }

