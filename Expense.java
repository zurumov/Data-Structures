// ********************************************************
// CCS2110 Lab 1 - Part 1
// An expense paid by one person during a group trip.
// Money is stored in integer CENTS (long), never in double:
// 0.1 + 0.2 is not 0.3 in floating point.
// (This file is complete. Do not change it.)
// ********************************************************
abstract class Expense
{
	private String payer;
	private String description;
	private long amountCents;

	public Expense(String payerIn, String descriptionIn, long amountCentsIn)
	{
		payer = payerIn;
		description = descriptionIn;
		amountCents = amountCentsIn;
	}

	public String getPayer()
	{
		return payer;
	}

	public String getDescription()
	{
		return description;
	}

	public long getAmountCents()
	{
		return amountCents;
	}

	// How much of this expense is the given person's share, in cents.
	abstract public long shareOf(String person);

	// "SHARED" or "PERSONAL"
	abstract public String getType();

	// Formats cents as euros, e.g. 4000 -> "40.00", -605 -> "-6.05"
	public static String euros(long cents)
	{
		String sign = cents < 0 ? "-" : "";
		long abs = Math.abs(cents);
		long rest = abs % 100;
		return sign + (abs / 100) + "." + (rest < 10 ? "0" : "") + rest;
	}
}
