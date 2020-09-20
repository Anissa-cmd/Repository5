package week5;



public class SpacedLogger implements Logger {

	@Override
	public void log(String Hello) {
		
		System.out.println("Greeting : " + Hello.replace(""," "));
		
		
	}

	@Override
	public void error(String Wrong) {
		System.out.println("This is an Error : " + Wrong.replace("", " ").trim());
		
	}

	
	
	
}
