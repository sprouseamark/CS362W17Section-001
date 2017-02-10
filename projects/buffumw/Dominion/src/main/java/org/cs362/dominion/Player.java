package org.cs362.dominion;
import java.util.ArrayList;
import java.util.Scanner;

public class Player {
	public String username;
	private Deck hand;
	private Deck draw;
	private Deck discard;
	private int points;
	private int actions;
	private int values;
	private int buys;
	private int cards;
	private int coins;
	
	Player()
	{
		hand = new Deck();
		draw = new Deck();
		discard = new Deck();
		username = "";
		points = 0;
	}
	
	Player(Deck hand, Deck draw, Deck discard, int points)
	{
		this.hand = hand;
		this.draw = draw;
		this.discard = discard;
		this.points = points;
	}
	
	// Getters
	public Deck getDraw()
	{
		return draw;
	}
	
	public Deck getHand()
	{
		return hand;
	}
	
	public Deck getDiscard()
	{
		return discard;
	}
	
	public int getCoins()
	{
		return coins;
	}
	
	// Mutators
	public Deck draw(int numDraws)
	{
		
		for(int itr = 0; itr < numDraws; itr++)
		{
			if(draw.isEmpty())
			{
				reShuffle();
			}
			hand.addCardToTop(draw.draw());
		}
		
		return hand;
	}
	
	public Card draw(){
		if(draw.isEmpty())
		{
			reShuffle();
		}
		hand.addCardToTop(draw.draw());
		return hand.getTopCard();
	}
	
	public void discardTopHandCard()
	{
		discard.addCardToTop(hand.draw());
	}
	
	private void reShuffle()
	{
		while(!discard.isEmpty())
		{
			draw.addCardToTop(discard.draw());
		}
		draw.shuffle();
	}
	
	// Adders
	public void setDeck(Deck deck)
	{
		this.draw = deck;
		this.draw.shuffle();
	}
	
	public void addCoins(int numCoins)
	{
		coins += numCoins;
	}
	
	// Play
	public ArrayList<String> playActions()
	{
		
		Deck temp = new Deck();
		ArrayList<String> names = new ArrayList<String>();
		temp = hand.filterBy(Card.Type.Action);
		actions = 1;
		buys = 0;
		cards = 0;
		coins = 0;
		
		while(actions > 0)
		{
			System.out.println("You have " + actions + " actions left");
			if(temp.size() == 0)
			{
				System.out.println("You have no action cards in your hand.");
				actions = 0;
				break;
			}else{
				System.out.println("Here are your choices: " + temp);
			}
			Scanner in = new Scanner(System.in);
			
			String choice = in.nextLine();
			System.out.println("Your choice is: " + temp.compare(choice));
			
			if(temp.compare(choice) != null)
			{
				Card playCard = temp.compare(choice);
				actions+=playCard.getActions();
				buys+=playCard.getBuys();
				cards+=playCard.getCards();
				coins+=playCard.getCoinsWorth();
				// implement special action phase stuff
				names.add(playCard.getName().toString());
				
				discard.addCardToTop(hand.removeCard(playCard));
				
			}
			for(int itr = 0; itr < cards; itr++)
			{
				hand.addCardToTop(draw.draw());
			}
			temp = hand.filterBy(Card.Type.Action);
			actions--;
		}
		System.out.println("Moving on to buying phase");
		for(int itr = 0; itr < hand.size(); itr++)
		{
			if(hand.getCardAt(itr).getType() == Card.Type.Treasure)
			{
				coins += hand.getCardAt(itr).getCoinsWorth();
			}
		}
		return names;
	}
	
	public boolean playPurchasing(Deck drawPile)
	{
		Card drawnCard = drawPile.getTopCard();
		if(coins-drawnCard.getCost() < 0)
		{
			return false;
		}
		
		discard.addCardToTop(drawPile.draw());
		while(!hand.isEmpty())
		{
			discard.addCardToBottom(hand.draw());
		}
		
//		System.out.printf("\n\nDraw: %s\n\n", draw);
//		System.out.printf("\n\nHand: %s\n\n", hand);
//		System.out.printf("\n\nDiscard: %s\n\n", discard);
		
		return true;
	}
	
	public String toString()
	{
		return ""+draw.size();
	}
	
	
}