public class CouponCollectorSimulate {

 public static void main(String[] args) {
  int total = 0, result = 0;
  for(int i=0; i <50; i++) {
  result = couponCollector(Integer.parseInt(args[0]));
  total += result;
  System.out.println(result);
  }
  System.out.println("Average=" + total/50);
  }



 public static int couponCollector(int number) {
  boolean[] collected = new boolean[number];
  int iteration = 0;
  int unique = 0;

  while(unique < number) {
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
