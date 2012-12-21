package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLambdas {

	public static void main(String[] args) {
		Thread t = new Thread(() -> { System.out.println("Hello world"); });
		t.start();
	}
	
}
