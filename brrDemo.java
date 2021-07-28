class brrDemo
{
   public static void main(String [] arg)
{
//int brr[][]=new int [3][];
 int brr [][]=new int[3][];
brr[0]=new int [4];
brr[1]=new int [3];
brr[2]=new int [2];
System.out.println("jagged array");
 for(int i=0;i<brr.length;i++)
{
 for(int j=0;j<brr[i].length;j++)
{
 System.out.print( " ");
 System.out .print(brr[i][j]);
 }
 System.out.println(" "); 
	 }
   }
}