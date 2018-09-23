
public class AddMultiples {

	public static void main(String[] args) {
		int[] numArray = new int[]{5,3,10,27,30,57,90,93,180};
		int startingIndex = 0;
		int endingIndex = 7;
		int total=0;
		for(int i=startingIndex; i<=endingIndex; i++) {
			if(numArray[i] % numArray[startingIndex] == 0) {
				total=total+numArray[i];
				startingIndex = i;
				}
		}
		System.out.println(total);
	}
}
