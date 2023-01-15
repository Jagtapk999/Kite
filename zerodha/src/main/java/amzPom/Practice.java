package amzPom;

public class Practice {
	public static void main(String[] args) {
		/*String s="Garuda2344@$#%^&";
		String s1=s.replaceAll("[0-9 @ # $ % ^ &]", "");
		String s2=s.replaceAll("[A-Z a-z]", "");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+s2);*/
		String str="WelCome To Automation";
		/*str=str.replace(" ", "");
		String lower="";
		String upper="";
		int lowerCount=0,upperCount=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90) {
				upper=upper+str.charAt(i);
				upperCount++;
			}else {
				lower=lower+str.charAt(i);
				lowerCount++;
			}
		}
		System.out.println(" Upper Chars="+upper+" Upper Count"+upperCount);
		System.out.println(" lower Chars="+lower+" lower Count"+lowerCount);*/
		
		String lower1 = str.replaceAll("[A-Z ]", "");
		System.out.println(lower1);
		System.out.println(lower1.length());
		String upper1 = str.replaceAll("[a-z ]", "");
		System.out.println(upper1);
		System.out.println(upper1.length());
	
	}

}