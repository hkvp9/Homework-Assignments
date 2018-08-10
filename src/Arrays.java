/*Homework: different arrays, not the same codes**
	Create arrays of all primitive data types.(string int Boolean and double for now)
	For int & Boolean > initialize with  variables
	Use for loop & print even index values for int (0, 2, 4, 6 etc..)
		-google how to put values inside an array
	Use for loop for strings and point each element
*/
/*Hannah Kelly
 * 8/09/18
 */

public class Arrays {
	
	public static void main(String [] args){
		
		
		String [] Hannah = new String[]{"Hello","Apple","North","Night","AH","Heart"};
		System.out.println(Hannah);

		for(int x = 0; x<Hannah.length; x++){
			System.out.println(Hannah[x]);
		}
		
	int [] HAK = new int[]{1, 2, 3, 4, 5, 6};
		for(int y = 0; y < HAK.length ; y+=2){
//			System.out.println(HAK);
//			 if(HAK[y]% 2 == 0 ){
		

			System.out.println("Even Index : " + HAK[y]);
			 }
				
		boolean[] Bee = new boolean[]{true, false};
		
		double[] banana = {1.5, 2.6, 3, 4};
		
	}

}
