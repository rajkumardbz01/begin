import java.util.*;

class posneg
{
public static void main(String []args)
{
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	if(x>0)
		System.out.println("Positive");
	else if(x==0)
		System.out.println("zero");
	else    System.out.println("negative");
}
}