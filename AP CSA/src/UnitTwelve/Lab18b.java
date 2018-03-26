package UnitTwelve;

import static java.lang.System.*;

public class Lab18b
{
   public static void main( String args[] )
   {
		Monster zero = new Monster();
		Monster one = new Monster(8);
		Monster sue = new Monster(9, 4);
		Monster harry = new Monster(1, 2, 3);
		out.println("\nzero Monster :: " + zero);		
		out.println("\none Monster :: " + one);
		out.println("\nsue Monster :: " + sue);
		out.println("\nharry Monster :: " + harry);

		out.println("\nchanging harry's properties ");				
		harry.setMyWeight(7);
		harry.setMyWeight(6);
		harry.setMyAge(5);
		out.println("\nharry Monster :: " + harry);

		out.println("\ncloning harry");	
		sue = (Monster)harry.clone();
		out.println("\nsue Monster :: " + sue);

		Monster mOne = new Monster(33,33,11);
		Monster mTwo = new Monster(55,33,11);

		out.println("\nMonster 1 :: " + mOne);
		out.println("\nMonster 2 :: " + mTwo);

		out.print("\nmOne.equals(mTwo) == ");
		out.println(mOne.equals(mTwo));

		out.print("\nmOne.compareTo(mTwo) == ");
		out.println(mOne.compareTo(mTwo));
		out.print("\nmTwo.compareTo(mOne) == ");
		out.println(mTwo.compareTo(mOne));
	}
}