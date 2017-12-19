package lab;
import java.util.ArrayList;
public class Deck {
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	public Deck(String[] rank, String[] suit, int[] pointvalue) 
	{
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
		return unDealt.size()==0;
	}
	public int size ()
	{
		return unDealt.size();
	}
	public Card deal()
	{
		Card i = unDealt.get((int)(Math.random()*unDealt.size()));
		Dealt.add(i);
		return i;
	}
	public void shuffle()
	{
		while(Dealt.size() > 0)		
		{
			 unDealt.add(Dealt.get(0));
			 Dealt.remove(0);
		}
		for(int k = 51; k > 0; k++)
		{
			 int i = (int)(Math.random()*k);
			 Card x = Dealt.get(k);
			 Dealt.set(k,Dealt.get(i));
			 Dealt.set(i,x);
		}
	}
}
