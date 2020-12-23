import java.io.*;
import java.util.*;
class Welcome
{
	 void Welcome_1()
	{
	   System.out.println("#######################################");
	   System.out.println("---------------WELCOME TO --------------- \n     ROCK , SCISSOR AND PAPER GAME");
	   System.out.println("########################################");
	   System.out.println("FOLLOW THE INSTRUCTIONS TO PLAY THE GAME");
	   System.out.println("----------------------------------------------");
	}
}
class Comp_Work
{  
    int Random_1()
	{
	   int com_val;
	   
       Random Ram=new Random();
	   System.out.println("OPONENT'S CHANCE");
       com_val=Ram.nextInt(2);
	   
	   
		   if(com_val==0)
		     {
			   System.out.println("Rock");
		     }
		   else if(com_val==2)
		     {
			   System.out.println("Paper");
		     }
		   else if( com_val==2 )
			   {
			   System.out.println("SCISSOR");
		        }
		     
	   		
				return com_val;
	}			
	 
   int User_Work_1(int s1,int ch)
	{
	while(true)
	{
	     if(s1==7)
		 {
			 System.out.println(" ok");
		 }
	         
	         if(ch==1)
	            {
	              System.out.println("ROCK");
	            }
	         else if(ch==2)
	            {
					 System.out.println("PAPER");
	            }
     	     else if (ch==3)
            	{
	               System.out.println("SCISSOR");
	            }
	              
		
				return ch;
	}        
			  
	}

}

class Rock_Paper_SCISSOR
 {
    public static void main(String args[])
	  {
		int choice,start;
	    Welcome w1=new Welcome();
		w1.Welcome_1();
		Comp_Work c1=new Comp_Work();
		Scanner sc=new Scanner(System.in);
		System.out.println(" ENTER 7 TO START ");
	    start=sc.nextInt();
		if(start!=7)
		{
			System.out.println("OPP'S PRESS 7");
			start=sc.nextInt();
		}
		
		System.out.println("NOW, \n ENTER-\n 1:FOR ROCK \n 2:FOR PAPER \n 3:FOR SCISSOR");
	    choice=sc.nextInt();
		
		
		
		int res_u=c1.User_Work_1(start,choice);
		//c1.Random_1();
		//int res_u=c1.User_Work_1();
		int res_c=c1.Random_1();
		
		
		
		
		
		if(res_u==1 && res_c==0  )
		 {
			System.out.println(" TIE \n PLAY AGAIN!!!!!");
		 }
		    else if(res_u==1 && res_c==1 )
		       {
		 	      System.out.println(" YOU LOSE");
		        }
		        else if(res_u==1 && res_c==2 )
		           {
		              System.out.println("YOU WINS");
		            }
                    else if(res_u==2  && res_c== 0)
	            	   {
		                	 System.out.println(" YOU WINS");
		                }
                        else if(res_u== 2 && res_c== 1)
		                   {
                               System.out.println(" TIE \n PLAY AGAIN!!!!!");
		                    }
                            else if(res_u== 2 && res_c== 2)
		                       {
		                        	System.out.println("YOU LOSE");
		                        }
                                else if(res_u== 3 && res_c==0 )
		                          {
		                            	System.out.println("|YOU LOSE");
								  } 
                                  else if(res_u== 3 && res_c== 1 )
	                               	 {
	                             		System.out.println("// YOU WINS");
		                              }
	                                	else if(res_u== 3 && res_c== 2)
	                                     	 {
	                                      		System.out.println(" TIE \n PLAY AGAIN!!!!!");
	                                       	 }
											// System.out.println("Press 7 to play Again");
											// start=sc.nextInt();
											
											 
		// System.out.println(" HURREY,	\n YOU WON THE GAME");
		 System.out.println("*-*-*-*-*-*-*-*-*-*-THANKS FOR PLAYING-*-*-*-*-*-*-*-*-*-*");
	  }
 
 }