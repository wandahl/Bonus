
public class Changer {
	
	public static void main(String[] args) {
		int[] sekValues = {1, 5, 10, 20, 50, 100, 500, 1000};
		int[] sekValuesTest = { 1, 5, 10 };
		int[] specialFall = {4, 5, 6};
		System.out.println(change(7,specialFall,specialFall.length));
	}
	
	public static int change( int amount, int[] val, int n ){
		if(amount==0){
			return 1;
		}
		if(amount<0){
			return 0;
		}
		if(n<=0 && amount>=1){
			return 0;
		}
		return change(amount,val,n-1) + change(amount-val[n-1],val,n);
	}

}
