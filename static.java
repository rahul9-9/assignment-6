import java.util.Scanner;
class test
{
int r;
static int count;
static{System.out.println("java");
int count=10;}
static{System.out.println("static");}
{System.out.println("without static");}
{System.out.println("without staic 2");}

test()
{
System.out.print("example of static block");
}
}
class main
{
public static void main(String[] args)
{
test t=new test();


}

}