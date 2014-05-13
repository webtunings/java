public class CouponCollectorSimulate {

 public static void main(String[] args) {
  int result =0;
  result = couponCollector(Integer.parseInt(args[0]));
  System.out.println(result);
 }

 public static int couponCollector(int number) {
  boolean[] collected = new boolean[number];
  int iteration = 0;
  int unique = 0;

  while(unique < number){
   int random = (int) (Math.random() * number);
   if(!collected[random]){
    unique++;
    collected[random] = true;
   }
  iteration++;
  }
  return iteration;
 }

}
