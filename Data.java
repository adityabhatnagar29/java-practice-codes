package demo;

public class Data {
	static String name = "Aditya";
	static int m;
	
	public Data(int m) {
		super();
		System.out.println(m+""+ name);
	}

	public static void main(String[] args) {
		
		Data obj = new Data(10);
		System.out.println(m+""+ name);
		
		
	  
	}

}
