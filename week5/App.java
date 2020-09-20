package week5;

public class App {

	public static void main(String[] args) {
		Logger logger1 = new AsteriskLogger();
		logger1.log("Hello");
		logger1.error("Wrong");
		
		logger1.log("This is Anissa log");
		logger1.error("This is an error");
		
		logger1.log("My information is here");
        logger1.error("Attention!!!! there is an error");
        
        logger1.log("Read me");
        logger1.error("hummm something wrong");
        
        
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		logger2.error("Wrong");
		
		logger2.log("This is Anissa's log");
		logger2.error("This is an error");
		
		logger2.log("My information is here");
		logger2.error("Attention!!!! there is an error");
		
		logger2.log("Read me");
		logger2.error("hummm something wrong");
	}

}
