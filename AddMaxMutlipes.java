
public class AddMaxMutlipes {

	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};  
		int maxTotal = 0;
		int s = 0;
		for(int i=1; i<=(a.length-1) ; i++) {
			int total = 0;
			int j = i;
			if(a[i]%a[s] == 0) {
				for(int p=s; p<=(a.length-1) ; p++) {
				if(a[p]%a[j] ==0 ){
				total += a[p];
				j = p;
			}
		}
			maxTotal = (maxTotal < total) ? total : maxTotal;
		}
		System.out.println(maxTotal);
	}

}
}