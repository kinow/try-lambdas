package lambdas;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.functor.UnaryPredicate;

public class FunctorsWithLambdas {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

//		UnaryPredicate<Integer> isEven = new UnaryPredicate<Integer>() {
//	    	public boolean test(Integer obj) {
//		        return obj % 2 == 0;
//		    }
//		};
		UnaryPredicate<Integer> isEven = (Integer obj) -> { return obj % 2 == 0; };
		
		for( Integer number : numbers ) {
		    if (isEven.test(number)) {
		        System.out.print(number + " ");
		    }
		}
	}
	
}
