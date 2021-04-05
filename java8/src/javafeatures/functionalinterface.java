package javafeatures;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class functionalinterface {
	
	   public static void main(String args[]) {
	      List<Integer> list = Arrays.asList(11, 2, 3, 4, 5, 30, 45, 57, 63, 72, 28, 90);
		  System.out.println("Print all numbers in an array:");
	      eval(list, n->true);
          System.out.println("Print all even numbers in an array:");
	      eval(list, n-> n%2 == 0 );
	      System.out.println("Print numbers lesser than 5:");
	      eval(list, n-> n < 3 );
	      System.out.println("Print all odd numbers in an array:");
	      eval(list, n-> n%2!=0);
	   }
	   
	  			   public static void eval(List<Integer> list, Predicate<Integer> predicate) {

	      for(Integer n: list) {

	         if(predicate.test(n)) {
	            System.out.println(n + " ");
	         }
	      }
	   }
	}

