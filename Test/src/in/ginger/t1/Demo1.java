package in.ginger.t1;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,4,5,6,7,8,9,95,4,5);
		boolean check=list.stream().allMatch(e->e%5==0);
		System.out.println(check);
		
	}
	
}
