package amzPom;

public class ArrayPrime {
	public static void main(String[] args) {
		int num[]= {7,13,17,19,170};
		for(int i=0;i<=num.length-1;i++) {
			//System.out.println(num[i]);
			int count=0;
			for(int j=1;j<=num[i];j++) {
				if(num[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("Number is Prime :"+num[i]);
			}else {
				System.out.println("Number is not Prime:"+num[i]);
			}
			
		}
		
	}

}
