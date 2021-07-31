package logapplication;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import java.util.Scanner;

public class Testapp {
	private static Logger log = Logger.getLogger(Testapp.class);

	public static void main(String args[]) {
		int first, second;
		// Layout layout=new SimpleLayout();
		// Layout layout=new HTMLLayout();
		// Layout layout=new XMLLayout();
		Layout layout = new PatternLayout("%p %d %C %M %m %n");

		Appender app = new ConsoleAppender(layout);
		log.addAppender(app);
		log.debug("Its Debug");
		log.info("its info");
		log.fatal("its fatul");
		log.error("its error");

		log.warn("its warrning");
		System.out.println("Log4j Demo Success");
		System.out.println("\n");

		System.out.println("Enter First Value");
		Scanner sc = new Scanner(System.in);
		first = sc.nextInt();
		System.out.println("Enter second Value");
		second = sc.nextInt();
		String s = "Hi I am Java Developer";
		int a = first + second;
		log.info("its info : " + s);

		try {
			int ans = first / second;
			System.out.println("Division Of " + first + "  With " + second + "  Is : " + ans);

		} catch (ArithmeticException e) {
			log.error(e);
		} finally {
			System.out.println("I am FinllyBlock");
		}

	}

}
