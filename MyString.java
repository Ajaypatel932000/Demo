public class MyString
{
 public static void main(String args[])
 {
   String str=new String("Java World ");
   System.out.println(" charAt()    : "+str.charAt(0));
   System.out.println(" length()    : "+str.length());
   System.out.println(" Substring() : "+str.substring(3)); 
   System.out.println(" contains()  : "+str.contains("ld"));
   System.out.println(" isEmpty()   : "+str.isEmpty());
   System.out.println("toUpperCase(): "+str.toUpperCase());
   System.out.println("toLowerCase(): "+str.toLowerCase());
   System.out.println("replace()    : "+str.replace('a','P'));
 }
 
}
