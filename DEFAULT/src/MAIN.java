import java.util.*;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Sandy");

		String rev = "", str = "Sandy";
		
		Scanner sr = new Scanner(System.in);
		
		char ch[] = str.toCharArray();
		
		int x = ch.length;
		
		for(int i = x-1;i>=0;i--) {
			rev = rev + ch[i];
		}
		
		System.out.println(rev);
		 
		System.out.println(".........");
		
	}

}
