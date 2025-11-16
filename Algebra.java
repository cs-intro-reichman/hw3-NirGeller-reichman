// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		while (x2!=0) {
			while (x2>0) {
				x1++;
			x2--;
			}
			while (x2<0) {
				x1--;
				x2++;
			}
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		while (x2!=0) {
			while (x2>0) {
				x2--;
			    x1--;
			}
			while (x2<0) {
				x1++;
				x2++;
			}
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		
			int newx =0;
			int count1 = 0;
			int count2 = 0;
			if (x2<0&& x1<0){
				for (int i=x2; i<0; i++){
					count2++;
				}
				for (int i=x1; i<0; i++){
					count1++;
				}
				x2=count2;
				x1=count1;
			}
			//else if (x2<0 && x1>0){
				//for (int i=x2; i<0; i++){
				//	count2++;
				//}
				//x2=count2;}
			//else if (x1<0 && x2>0){
				//for (int i=x1; i<0; i++){
				//	count1++;
				//}
				//x1=count1;
			//}

				

			for (int i=0; i<x2; i++) {
				
				newx=plus(newx,x1);
			}
			
		
		return newx;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int newx=x;
		if (n==0) {
			newx=1;
		}
		else{
		
			for (int i=1; i<n; i++) {
				newx=times(newx,x);
		}
	}
		return newx;
}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
			int i;
			int newx=0;
			int count1 = 0;
			int count2 = 0;
			int stepper=0;
			if (x2<0&& x1<0){
			
				newx=Math.abs(x1);
				x2=Math.abs(x2);
				for ( i=1; newx>=x2; i++) {
			newx=minus(newx,x2);
			stepper=i;
		}
		return stepper;
			}


			else if (x1<0&& x2>0){
				int step1= 0;
				int step2=0;
				for ( i=0; newx<=x2; i++) {
			newx=plus(newx,x2);
			step1=i;			
		}
		for ( int z=0; Math.abs(z)!=step1;z--) { 
			step2=z;
		}
	return step2;
}
		
         else{
		newx=x1;
		for ( i=0; newx>=x2; i++) {
			newx=minus(newx,x2);
		}
		return i;
	}}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int i;
			int newx = x1;
		for ( i=0; newx>=x2; i++) {
			newx=minus(newx,x2);
		}
		return newx;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int thenumber=0;
		
		for (int i=x; i > 0 ; i--) {
			if (times(i,i) == x) {
				thenumber=i;
	}
	
	
	}
     	return thenumber;
}}
