public class DecimalToBinary {

public static void main(String[] args) {
 String bin = dec2bin(Integer.parseInt(args[0]));
 System.out.println(bin);
}

public static String dec2bin(int number){
 String temp = "";
 while(number > 0) {
  temp = number%2 + temp;
  number = number/2;
 }
 return temp;
}

}

