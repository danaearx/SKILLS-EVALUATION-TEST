public class Tier1 {
  	public static void main(String args[]) {

	    String input = "affaabffbccAAdffd";
	    char search = 'f';    // Character to search is 'f'.

	    int count=0;
	    for(int i=0; i<input.length(); i++) {
		    if(input.charAt(i) == search) {
		    	count++;
			}
	    }

	    System.out.println("The Character '"+search+"' appears "+count+" times.");
    }
}