package array;

public class array_file {
	
	1) Print Array

	public class printarray {

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
	        int[] a=
	        	{
	        			3,5,4,8,5,9,2,4,9
	        	}
	            ;
	           mycode(a);
	     }
		//EndofMainMethod
		public static void mycode(int[]a)
		{
			for(int i=0; i<a.length; i++)
			{
				System.out.println(a[i]+" ");
			}
		}
	 }

	Output-
	3 5 4 8 5 9 2 4 9 

	****************************************************************************************************************

	2)find index of Element

	public class myclass {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	      int[] a= 
		          {
				  5,10,15,20,25,30
				  };
	      int ele=10;
	      
	      number(a,num);
	      
		}
		public static void number(int[] a, int num)
		{
			int count=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==ele)
				{
					System.out.println(i);
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("not found");
		    }
		}
	}

	Output-
	1
	6

	************************************************************************************************************

	3) Find Count of even,odd,positive,negative element.

	public class Myclass
	{
	     public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	      int[] a= 
		          {
				  11,22,33,44,55,66,-77,88
				  };
				  element(a);
		}
	  	public static void number(int[] a)
		{
		int even=0;
		int odd=0;
		int positive=0;
		int negative=0;
		
		for(int i=0; i<a.length; i++)
		{
		   if(a[i]%2==0)
		   {
		      even++;
		   }
		   else
		   {
		       odd++;
		   }
	    }
		for(int i=0; i<a.length; i++)
		{
		   if(a[i]>0)
		   {
		      positive++;
		   }
		   else
		   {
		      negative++;
		   }
		
		}
		System.out.println("Even Count "+even);
		System.out.println("Odd Count "+odd);
		System.out.println("Positive Count "+positive);
		System.out.println("Negative Count "+negative);
	 }
	}
		
	Output-
		Even Count 4
		Odd Count 4
		Positive Count 7
		Negative Count 1
		
	************************************************************************************************************

	4) Replace 0 to 1

	public class myclass {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	      int[] a=
	              {
	                1,0,1,0,1,0,1,0
	              };
	            replace(a);
		}
	    private static void replace(int[] a)
	    {
		    for(int i=0; i<a.length; i++)
			{
			    a[i]=1;
				System.out.print(a[i]+" ");
			}
		}	
	}

	Output-
	       1 1 1 1 1 1 1 1
		  
	*****************************************************************************************************************
	5)Find max Element

	public class myclass {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	      
		  int[] a= 
		          {
				  35,30,100,25,20,15,10,5
				  };
			
			int max=Integer.MIN_VALUE;
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i]>max)
					max=a[i];
				
			}
			System.out.println("max element is: "+max);
		}
		
	Output-
	max element is: 100

	*************************************************************************************************************

	6)Find Min Element

	public class myclass {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	      
		  int[] a= 
		          {
				  35,30,100,25,20,15,10,5
				  };
			
			int min=Integer.MAX_VALUE;
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i]<min)
					min=a[i];
				
			}
			System.out.println("min element is: "+min);
		}

	Output-
	min element is: 5

	*************************************************************************************************************

	7) Rotate Array left

	public class leftshift_array 
	{
	    public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			//rotate array
			int[] a= 
			        {
					11,22,33,44,55,66
					};
			int temp=a[0];
			for(int i=0; i<a.length-1; i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+" ");
			}

		}
	}

	Output-
	22 33 44 55 66 11

	****************************************************************************************************************

	8) Rotate Array Right

	public class rightshift_array {

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			
			int[] a= 
			        {
					11,22,33,44,55,66,77
					};
			
			int temp=a[a.length-1];
			for(int i=a.length-1; i>0; i--)
			{
				a[i]=a[i-1];
		    }
			a[0]=temp;
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	Output-
	77 11 22 33 44 55 66

	*******************************************************************************************************************

	9) Reverse array using third variable

	public class reverse_array {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	        int[] a= 
			        {
					35,30,25,20,15,10,5
					};
			
			int i=0;
			int j=a.length-1;
			while(i<j)
			{
				//swap
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			for(i=0; i<a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	Output-
	5 10 15 20 25 30 35

	***********************************************************************************************************

	10)Remove duplicate

	public class reverse_array {

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
	        int[] a= 
			        {
					1,3,5,6,2,3,4,5,97,1,23
					};
					my code(a);
		}
	    private static void mycode(int[] a)
	       {
		           int cnt;
				   for(int i=0; i<a.length; i++)
			   {
				   int cnt=0;
				   for(int j=0; j<i; j++)
				   {
				   if(a[i]==a[j])
				       {
					   cnt++;
					   }
				   }
				   if(cnt==0)
				   {
				   System.out.println(a[i]+" ");
				   }
				}
		   } 	
	    }
		
	Output-
	1 3 5 6 2 4 97 23

	**************************************************************************************************************

	11) Basic sort

	public class sort_array {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int a[] = 
			         {
					 11,55,22,99,33,88,66,77
					 };
			
			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a.length; j++) 
				{
					 if(a[i]>a[j])
					{
						int tem=a[i];
						a[i]=a[j];
						a[j]=tem;
					}
				}
			}
	       for(int i=0; i<a.length; i++)
		   {
	    	   System.out.print(a[i]+" ");
		   }
		}

	}

	Output-
	11 22 33 55 66 77 88 99

	*****************************************************************************************************************

	12) Interleaving of Array

	public class interleaving_array {

		public static void main(String[] args) 
		{

	            char[] a= {'a','b','c','d','e','f'};
	            char[] b= {'w','x','y','z'};
	            
	            char[] c=new char[a.length+b.length];
	            
	            int index=0;
	            for(int i=0; i<a.length || i<b.length; i++)
	            {
	            	if(i<a.length)
	            	{
	            		c[index++]=a[i];
	            	}
	            	if(i<b.length)
	            	{
	            		c[index++]=b[i];
	            	}
	            }
	            for(int i=0; i<c.length; i++)
	               {
	                  System.out.println(c[i]);
	               }
		}

	}

	Output-
	a w b x c y d z e f g

	************************************************************************************************************

	13) Addition of two Matrix

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] a= 
			     {
			        {
					   1,2,3
					} 
					,
					{
					   2,6,5
					}
					,
					{
					   2,3,5
					}
				 }
				 ;
			int[][] b= 
			     { 
				    {
					   5,6,7
					}
					,
					{
					   5,9,8
					}
					,
					{
					   5,8,7
					}
				 }
				 ;
			int[][] c=new int [a.length][a[0].length];
			for(int i=0; i<c.length; i++)
			{
				for(int j=0; j<c[i].length; j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
		    }
			for(int i=0; i<c.length; i++)
			{
				for(int j=0; j<c[i].length; j++)
				{
					System.out.print(c[i][j]+" ");
					
				}
				System.out.println();
			}
		}
	}

	Output-
	6 8 10 
	7 15 13 
	7 11 12 

