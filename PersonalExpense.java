// ********************************************************
// CCS2110 Lab 1 - Part 1
// Something one person bought for themselves (a souvenir).
// It is recorded on the trip, but nobody else shares it.
// ********************************************************
class PersonalExpense extends Expense
{
	public PersonalExpense(String payerIn, String descriptionIn, long amountCentsIn)
	{
		super(payerIn, descriptionIn, amountCentsIn);
	}

	// TODO: the whole amount is the payer's share; everyone else's is 0.
	public long shareOf(String person)
	{
		if (super.getPayer().equals(person)) 
			{
				return super.getAmountCents();
			}	
			else 
			{
				return 0;
			}
	}

	// TODO
	public String getType()
	{
		return "PERSONAL";
	}
}
