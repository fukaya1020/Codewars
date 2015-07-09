public class CaffeineBuzz {
	public static String caffeineBuzz(int n){
		String output = "";
		if (n % 12 == 0)
			output += "CoffeeScript";
		else if (n % 6 == 0)
			output += "JavaScript";
		else if (n % 3 == 0)
			output += "Java";
		else
			output = "mocha_missing!";
		return output;
	}
}