package practise;

import java.util.*;

public class Practise {

	public static void main(String args[] ) throws Exception {

		        //Scanner
		        int N;
		        String S;
		        @SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
		        N = s.nextInt(); 
		        S = s.nextLine();     
		        if (N<=10 && N>=0){  
		        System.out.println(N*2);
		    }
		    if (S.length()<=15 && S.length()>=1){
		        System.out.println(S);
		    }
		    else
		    	System.out.println(S.length());

	}
}