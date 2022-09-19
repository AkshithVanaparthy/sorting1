package sorting;

import java.util.*;

public class bubblesort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		ArrayList arr = new ArrayList(a);
		for(int i=0;i<a;i+=1)
	    {
	        arr.add(s.nextInt());
	    }
	    int k=0;
	    for(int i =0;i<a;i+=1)
	    {
	        for(int j =0;j<a-1;j+=1)
	        {
	            k = (int)arr.get(j);
	            if((int)arr.get(j+1)<(int)arr.get(j))
	            {
	                arr.set(j,arr.get(j+1));
	                arr.set(j+1,k);
	            }
	        }
	    }
	    for(int i= 0;i<a;i+=1)
	    {
	        System.out.print(arr.get(i));;
	    }

	}

}