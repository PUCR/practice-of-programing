class  one_D
{
public static void  main(String arg[])
{
  int arr[]=new int [5];
  arr[0]=10;
  arr[1]=20;
  arr[2]=30;
  arr[3]=40;
  arr[4]=50;
  //arr[5]=60;
 
  System.out.println(arr.length);
  System.out.println("using for loop");
  for(int i=0;i<arr.length;i++)
  {
  System.out.print(" ");
  System.out.print(arr[i]);
  }
  for(int x:arr)
  {
  //System.out.print(" x ");
  }
  }
  }
  
  
  