// ********************************************************
// CCS2110 Lab 1 - Part 1
// An expense split EQUALLY between the people in sharedBy.
// ********************************************************
class SharedExpense extends Expense
{
	private String[] sharedBy;

	public SharedExpense(String payerIn, String descriptionIn, long amountCentsIn, String[] sharedByIn)
	{
		super(payerIn, descriptionIn, amountCentsIn);
		sharedBy = sharedByIn;
	}

	public String[] getSharedBy()
	{
		return sharedBy;
	}

	// TODO: if person is one of the people in sharedBy, return the
	// amount divided equally between them; otherwise return 0.
	// (Compare Strings with .equals(), not ==)
	public long shareOf(String person)
	{
		int counter = 0;
		boolean personIsInArray = false;
		for (i = 0; i < sharedBy.length; i++) {
			if (sharedBy != null) {counter++;}
			if (sharedBy[i].equals(person)) {personIsInArray=true;}
		}
		if (!personIsInArray) {return 0;}
		else {
			if (counter > 0) {
				return super.getAmountCents() / counter;
			}
			else {return 0;}
		}
		
	}

	// TODO
	public String getType()
	{
		return "";
	}
}
