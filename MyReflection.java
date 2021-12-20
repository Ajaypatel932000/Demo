class Demo
{
 public Demo()
 {
  System.out.println("Demo Constructro ");
  
 }
 public Demo(int a,int b)
 {
  System.out.println("Demo class with 2 parameter ");
 }
 public int sum(int a,int b)
 {
  return a+b;
 }
 protected double sum(double a,double b)
 {
  return a+b;
 }
 
}
public class MyReflection
{
  public static void main(String args[]) throws Exception
  {
    Class c1=Class.forName("Demo");
    Class c2=Demo.class;
    System.out.println("Name of Class : "+c1.getName());
    System.out.println("SuperClass    : "+c1.getSuperclass().getName());
    int modi=c1.getModifiers();
    System.out.println(" "+Modifier.tostring(modi));
  }
}
