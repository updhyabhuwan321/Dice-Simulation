import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 18,000 times
   and counts the number of times doubles are rolled for
   each possible different pair of doubles.
   * 
   * 
   * Modified by : BHUWAN UPADHYAYA
   * DATE : 2/10/2024
   * 
*/

public class BU_DiceSimulation
{
   public static void main(String[] args)
   {
      final int NUMBER = 18000;  // Number of dice rolls

      // A random number generator used in
      // simulating the rolling of dice
      Random generator = new Random();

      int die1Value;      // Value of the first die
      int die2Value;      // Value of the second die
      int count = 0;      // Total number of dice rolls
      int snakeEyes = 0;  // Number of snake eyes rolls
      int twos = 0;       // Number of double two rolls
      int threes = 0;     // Number of double three rolls
      int fours = 0;      // Number of double four rolls
      int fives = 0;      // Number of double five rolls
      int sixes = 0;      // Number of boxcars rolls

      // TASK #1 Enter your code for the algorithm here
       System.out.println("The following is the while loop for this program");
       System.out.println(" ");
      
      while (count < NUMBER)
      {
          //Get the value of the first die by “rolling” the first die.
          die1Value = 1 + generator.nextInt(6);
          
          //Get the value of the second die by “rolling” the second die.
           die2Value = 1 + generator.nextInt(6);
         
         // If the value of the first die is the same as the value of the second die
         if(die1Value == die2Value)
         {
            
            // If value of first die is 1
            if(die1Value == 1)
            {
                  // Increment the number of times snake eyes were rolled
                  ++snakeEyes;
            }
            // Else if value of the first die is 2
            else if(die1Value == 2)
            {
                  // Increment the number of times twos were rolled
                  ++twos;
            }
            // Else if value of the first die is 3
            else if(die1Value == 3)
            {
                  // Increment the number of times threes were rolled
                  ++threes;
            }
            // Else if value of the first die is 4
            else if(die1Value == 4)
            {
                  // Increment the number of times fours were rolled
                  ++fours;
            }
            // Else if value of the first die is 5
            else if(die1Value == 5)
            {
                  // Increment the number of times fives were rolled
                  ++fives;
            }
            // Else if value of the first die is 6
            else if(die1Value == 6)
            {
                  // Increment the number of times sixes were rolled
                  ++sixes;
            }
            
         }
         
         
         // Increment the number of times the dice were rolled
         ++count;
      }

      // Display the results
      System.out.println ("You rolled snake eyes " + snakeEyes +
	                      " out of " + count + " rolls.");
      System.out.println ("You rolled double twos " + twos +
                    	  " out of " + count + " rolls.");
      System.out.println ("You rolled double threes " + threes +
	                      " out of " + count + " rolls.");
      System.out.println ("You rolled double fours " + fours +
	                      " out of " + count + " rolls.");
      System.out.println ("You rolled double fives " + fives +
	                      " out of " + count + " rolls.");
      System.out.println ("You rolled boxcars " + sixes +
	                      " out of " + count + " rolls.");
   }
}