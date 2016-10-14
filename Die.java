/********************************************************************
//  Die.java 
//
//  Represents one die (singular of dice) with faces showing values
//  between 1 and 6.
//********************************************************************/

public class Die
{
   private final int MAX = 6;  // maximum face value

   private int faceValue;  // current value showing on the die

   //-----------------------------------------------------------------
   //  Constructor: Sets the initial face value.
   //-----------------------------------------------------------------
   public Die()
   {
      faceValue = 1;
   }

   //-----------------------------------------------------------------
   //  Rolls the die and returns the result.
   //-----------------------------------------------------------------
   public int roll()
   {
      faceValue = (int)(Math.random() * MAX) + 1;

      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Face value mutator.
   //-----------------------------------------------------------------
   public void setFaceValue(int value)
   {
      faceValue = value;
   }

   //-----------------------------------------------------------------
   //  Face value accessor.
   //-----------------------------------------------------------------
   public int getFaceValue()
   {
      return faceValue;
   }

   //-----------------------------------------------------------------
   //  Increments the Dice (6 Increments to 1)
   //-----------------------------------------------------------------
   public void nudge() {
	   if(faceValue!=6)
		   faceValue = faceValue + 1;
	   else
		   faceValue = 1;
   }
   //-----------------------------------------------------------------
   //  Returns a string representation of this die.
   //-----------------------------------------------------------------
   public String toString()
   {
     String result = "\n+---+\n| " + faceValue + " |\n+---+\n";
	   // String result = " " + faceValue + " ";
      return result;
   }
}