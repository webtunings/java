public class basics {
 
 public static void main(String[] args) {

 System.out.print("hello");
 System.out.println(args[0]);
 System.out.println(args[1]);

 int x = 100; // 32 bit -2^31 to 2^31-1
 long y = 10000000000000L; //64 bit
 short s = 123; //16 bit
 byte b = 100; //8bit

 float f = 102.445F;
 double d = 12045.55434;

 String str = "webtunings";
 char ch = 'a';
 boolean bool = true;

 System.out.println(Integer.parseInt("23456"));
 //Double.parseDouble(String s)
 //Long.parseLong(String s)

 double sqrt = Math.sqrt(y);
 System.out.println(sqrt);

 int casted = (int) sqrt;
 System.out.println(casted);
 System.out.println(Integer.MAX_VALUE);

 System.out.println(1.0/0.0);


 }


}
