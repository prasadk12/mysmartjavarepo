package wrapper;

public class WrapperExample{  
public static void main(String args[]){  
//Converting int into Integer  
int a=20;  
Integer i=Integer.valueOf(a);//converting int into Integer  
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
  
System.out.println(a+" "+i+" "+j);  
Integer k= new Integer(3);
int k1= k.intValue();
Integer k2=k1;

System.out.println(k+" "+k1+" "+k2);
double d=10.5;
Double d1= Double.valueOf(d);
Double  d3=Double.parseDouble("10.5");
Double d2=d1;
System.out.println(d+" "+d1+" "+d2+ " "+d3);


String price = String.valueOf(123.50);
System.out.println("price"+price);



String price1 = "" + 123;
System.out.println("price1  :"+price);


String price2 = String.format ("%d", 123);


System.out.println("price1  :"+price2);



}}  