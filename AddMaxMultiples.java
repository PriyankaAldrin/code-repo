//Still figuring out how to do this if the array has mixed numbers like {15,2,4,6,5,15,10} :(
public class AddMaxMultiples {

	public static void main(String[] args) {
		int[] a = new int[]{15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};  
		int startingIndex = 0;
		int endingIndex = 14;
		int maxTotal = a[startingIndex];
		for(int i=startingIndex+1; i<=endingIndex ; i++) {
			int total = a[startingIndex];
			int p = startingIndex;
			int j = i;
			if(a[i]%a[startingIndex] == 0) {
				for(p=startingIndex; p<=endingIndex ; p++) {
				if(a[p]%a[j] ==0 ){
				total += a[p];
				j = p;
			}
		}
			maxTotal = (maxTotal < total) ? total : maxTotal;
		}
			if(a[startingIndex]%a[i] == 0) {
				for(j = i; j<=endingIndex ; j++) {
				if(a[p]%a[j] ==0 ){
				total += a[j];
				p = j;
			}
		}
			maxTotal = (maxTotal < total) ? total : maxTotal;
		}
	}
		System.out.println(maxTotal);
}
}
