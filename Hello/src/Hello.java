import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Hello {

public static void main(String args[])

{
	
System.out.println("hello world");	

List<Integer> list=Arrays.asList(1,2,3,4,5);

System.out.println(list);

Function<Integer, Double> sum = a->a*2.0;

System.out.println(sum.apply(20));

}
	
}