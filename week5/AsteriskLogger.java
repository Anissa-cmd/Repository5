package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String Log) {
		System.out.println("******* Greeting : " + Log + "*******");
		
	}

	@Override
	public void error(String Error) {
		System.out.println("**************************\n" + "******This is an Error : " + Error+"*******\n" + "**************************");
		
	}

}
