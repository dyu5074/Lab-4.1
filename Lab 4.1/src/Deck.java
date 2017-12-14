import java.util.ArrayList;
public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	public void DeckCreator(String[] rank, String[] suit, int[] pointvalue) {
		for (int i = 0 ; i < rank.length;i++)
		{
			for (int j = 0; j < suit.length;j++)
			{
				for (int z = 0; z < pointvalue.length;z++)
				{
					Card newdeck = new Card(rank[i], suit[j], pointvalue[z]);
					unDealt.add(newdeck);
				}
			}
		}
	}
	public boolean isEmpty()
	{
		if(unDealt.size() == 0)
		{
			return true;
		}
		return false;
	}
	
}
