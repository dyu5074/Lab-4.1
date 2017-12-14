
public abstract class Card {
	private String rank;
	private String suit;
	private int pointValue;
	
	public void CardClass(String rank, String suit, int pointvalue)
	{
		this.rank = rank;
		this.suit = suit; 
		this.pointValue = pointvalue;
	}
	public String getRank()
	{
		return this.rank;
	}
	public String getSuit()
	{
		return this.suit;
	}
	public int getPointValue()
	{
		return this.pointValue;
	}
	public boolean equals(Card otherCard)
	{
		if(this.rank == otherCard.getRank() && this.suit == otherCard.getSuit())
		{
			return true;
		}
		return false;
	}
	public String toString()
	{
		return "Rank : " +this.rank +"Suit : "+this.suit+"PointValue : "+this.pointValue;
	}
}
