import java.util.Arrays;
class array2{
	public static void main(String args[]){

		int a[]={1,2,3};

		a= Arrays.copyOf(a,a.length+1);
		a[a.length-1]=4;

		System.out.println(Arrays.toString(a));

	}
}