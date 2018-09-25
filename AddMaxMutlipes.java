
public class AddMaxMutlipes {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};  
		int startingIndex = 0;
		int endingIndex = 14;
		int maxTotal = a[startingIndex];
		for(int i=startingIndex+1; i<=endingIndex ; i++) {
			int total = a[startingIndex];
			int j = i;
			if(a[i]%a[startingIndex] == 0) {
				for(int p=startingIndex; p<=endingIndex ; p++) {
				if(a[p]%a[j] ==0 ){
				total += a[p];
				j = p;
			}
		}
			maxTotal = (maxTotal < total) ? total : maxTotal;
		}
	}
		System.out.println(maxTotal);
}
}