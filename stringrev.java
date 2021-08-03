import java.util.Scanner;

public class stringrev{
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);    
String input=sc.nextLine();
byte[] strAsBytearray=input.getBytes();
byte[] result=new byte[strAsBytearray.length];

for(int i=0;i<strAsBytearray.length;i++){
    result[i]=strAsBytearray[strAsBytearray.length- i-1];

  
}
String  output=new String(result);
if(input.equals(output)){
     System.out.println("Yes");
}
else{
    System.out.println("No");
}
}
}