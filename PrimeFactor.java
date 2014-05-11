public class PrimeFactor {

public static void main(String[] args) {
 long number = Long.parseLong(args[0]);
 getPrimeFactors(number);
}

public static void getPrimeFactors(long number) {
 for (long i=2; i <= number/i; i++) {
 System.out.println("{ i = " + i + " , number = " + number + "}");
 while(number%i == 0) {
  number = number/i;
  System.out.println("Factor: " + i);
 }

 }
 if(number > 1) {
  System.out.println("Factor: " + number);
 }
 System.out.println();

}

}
