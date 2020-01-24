import java.lang.*
public Polymor
{
 public int add(int x, int y)
   {
     return(x+y);
    }
 public int add(int x, int y, int z)
    {
      return(x+y+z);
   }
  public int add(double x, double y)
  {
     return(x+y);
  }
}
public  static void main(String args[])
  {
      Polymor p=new Polymor();
    System.out.println(p.add(10,20));
    System.out.println(p.add(10,20,30));
    System.out.println(p.add(150,250));
 }



