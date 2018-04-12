 
 
  class  TicTacToe
  {		 String player1Name;
	     String player2Name;
	   char []arr=new char[9];
	    boolean status=false;
	  void fill(){
		 
		System.out.println("          =======================================================================\n");
		for(int element=0;element<arr.length;element++){
			
			 
			
			System.out.printf("                ["+"%2c"+" ]     ",arr[element]);
			 if((element+1)%3==0){ System.out.print("\n\n\n");}
		}
		
		System.out.println("          =======================================================================");
		
	}
	 void fill(char ch,int element){
		
		 switch(element){
			 case 1: arr[element-1]=ch;
					
					 break;
			case 2: arr[element-1]=ch;
					  
					 break;
					 
			case 3: arr[element-1]=ch;
					  
					 break;
			case 4: arr[element-1]=ch;
					  
					 break;
			 
			case 5: arr[element-1]=ch;
					  
					 break;
			case 6: arr[element-1]=ch;
					  
					 break;
					 
			case 7: arr[element-1]=ch;
					  
					 break;
			case 8: arr[element-1]=ch;
					  
					 break;
			case 9: arr[element-1]=ch;
					  
					  
					 break;
			 
		 }
		 
		 
		 
		 
		  for(element=1;element<=arr.length;element++){
						 
						 System.out.printf("                ["+"%2c"+" ]     ",arr[element-1]);
						 if((element)%3==0){ System.out.print("\n\n\n");}
					 }
					 System.out.print("\n");
					 winner();
		 
	 }
	 
	  void winner(){
		if((arr[0]==arr[1] && arr[1]==arr[2] && arr[0]!='-'  )|| (arr[3]==arr[4] && arr[4]==arr[5]  && arr[3]!='-') ||
			(arr[6]==arr[7] && arr[7]==arr[8]  && arr[6]!='-') || (arr[0]==arr[4] && arr[4]==arr[8] && arr[0]!='-') || (arr[2]==arr[4] && arr[4]==arr[6] && arr[2]!='-') || (arr[0]==arr[3] && arr[3]==arr[6] && arr[0]!='-') || (arr[1]==arr[4] && arr[4]==arr[7] && arr[1]!='-'  ) || (arr[2]==arr[5] && arr[5]==arr[8] && arr[2]!='-'  )){
			
			
			if(arr[0]==arr[1] && arr[1]==arr[2]){
				if(arr[0]== 'X'){ System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[0]== '0'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			if(arr[3]==arr[4] && arr[4]==arr[5]){
				if(arr[3]== 'X'){  System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[3]== '0'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			if(arr[6]==arr[7] && arr[7]==arr[8]){
				if(arr[6]== 'X'){ System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[6]== '0'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			if(arr[0]==arr[4] && arr[4]==arr[8]){
				if(arr[0]== 'X'){ System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[0]== '0'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			if(arr[2]==arr[4] && arr[4]==arr[6]){
				if(arr[2]== 'X'){  System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[2]== '0'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			if(arr[0]==arr[3] && arr[3]==arr[6]){
				if(arr[0]== 'X'){  System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[0]== 'X'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			if(arr[1]==arr[4] && arr[4]==arr[7]){
				if(arr[1]== 'X'){  System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[1]== '0'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			if(arr[2]==arr[5] && arr[5]==arr[8]){
				if(arr[2]== 'X'){  System.out.println("Winner is : "+player1Name);status=true;}
				else if(arr[2]== '0'){System.out.println("Winner is : "+player2Name);status=true;}
			}
			

			  
		} 
		
	 	
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}//end class



