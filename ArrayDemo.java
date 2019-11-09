import java.util.Arrays;
public class ArrayDemo{
	public static void main(String[] args) {
		//initialize an int array
		int[] arr = new int[] {13,22,11};

		//let us print all the elements available in list
		System.out.println("The number of arrays are: ");
		for (int number : arr ) {
			System.out.println("Number: "+number);
		}
		System.out.println("The String representation of Array is: ");
		System.out.println(Arrays.toString(arr));
	}
}