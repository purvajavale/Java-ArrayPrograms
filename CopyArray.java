
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int [] arr1 = new int [] {1, 2, 3, 4, 5};    
       int arr2[] = new int[arr1.length];    
       //Copying all elements of one array into another    
       for (int i = 0; i < arr1.length; i++) {     
           arr2[i] = arr1[i];    
           System.out.println("Elements of original array: " +  arr1[i]);    
           System.out.println("Elements of new array: " +  arr2[i]);    
       }      
	}

}
