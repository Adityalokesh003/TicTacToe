 
 
import java.util.*;
public class Demo1{

	public static void main(String args[])throws Exception{
	 
	  
	
	System.out.println("                            Welcome to TIC-TAC-TOE\n\n");
	Thread.sleep(1000);
	for(int i=3;i>=1;i--){
		System.out.printf("                               Game Start in %d\r",i);
		Thread.sleep(1000);
	}
	Thread.sleep(500);
	System.out.println("\n\n\n                                 Game Started ");
	Thread.sleep(500);
	
	
	TicTacToe obj=new TicTacToe();
	System.out.print("Player-1:- \n              Enter your Name:");
	 obj.player1Name = new Scanner(System.in).nextLine();
	 
	
	 
	System.out.print("Player-2:- \n              Enter your Name:");
	obj.player2Name = new Scanner(System.in).nextLine();
	 
	
	
	obj.fill();
	for(int itr=1;itr<=9;itr++){if(obj.status){break;}
		if((itr%2)!=0){
		System.out.println( obj.player1Name+" turn");
		System.out.println("Enter your Box no:  i.e, form 1 to 9");
		while(true){ 
			int element=new Scanner(System.in).nextInt();
			 
			
  			/*if(element<1 || element>9){System.out.println("Enter your correct Box no: i.e, from 1 to 9");
			continue;
			}*/
			if(element<1 || element >9){
				System.out.println("***Invalid Input***");
				System.out.println( obj.player1Name+" turn \nEnter correct Box no: i.e, from 1 to 9");
				continue;
			}
			if(obj.arr[element-1]=='0' || obj.arr[element-1]=='X'){
				System.out.println("***DONOT ENTER REPETITIVE BOX NO*** \nEnter  Box no: i.e, from 1 to 9");
				System.out.println( obj.player1Name+" turn");
				continue;
				
			}
			obj.fill('X',element); 
			break;
			
		}	
		}
		else{
			System.out.println( obj.player2Name+" turn");
		System.out.println("Enter your Box no:  i.e, form 1 to 9");
		while(true){ 
			int element=new Scanner(System.in).nextInt();
			 
			
  			/*if(element<1 || element>9){System.out.println("Enter your correct Box no: i.e, from 1 to 9");
			continue;
			}*/
			if(element<1 || element >9){
				System.out.println("***Invalid Input***");
				System.out.println( obj.player2Name+" turn \nEnter correct Box no: i.e, from 1 to 9");
				continue;
			}
			if(obj.arr[element-1]=='0' || obj.arr[element-1]=='X' ){
				System.out.println("***DONOT ENTER REPETITIVE BOX NO*** \nEnter  Box no: i.e, from 1 to 9");
				System.out.println( obj.player2Name+" turn");
				continue;
				
			}
			obj.fill('0',element); 
			break;
			
		}	
		}
		
		
		
		
		
	}
	 
	 if(!(obj.status)){
	System.out.println("Match Draw...");
	 }
	}//end main

}//end class



