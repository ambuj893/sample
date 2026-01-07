import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // Scanner input=new Scanner(System.in);
        //  System.out.println(input.nextInt()+4);
        // int num=(int)(67.67);
        // System.out.println(num);
        byte a=40;
        byte b=50;
        byte c=100;
        int d=(a*b)/c;  // automatically converts byte to integer for evaluation
        System.out.println(d); 

        // byte e=50;
        // e=e*2; //gives error no casting done automatically in this case 
    
         int number='a';// automatically convert to ascicode
         System.out.println("नमस्ते"); // unicode values
         
         // Rules for tyoe promotion
         // 1) All the byte,short and character values are promoted to integer
         // 2)If any one of the operands is long,float,double the whole operation will be promoted to long,float,double repectively
         // System.out.println(3*5.67); //float
         byte e=42;
         char f='a';
         int g=50000;
         short s=1024;
         float h=5.67f;
         double i=0.1234;
         double result=(h*e)+(g/f)-(i-s);
         System.out.println((h*e) + " " + (g/f) + " " + (i-s));
         System.out.println(result);
    }
    
}