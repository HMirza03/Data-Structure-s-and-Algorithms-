
public class Reverse {

	//The Big O complexity is linear, as we iterate through the for loops, with "N" representing the inputs as the elements within the array. Thus, as the inputs increase, the time increases.
	
	
	public static void reverse(String[] arr){ 
		Stack s = new Stack();
		//Creating a stack in order to push the elements for the array
	
		for (String reverseInput : arr) {
	            s.push(reverseInput);
	     }
		//Using a for loop in order to push the contents of the array on the stack in FILO order
		 
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (String) s.pop();
		}
		//Using a for loop to push them out.
		
		
		
		

	}
	
}