****	****************************************************************************************************************

	14)Print Max Element in Matrix

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] a= 
			     {
			        {
					   1,2,3
					} 
					,
					{
					   2,6,5
					}
					,
					{
					   2,3,5
					}
				 }
				 ;
		int max=Integer.MIN_VALUE;
			
			for(int i=0; i<a.length; i++)
			{
			   for(int j=0; j<a[i].length; j++)
			       {
				       if(a[i][j]>max)
				        {
					         max=a[i][j];
				        }
		        	}
			}
	        System.out.println("Max is: "+max);
		}
	}

	Output-
	Max is: 6

	******************************************************************************************************************
	15) Transpose of matrix

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] a= 
			     {
			        {
					   1,2,3
					} 
					,
					{
					   2,6,5
					}
					,
					{
					   2,3,5
					}
				 }
				 ;
	        int b[][]=new int[a[0].length][a.length];
			for(int i=0; i<a.length; i++)
			{
			     for(int j=0; j<a[i].length; j++)
				 {
				     b[i][j]=a[j][j];
				 }
			}
		    for(int i=0; i<b.length; i++)
			{
			     for(int j=0; j<b[i].length; j++)
				 {
				    System.out.print(b[i][j]+" ");
				 }
				 System.out.println();
			}
		}
	}

	Output-
	1 2 2
	2 6 3
	3 5 5

	*****************************************************************************************************************

	16) Find Sum and Avg

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int a= 
			     {
			        1,2,3,4,5,6,7,8  
				 }
				 ;
	         int sum=0;
	         double avg=0;
	         for(int i=0; i<a.length; i++)
	            {
				sum=sum+a[i];
				}		 
			System.out.println("sum : "+sum);
	        avg=sum/a.length;
	        System.out.println("avg : "+avg);		

	Output-
	sum : 36
	avg : 4.0

	***************************************************************************************************************

	17) Remove Specific Element

	public class myclass 
	{
	    public static void main(String[] args)
		{
			int[] a= 
			     {
			        33,7,90,20,5,50,40  
				 }
				 ;
				 int ele=78;
		
		     int count=0;
	         for(int i=0; i<a.length; i++)
	          {
			       if(a[i]==ele)
				   {
				   count++;
				   }
			  }
	         int[] b=new int[a.length-count];
	         int index=0;
	         for(int i=0; i<a.length; i++)
	           {
			     if(a[i]!=ele)
				  {
				       b[index++]=a[i];
				  }
			   }
	         for(int j=0; j<a.length; j++)
	          {
			       System.out.println(b[j]+" ");
			  }		 
			
		}	
	}		

	Output-
	33 7 90 20 5 50 40

	****************************************************************************************************************

	18) RemoveDuplicate print Unique Count

	public class Myclass {

		public static void main(String[] args) 
		{
	    	
			int[] a= 
			        { 
					1,2,1
					};
			int cnt=0;
			for(int i=0; i<a.length; i++)
			{
				int count=0;
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				if(count==0)
				{
				  cnt++;
				}
				
			}
			System.out.println("new length of array : "+cnt);
		}
	}

	Output-
	new length of array : 2

	************************************************************************************************************

	19) sum of diagonal

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] a= 
			     {
			        {
					   5,1,3
					} 
					,
					{
					   2,4,3
					}
					,
					{
					   4,3,2
					}
				 }
				 ;
	            int sum=0;
				for(int i=0; i<a.length; i++)
				{
				     sum=sum+a[i][a.length-i-1];
				}
				System.out.println("sum of diagonal is :"+sum);
			}
	}

	Output-
	sum of diagonal is : 11

	******************************************************************************************************************

	20) Find sum and average of non diagonal matrix
			
	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] a= 
			     {
			        {
					   1,12,3,4
					} 
					,
					{
					   5,6,6,8
					}
					,
					{
					   9,1,2,5
					}
					,
					{
					   7,2,4,45
					}
				 }
				 ;
	            double sum=0;
				int cnt=0;
				for(int i=0; i<a.length; i++)
				{
				    for(int j=0; j<a[i].length; j++)
					{
					    if(j+i!=a.length-1 && j-i!=0)
						{
						  sum=sum+a[i][j];
						  cnt++;
						}
					}
				}
				double avg=sum/cnt;
				System.out.println("sum : "+sum);
				System.out.println("avg : "+avg);
			}
	}

	Output-
	sum : 48.0
	avg : 6.0

	*****************************************************************************************************************

	21) Binary Search

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] a= 
			     {
			        23,45,67,88,90
				 }
				 ;
	            int num=90;
	            int start=0;
	            int end=a.length-1;

	        while(start<=end)
	           {
			      int mid=(start+end)/2;
				  if(a[mid]==num)
				      {
					    System.out.println("found at index : "+start);
						break;
					  }
					  else if(num>a[mid])
					  {
					     start=mid+1;
					  }
					  else
					  {
					     end=mid-1;
					  }
			    }
	           if(start>end)
	               {
				          System.out.println("index not found");
				   }		   
	        }
	}

	Output-
	found at index : 4

	****************************************************************************************************************

	22) Multiplication of matrix

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int[][] a= 
			         {
					    {
						 1,2,4
						}
						,
					    {
						4,2,4
						}
			            };
			int[][] b= 
			         {
					     {
						 2,4
						 }
						 ,
					     {
						 5,8
						 }
						 ,
					     {
						 1,8
						 }
					   };
			
			int[][] c=new int[a.length][b[0].length];
			
			for(int i=0; i<2; i++)
			{
				for(int j=0; j<2; j++)
				{
					for(int k=0; k<3; k++)
					{
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
			    }
			}
			for(int i=0; i<c.length; i++)
			{
				for(int j=0; j<c[i].length; j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

	Output-
	16 52 
	22 64 

	****************************************************************************************************************

	23)
	Check Equality

	public class equalityof_array {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int[] a= 
			        {
					5,10,15,20,25,30,35
					}
					;
	        int[] b= 
			        {
					5,10,15,20,25,30
					}
					;
					
				if(a.length==b.length)
	             {
				       int cnt=0;
					   for(int i=0; i<a.length; i++)
					   {
					         if(a[i]!=b[i])
							  {
							      cnt++;
								  break;
							  }
					   }
					   if(cnt==0)
					        System.out.println("same");
						else
						    System.out.println("not same");
				 }
	             else
	                  System.out.println("not same");
	        }
		}

	Output-
	not same

	****************************************************************************************************************

	24) Unique Pair

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int[] a= 
			         {
					 5,10,15,20,25,30,35
					 }
					 ;
					
	                int cnt=0;
	                for(int i=0; i<a.length; i++)
	                   {
					      for(int j=i+1; j<a.length; j++)
						      {
							    if(a[i]==a[j])
								  {
								     cnt++;
								  }
							  }
					    }
	                int[] b=new int[a.length-cnt];
	                int index=0;
	                for(int i=0; i<a.length; i++)
	                    {
						  int count=0;
						  for(int j=0; j<i; j++)
						     {
							    if(a[i]==a[j])
								   {
								     count++;
								   }
							  }
							  if(count==0)
							  {
							     b[index++]=a[i];
							  }
						}
	                for(int i=0; i<b.length; i++)
	                    {
						  for(int j=0; j<b.length; j++)
						      {
							     System.out.println(b[i]+" "+b[j]);
							  }
						}				
				}
			}

	Output-
	1 1 
	1 2
	1 3
	2 1
	2 2
	2 3
	3 1
	3 2
	3 3

	*****************************************************************************************************************

	25) Remove Specific Element From Array

	public class myclass {

		public static void main(String[] args) 
		{
	        int[] a= 
			        {
					  33,7,90,20,5,50,40
					}
					;
					int ele=78;
					
					int cnt=0;
					for(int i=0; i<a.length; i++)
					   {
					     for(int j=i+1; j<a.length; j++)
						     {
							    if(a[i]==ele)
								   {
								     cnt++;
								   }
							 }
						int[] b=new int[a.length-cnt];
						int index=0;
						for(int i=0; i<a.length; i++)
						    {
						     if(a[i]!=ele)
							     {
								    b[index++]=a[i];
								 }
						    }
						for(int i=0; i<b.length; i++)
	                       {
							  System.out.println(b[i]+" "); 
						   }					
						}
					}
				}

	Output-
	33 7 90 20 5 50 40		

	*************************************************************************************************************

	26) Average of inner element in 2D array

	public class myclass {

		public static void main(String[] args) 
		{
			int[][] a= 
			     {
			        {
					   1,2,3,4
					} 
					,
					{
					   5,6,7,8
					}
					,
					{
					   9,4,2,5
					}
					,
					{
					   7,2,4,9
					}
				 }
				 ;
				 
				 int sum=0;
				 int cnt=0;
				 for(int i=0; i<a.length; i++)
				     {
					    for(int j=0; j<a[i].length; j++)
	                        {
							   if(i!=0 && j!=0 && i!=a.length-1 && j!=a.length-1)
							       {
								      sum=sum+a[i][j];
									  cnt++;
								   }
							}					
					  }
					  double avg=sum/cnt;
					  System.out.println("sum : "+sum);
					  System.out.println("avg : "+avg);
				}
			}

	Output-
	sum : 19
	avg : 4.0		

	************************************************************************************************************

	27) Remove ist from 2nd element in Array

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int[] a= 
			         {
					   1,1,1,1,1,2,2,3,4,4,4
					 }
					 ;
					 int[] b=
					 {
					    1,2,4
					 }
					 ;
					 
					int[] num=
	                          {
							     1,2,4
							  };
							for(int j=0; j<num.length; j++)
							   {
							     int cnt=0;
								 for(int i=0; i<a.length; i++)
								 {
								     if(a[i]==num[j])
									   {
									      cnt++;
									   }
								 }
								if(cnt>2)
	                             cnt=2;
	                            b=new int[a.length-cnt];
	                            int index=0;
	                            int cnt2=0;
	                            for(int i=0; i<a.length; i++)
	                             {
								   if(a[i]!=num[j] || cnt2==2)
								    {
									  b[index++]=a[i];
									}
									else
									{
									  cnt2++;
									}
								 }
	                            a=b;
						    }
						}
					for(int i=0; i<b.length; i++)
	                   {
					      System.out.println(b[i]+" ");
					   }	
				}
		}

	Output-
	1 1 1 3 4

	*************************************************************************************************************

	28)least of Subarray

	public class myclass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        int[] a= 
			         {
					   3,7,90,20,5,50,40
					 }
					 ;
	                 int k=3;
	                 
					 int min=Integer.MAX_VALUE;
					 int index=0;
					 for(int i=0; i<a.length; i++)
					  {
					     int sum=0;
						 for(int j=i; j<i+k; j++)
						    {
							   sum=sum+a[j];
							}
							int avg=sum/k;
							if(avg<min)
							{
							   min=avg;
							   index=i;
							}
					  }
					  System.out.println(min+" "+index);
				}
		}

	Output-
	25 3

	*************************************************************************************************************

	29) leader element in array

	public class myclass {

		public static void main(String[] args) {
			
			int[] a= 
			        {
					  11,22,99,33,44,88,55,77,66
					}
					;
			
			for(int i=0; i<a.length; i++)
			{
				int count=0;
				for(int j=i+1; j<a.length; j++)
				{
					if(a[j]>a[i])
					{
						count++;
					}
				}
				if(count==0)
					System.out.println(a[i]+" ");
			}
		}
	}

	Output-
	99 
	88
	77
	66 	
					 
	***************************************************************************************************************

	30) sadal point

	public class myclass {

		public static void main(String[] args) 
		{
			int[][] a= 
			     {
			        {
					   6,3,9
					} 
					,
					{
					   9,7,8
					}
					,
					{
					   2,4,5
					}
					
				 }
				 ;
				int cnt=0;
	            for(int i=0; i<a.length; i++)
	               {
				      for(int j=0; j<a[i].length; j++)
					    {
						   boolean row=smallestrow(a,i,j);
						   boolean col=largestcol(a,i,j);
						   if(row==true && col==true)
						      {
							     System.out.println(a[i][j]);
								 cnt++;
							  }
		                }
				   }
	                         if(cnt==0)
	                          {
					               System.out.println("no saddle");
					             }			   
				}
	            public static boolean smallestrow(int[][]a, int i, int j)
	               {
				      for(int k=0; k<a.length; k++)
					  return false;
				   }			
				   return true;
	            }
				public static boolean largestCol(int[][]a, int i,int j)
				{
				    for(int k=0; k<a.length; k++)
					{
					   if(a[k][j]>a[i][j])
					   return false;
					}
					return true;
				}
		    }
	    }

	Output-
	     7	
		
						
							  
					

	        
		
	        
			
	    
		
					  



			

		
		  

		

}
