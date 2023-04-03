public class labprogram52
{
 public static void main(String[]args)
 {
	System.out.print("WHILE LOOP");
	  int n=10,sum=0,i=1;
	  while(i<=n)
	  {
		sum = sum + i;
		i++;
	  }
	System.out.println("Sum of"+n+" natutral number is:"+sum);
    System.out.println("DO WHILE LOOP");
    do
      {	
		System.out.println("Useing so while loop the vlaue of i:"+i);
		i++;
	  }
	  while(i<=n);
	  System.out.println("FOR LOOP");
	  for(i=0;i<n;i++)
	  {
       System.out.println("useing for loop the value of i"+i);
      }
       System.out.println("FOR-EACH LOOP");
	   String arr[]={"suman","swaroopa","ravi","nishmitha","nihan"};
	   for(String j:arr)
	   {
	   System.out.println(i);
	   }
    }	   
