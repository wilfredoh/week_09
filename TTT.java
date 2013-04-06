/*
 DONE IN CLASS
*****************************
STUDENT: WILFREDO HENRIQUEZ
*****************************
 */

import javax.swing.JOptionPane; // import class JoptionPane

public class TTT 
{
  public static void main ( String[] args)
  {

  	String answer="y";  

  	do { // **  LOOP #1  MAIN LOOP; EXIT BY USER WHEN ANSWER: y/n  
  		
  		int  player = 0;
  		char number1 = '1';
  		char number2 = '2';
  		char number3 = '3';
  		char number4 = '4';
  		char number5 = '5';
  		char number6 = '6';
  		char number7 = '7';
  		char number8 = '8';
  		char number9 = '9';
  		char playerMarker = 'X';
  		char systemMarker = 'O';
  		String winnerMessage = "";
  
  		int  gameOver = 0;
  		int  validMove= 0;
  		
  		// ******* LOOP #2   MAIN LOOP UNTIL GAME IS OVER  GAME **************
  		do{  
  	    
  			 //********* LOOP #3  INTERNAL  PLAYER  ENTRY  ************************
  			 do {  
  				     //  ***** DISPLAYING THE BOARD FOR THE USER 
  				String playerEntry = JOptionPane.showInputDialog
  						("TIC-TAC-TOE GAME, System='O',  Player='X' \n  " + "Choose your SQUARE by Chosing a Number' \n"+ 
  		                 "__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
  		                 "__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
  				         "__" + number7 + "__|__" + number8 + "__|__" + number9 + "__");
  				player = Integer.parseInt(playerEntry);
                         
  				// ******** VALIDATING THE ENTRY NOTHING NUMBER 1-9
  				if	 ((player <1) ||(player >9))
  					{
  					validMove = 0;
  					JOptionPane.showMessageDialog (null,  
  					"__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
  					"__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
  					"__" + number7 + "__|__" + number8 + "__|__" + number9 + "__", "PLAYER CHOSE = "+
  					playerEntry + ", NUMBER NOT 1-9",  JOptionPane.INFORMATION_MESSAGE );
  					}
  				// **********  VALIADTING THE ENTRY NOT TAKEN ALREADY **************
  				else if (player == 1 && number1 !='X' && number1 !='O')
  					{number1 = playerMarker; validMove = 1;}
  				else if (player == 2  && number2 !='X' && number2 !='O')
  					{number2 =  playerMarker;validMove = 1;}
  				else if (player == 3 && number3 !='X' && number3 !='O')
  					{number3 =  playerMarker;validMove = 1;}	
  				else if (player == 4 && number4 !='X' && number4 !='O')
  					{number4 =  playerMarker;validMove = 1;}	
  				else if (player == 5 && number5 !='X' && number5 !='O')
  					{number5 =  playerMarker;validMove = 1;}	
  				else if ( player == 6 && number6 !='X' && number6 !='O')
  					{number6 =  playerMarker;validMove = 1;}
  				else if (player == 7 && number7 !='X' && number7 !='O')
  					{number7 =  playerMarker;validMove = 1;}	
  				else if (player == 8 && number8 !='X' && number8 !='O')
  					{number8 =  playerMarker;validMove = 1;}
  				else if (player == 9 && number9 !='X' && number9 !='O')
  					{number9 =  playerMarker;validMove = 1;}
  				
  				else
  					{
  				    
  					validMove = 0; 
  					JOptionPane.showMessageDialog (null,  
  					"__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
  					"__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
  					"__" + number7 + "__|__" + number8 + "__|__" + number9 + "__", "PLAYER CHOSE = "+
  					playerEntry + ", ENTRY TAKEN",  JOptionPane.INFORMATION_MESSAGE );
  					}
  											 						
  		  }  while (validMove != 1); // **END LOOP #3: 'DO/WHILE'USER ENTRY ******
  	
  			 
  			 
  			// ***  we are in Loop #2  
  			// **** CHECKING FOR USER AS WINNER  for row or colunm or Diagonal   **************
  			// ******************************************************************
  		   if      ( number1=='X' && number4=='X' && number7=='X')
  			   	{ winnerMessage = "Player Win" ; gameOver=1;}		// col 1
  		   else if ( number2=='X' && number5=='X' && number8=='X') 
  			   	{ winnerMessage = "Player Win" ; gameOver=1;} 		// col 2
  		   else if ( number3=='X' && number6=='X' && number9=='X')
  			   	{ winnerMessage = "Player Win" ; gameOver=1;}		// col 3
  		   else if ( number1=='X' && number2=='X' && number3=='X')
  		   		{ winnerMessage = "Player Win" ; gameOver=1;}		// row 1
  		   else if ( number4=='X' && number5=='X' && number6=='X')  
  			   	{ winnerMessage = "Player Win" ; gameOver=1;} 		// row 2
  		   else if ( number7=='X' && number8=='X' && number9=='X') 
  			   	{ winnerMessage = "Player Win" ; gameOver=1;} 		// row 3 
  		   else if ( number1=='X' && number5=='X' && number9=='X')  
  		   		{ winnerMessage = "Player Win" ; gameOver=1;} 		// diagonal  1           						   
  		   else if ( number3=='X' && number5=='X' && number7=='X') 
  		   		{ winnerMessage = "Player Win" ; gameOver=1;} 		//  diagonal 2
            
  			// ***** TIE ON GAME in the case we filled all the boxes  ***************
  			// *******************************************************************************************
  			if ( (gameOver != 1) && 
  				(((number1 =='X')||(number1 =='O')) &&
  				((number2  =='X')||(number2 =='O')) &&
  				((number3  =='X')||(number3 =='O')) &&
                  ((number4  =='X')||(number4 =='O')) &&
                  ((number5  =='X')||(number5 =='O')) && 
                  ((number6  =='X')||(number6 =='O')) &&
                  ((number7  =='X')||(number7 =='O')) &&
                  ((number8  =='X')||(number8 =='O')) &&
                  ((number9  =='X')||(number9 =='O'))) )
  				
           		{ winnerMessage = "GAME TIE " ; gameOver=1;} // nobody wins, all boxes filled 
  		  if (gameOver == 1)
  		     {
  		      // ********  DISPLYING  THE WINNER  USER  OR TIE ***********************
  			  JOptionPane.showMessageDialog (null,  
  				"__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
  				"__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
  				"__" + number7 + "__|__" + number8 + "__|__" + number9 + "__", "GAME OVER ! " +
  				winnerMessage ,  JOptionPane.INFORMATION_MESSAGE );	
  		      }
  		  
  		  // ********  we do not want to execute these lines if the user won the game
  		  
  		  
  		  
  		  
  		  if (gameOver != 1)
  		   {
  			// *********   RANDOM SYSTEM MOVE PLUS CHECK THE SQUARE   *********
  			  int initial;
  			do 
  			  {
  			   initial = 1 + (int)(Math.random()* (9) ); // generate a number 1 thru 9
  			  }
  			while ((initial < 1) || (initial > 9));
  			
  			// ****************************************************************
  			if      (initial == 1 && number1 !='X' && number1 !='O'){number1 =  systemMarker;}
  			else if (initial == 2 && number2 !='X' && number2 !='O'){number2 =  systemMarker;}
  			else if (initial == 3 && number3 !='X' && number3 !='O'){number3 =  systemMarker;}	
  			else if (initial == 4 && number4 !='X' && number4 !='O'){number4 =  systemMarker;}	
  			else if (initial == 5 && number5 !='X' && number5 !='O'){number5 =  systemMarker;}	
  			else if (initial == 6 && number6 !='X' && number6 !='O'){number6 =  systemMarker;}
  			else if (initial == 7 && number7 !='X' && number7 !='O'){number7 =  systemMarker;}	
  			else if (initial == 8 && number8 !='X' && number8 !='O'){number8 =  systemMarker;}
  			else if (initial == 9 && number9 !='X' && number9 !='O'){number9 =  systemMarker;}
  		          
  			// ***** SYSTEM  WINNER:   row or column or diagonal  ***************
  			//*******************************************************************  
  			if ( number1=='O' && number4=='O' && number7=='O') 
  				{ winnerMessage = "System Win" ; gameOver=1;}       // col 1
  			else if ( number2=='O' && number5=='O' && number8=='O') 
  				{ winnerMessage = "System Win" ; gameOver=1;}       // col 2
  			else if ( number3=='O' && number6=='O' && number9=='O') 
  				{ winnerMessage = "System Win" ; gameOver=1;}       // col 3
  			else if ( number1=='O' && number2=='O' && number3=='O') 
  				{ winnerMessage = "System Win" ; gameOver=1;}       // row 1
  			else if ( number4=='O' && number5=='O' && number6=='O')  
  				{ winnerMessage = "System Win" ; gameOver=1;}       // row 2 
  			else if ( number7=='O' && number8=='O' && number9=='O') 
  				{ winnerMessage = "System Win" ; gameOver=1;}       // row 3 
  			else if ( number1=='O' && number5=='O' && number9=='O')  
  				{ winnerMessage = "System Win" ; gameOver=1;}       // diagonal  1           						   
  			else if ( number3=='O' && number5=='O' && number7=='O') 
  				{ winnerMessage = "System Win" ; gameOver=1;}       //  diagonal 2
  		          
  			// ***** TIE ON GAME  CHECKING   boxes  ***************
  			// *******************************************************************************************
  			if ( (gameOver != 1) && 
  				(((number1 =='X')||(number1 =='O')) &&
  				((number2  =='X')||(number2 =='O')) && 
  				((number3  =='X')||(number3 =='O')) && 
  				((number4  =='X')||(number4 =='O')) &&
  				((number5  =='X')||(number5 =='O')) &&
  				((number6  =='X')||(number6 =='O')) && 
  				((number7  =='X')||(number7 =='O')) &&
  				((number8  =='X')||(number8 =='O')) && 
  				((number9  =='X')||(number9 =='O'))) )	
  				
  		       { winnerMessage = "GAME TIE " ; gameOver=1;} // nobody wins, all boxes filled 
  			 if (gameOver == 1)
  			   {
  			   // ********  DISPLYING  THE WINNER  SYSTEM OR TIE ***********************
  			    JOptionPane.showMessageDialog (null,  
  				"__" + number1 + "__|__" + number2 + "__|__" + number3 + "__" + "\n" +
  				"__" + number4 + "__|__" + number5 + "__|__" + number6 + "__" + "\n" + 
  				"__" + number7 + "__|__" + number8 + "__|__" + number9 + "__", "GAME OVER ! " +
  				winnerMessage ,  JOptionPane.INFORMATION_MESSAGE );	
  			   }
  		
  		   } // ******************* END OF THE BLOCK  FOR THE SYSTEM ********************
  		  
  				
  	  } while (gameOver== 0) ;
  	  // ***** END LOOP #2,  


  	  answer = JOptionPane.showInputDialog( null, "Would you like to play again? y/n"); 
  
  	  
  	} while (answer.equalsIgnoreCase("y"));
       // ******** END OF LOOP #1, TERMINATE THE GAME, DO NOT WANT PLAYING ************
  	
  	 JOptionPane.showMessageDialog (null, "SORRY YOU DO NOT WANT TO KEEP PLAYING, GOODBYE ! " );	
  
  	
  } // end of Main

} // end of Class

 
/* OUTLINE OF THE TIC TAC TOE GAME 
 * 
 * Begin
 * Initialized global variables
 *  LOOP #1 with 'DO/WHILE (Want to keep playing the game)

 *       
 *  - LOOP #2 with 'DO/WHILE' (The Game is not over until Filled all 9 SQAURE)
 *           - It is the Turn of the USER to pick a SQAURE
 *     ******************************    
 *     STEP #1: Validate INPUT
 *     ******************************
 *           - LOOP #3 with 'DO/WHILE' (User Valid Entry, not picked a Slot by 'O' or 'X')
 *                  - Display the Board
 *                  - Get the Response from the user
 *                     a) check for a valid number 1,2,3,4,5,6,7,8,9
 *                         if it is wrong, display the message
 *                         Redraw the board  
 *                     b) check that the square pick is free
 *                        if not taken,
 *                        -set the SQUARE
 *                        -set the Switch for Valid Entry
 *                         ELSE display a message and
 *                         dre-draw the board  
 *           - LOOP #3 END Upon a Valid Entry !!!!!
 *           
 *     *****************************************************
 *     STEP #2: to redraw the board - bypass !!!!
 *     *****************************************************
 *     
 *     
 *     STEP #3: CHECK FOR USER AS A WINNER 
 *     ******************************************************
 *         -check for 3 square in a row, col, or diagonal
 *         -check for a tie squares
 *         -if a  winner set the switch as game over
 *         - ***DISPLAY THE BOARD WITH THE USER AS THE WINNER OR TIE
 *         
 *     ******NOTE:  CODE EXECUTED ONLY IF THE USER DID NOT WIN ****
 *     STEP #4: -- GENERATE SYSTEM MOVE  
 *         - Generate a random number 1-to 9
 *         - check 1-9 
 *         - check that the square pick is free
 *           if not taken,
 *              -set the SQUARE
 *              -set the Switch for Valid Entry
 *              
 *     *******************************************************
 *     STEP #5: to redraw the board - Bypass!!!!!
 *     *******************************************************
 *     
 *     
 *     STEP #6: CHECK FOR SYSTEM AS A WINNER
 *     *********************************************************
 *         -Check for 3 square in a row, col, or diagonal
 *         -check for a tie squares 
 *         - *** DISPLAY THE BOARD WITH THE SYSTEM AS A WINNER OR TIE ****
 *         
 *  -- LOOPING TO ABAOVE UNTIL  GAME IS OVER
 * 
 * - DO WE WANT TO KEEP PLAYING 
 * - Ask to the user if wants to play another MATCH against the system
 * - IF the user said "YES",  keep in the LOOP #1, and display again the Board 
 *      with initial conditions
 *   ELSE
 *      terminate the game
 *      
 *- LOOP #1 END !!!!!!
 *- Display a message of goodbye
 *- Terminate the program
 * 
 */
