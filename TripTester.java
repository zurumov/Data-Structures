// ********************************************************
// CCS2110 Lab 1 - Part 1
// Five friends, one trip, five expenses.
// ********************************************************
public class TripTester
{
	public static void main(String[] args)
	{
		String[] people = { "Anna", "Ben", "Chris", "Dora", "Eli" };

		// Step 1 test, when both subclasses are written:
		//   1. Uncomment these four lines, and run.
		//   2. Write down the four numbers (Checkpoint 1).
		//   3. Comment them out again before Step 2.
		// System.out.println(new PersonalExpense("Dora", "Souvenir", 1500).shareOf("Dora"));
		// System.out.println(new PersonalExpense("Dora", "Souvenir", 1500).shareOf("Anna"));
		// System.out.println(new SharedExpense("Anna", "Hotel", 10000, people).shareOf("Ben"));
		// System.out.println(new SharedExpense("Chris", "Coffee", 1000,
		//         new String[] { "Anna", "Ben", "Chris" }).shareOf("Eli"));

		// Step 2: create an array that will hold five expenses, and store these in it:
		//    Anna  paid 100.00  "Hotel, 2 nights"  shared by all five
		//    Ben   paid  90.00  "Car rental"       shared by all five
		//    Chris paid  90.00  "Dinner"           shared by all five
		//    Eli   paid  20.00  "Museum tickets"   shared by all five
		//    Dora  paid  15.00  "Souvenir"         personal
		//    (amounts in cents: 100.00 is 10000)

		// Step 3: display every expense using ONE loop:
		//    type, payer, description, amount (use Expense.euros(...))

		// Step 4: a person's balance = what they paid - their total share.
		//   1. Compute every balance.
		//   2. Store the balances in a long[], in the same order as people.
		//   3. Display them.

		// Step 5: call sumIsZero(balances) and display the result.
	}

	// Precondition for settling up (Lecture 1): the balances must sum to EXACTLY zero.
	// TODO: return true if they do.
	static boolean sumIsZero(long[] balances)
	{
		return false;
	}
}
