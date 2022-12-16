import java.util.*;
abstract class shape
{
    double a,b;
    abstract public void area();
}
class he extends shape
{
  public double vol_sp;
  public void area()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter radius");
    a= sc.nextDouble();
    vol_sp=(4*3.14*a*a*a)/3;
    System.out.println("volume of sphere is : "+vol_sp);
  }  
}
class cylinder extends shape
{
    double cy_vol;
    public void area()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius");
        a = sc.nextDouble();
        System.out.println("enter height");
        b= sc.nextDouble();
        cy_vol= 3.14*a*a*b;
        System.out.println("volume of cylinder : "+cy_vol);
    }
}
class cone extends shape
{
    double co_vol;
    public void area()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius");
        a= sc.nextDouble();
        System.out.println("enter height");
        b= sc.nextDouble();
        co_vol=(3.14*a*a*b)/3;
        System.out.println("volume of cone : "+co_vol);
    }
}
class Test1
{
    public static void main(String args[])
    {
    he s= new he();
    s.area();
    cylinder c = new cylinder();
    c.area();
    cone v = new cone();
    v.area();
    }
}
