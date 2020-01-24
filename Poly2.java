import java.lang.*;
public Poly2
{
public float mul(int x, int y)
{
 return(x*y);
}
public float mul(int x, int y, int z)
{
return(x*y*z);
}
}
public stativ void main(String args[])
{
 Poly2 p2=new Poly2();
 System.out.println(p2.mul(10,20));
 System.out.println(p2.mul(10,20,30));
}
