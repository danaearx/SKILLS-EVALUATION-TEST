import java.util.*;
public class Tier2 {

	public static void main(String args[]){

	    //Creating a List
	    List<Integer> list=new ArrayList<Integer>();
	    //Adding elements in the List
	    list.add(2);
	    list.add(5);
	    list.add(30);
	    list.add(45);
	    list.add(43);
	    list.add(67);
	    list.add(20);
	    list.add(70);

	    double sum = 0;
	    int n = 0;
	    for(Integer number:list) {
			//Check each number of the List if is even number and if is divisible by 5
		    if ((number % 2 == 0) && (number % 5 == 0)) {
				sum = sum + number;
				n = n + 1;
			}
		}

	    double average = sum/n;
	    //System.out.println(sum);
	    //System.out.println(n);
	    System.out.println("The average of the numbers that are even and divisible by 5 is "+average);
	}
}