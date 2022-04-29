package demo;
import java.util.*;

public class demo3 {

	public static void main(String[] args) {
		/*Queue<String> q= new  PriorityQueue<>();
		q.add("adi");
		q.add("Hima");
		q.add("hello");
		System.out.println(q);*/
				
       Set<Integer>s= new LinkedHashSet<>();
       s.add(12);
       s.add(13);
       s.add(null);
       System.out.println(s);
       
       Set<Integer> s2 = new TreeSet<>();
       s2.add(32);
       s2.add(100);
       s2.add(45);
       System.out.println(s2);
	}

}
