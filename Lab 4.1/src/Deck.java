import java.util.ArrayList;
public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	public Deck() {
		
	}
	public boolean isEmpty()
	{
		if(Card.size() == 0)
		{
			return true;
		}
		return false;
	}
	
}
