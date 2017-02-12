package dominion;

import static org.junit.Assert.*;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class Test1_2 {

	@Test
	public void top_test() {
		String[] pass_in={"2"};
		Main.main(pass_in);
	}
	
	@Test
	public void testSort()
	{
		int[] test_array={2,1,4,3};
		int[] result={1,2,4,3};
		//gameState test = null;
		assertEquals(Arrays.equals(Player.sortArrayAsc(test_array, 0,2), result),true);
		
	}
	
	@Test
	public void testInitializeGame()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		assertEquals(test.numPlayers,2);
	}
	
	@Test
	public void testShuffle()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		test.players[0].deckCount=4;
		
		int[] check=new int[4];
		for(int i=0;i<4;i++)
		{
			test.players[0].deck[i]=i;
			check[i]=i;
		}
		test.players[0].shuffle();
		if(Arrays.equals(test.players[0].deck, check))
		{
			test.players[0].shuffle();
			if(Arrays.equals(test.players[0].deck, check))
			{
				assertEquals(0,1);
			}
			else assertEquals(1,1);
		}
		else
			assertEquals(1,1);
	}
	
	@Test
	public void testplayCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.playCard(0, 0, 0, 0);
	}

	@Test
	public void testbuyCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.coins=15;
		test.numBuys=2;
		test.buyCard(3);
		assertEquals(test.coins,7);
	}
	
	@Test
	public void testnumHandCards()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		assertEquals(test.numHandCards(),5);
	}
	
	@Test
	public void testhandCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.whoseTurn=0;
		test.players[0].hand[3]=2;
		assertEquals(test.handCard(3),2);
		test.handCard(0);
	}
	
	@Test
	public void testsupplyCount()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
	
		test.supplyCount[0]=7;
		assertEquals(test.supplyCount(0),7);		
	}
	
	@Test
	public void testfullDeckCount()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
	
		test.players[0].deck[0]=1000;
		test.players[0].hand[0]=1000;
		//should be no cards in the discard pile, so it shouldn't even look in the discard pile
		test.players[0].discard[0]=1000;
		assertEquals(test.players[0].fullDeckCount(1000),2);
	}
	
	@Test
	public void testwhoseTurn()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
	
		assertEquals(test.whoseTurn(),0);
	}
	
	@Test
	public void testendTurn()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.endTurn();
		assertEquals(test.whoseTurn(),1);
		
	}
	
	@Test
	public void testisGameOver()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		test.supplyCount[CARD.province.get_CARD()]=0;
		assertEquals(test.isGameOver(),1);
		test.supplyCount[CARD.province.get_CARD()]=1;
		assertEquals(test.isGameOver(),0);
	}
	
	@Test
	public void testscoreFor()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		int i;
		test.initializeGame(2, k, 4);
		
		for (i = 0; i < test.players[0].discardCount; i++)
	    {
	      test.players[0].deck[i] = 0;
	    }
		for (i = 0; i < test.players[0].discardCount; i++)
	    {
	      test.players[0].discard[i] = 0;
	    }
		for (i = 0; i < test.players[0].handcount; i++)
	    {
		   test.players[0].hand[i] = 0;
		}
		//All curses
		assertEquals(test.players[0].scoreFor(),-5);
	}
	
	@Test
	public void testdrawCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		
		test.players[0].drawCard();
		int old_card=test.players[0].deck[test.players[0].deckCount];
		assertEquals(test.players[0].hand[test.players[0].handcount - 1], old_card);
	}
	

	@Test
	public void testgetCost()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		
		for(int i=0;i<19;i++)
		{
			if(i==CARD.mine.get_CARD())
				assertEquals(test.getCost(i),5);
		}
	}
	
	@Test
	public void testcardEffect()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		intWrapper i = new intWrapper();
		i.int_wrapped=0;
		
		
		
		int old_cards=test.players[0].handcount;
		test.cardEffect(0, -1, -1, -1, 0, i);
		//Draw card, then discard one
		assertEquals(old_cards,test.players[0].handcount);
		
		old_cards=test.players[0].handcount;
		test.cardEffect(CARD.council_room.get_CARD(), -1, -1, -1, 0, i);
		//four cards drawn, 1 discarded
		assertEquals(old_cards+3, test.players[0].handcount);
		
		test.cardEffect(CARD.feast.get_CARD(), 1, -1, -1, 0, i);

		int[] choice=test.players[0].hand;
		test.cardEffect(CARD.mine.get_CARD(), 1, -1, -1, 0, i);
		
	    if (Arrays.equals(test.players[0].deck, choice))
	    {
	     //Make sure a card is discarded, so decks not equal
	     assertEquals(1,0);         
	          
	    }
       
	    
	    
	    
	    
	   
	    
	    
	    
	    test.initializeGame(2, k, 4);
	    old_cards=test.players[0].handcount;
	    test.cardEffect(CARD.ambassador.get_CARD(), 1, 2, -1, 0, i);
	    //assertEquals(old_cards-1,test.handcount);
	    
	    int old_coins=test.coins;
	    test.cardEffect(CARD.cutpurse.get_CARD(), 1, 2, -1, 0, i);
	    assertEquals(old_coins+2,test.coins);
	    
	    old_coins=test.coins;
	    test.cardEffect(CARD.embargo.get_CARD(), 1, 2, -1, 0, i);
	    assertEquals(old_coins+2,test.coins);
	    
	    test.initializeGame(2, k, 4);
	    old_cards=test.players[0].handcount;
	    test.cardEffect(CARD.outpost.get_CARD(), 1, 1, -1, 0, i);
	    //one card discarded
	    assertEquals(old_cards-1,test.players[0].handcount);
	    
	    test.initializeGame(2, k, 4);
	    old_cards=test.players[0].handcount;
	    test.cardEffect(CARD.salvager.get_CARD(), 1, 1, -1, 0, i);
	    //two cards discarded in total
	    assertEquals(old_cards-2,test.players[0].handcount);
	    
	    test.initializeGame(2, k, 4);
	    int old_cards_deck=test.players[0].deckCount;
	    int old_cards_discard=test.players[0].discardCount;
	    test.cardEffect(CARD.sea_hag.get_CARD(), 1, 1, -1, 0, i);
	    //current players's deck/discard shouldn't be changed
	    assertEquals(old_cards_deck,test.players[0].deckCount);
	    assertEquals(old_cards_discard,test.players[0].discardCount);
	    
	    test.initializeGame(2, k, 4);
		test.players[0].hand[0]=CARD.estate.get_CARD();
	    int old_numBuys=test.numBuys;
	    old_coins=test.coins;
	    test.cardEffect(CARD.baron.get_CARD(), 1, 1, -1, 0, i);
	    assertEquals(old_numBuys+1,test.numBuys);
	    assertEquals(old_coins+4,test.coins);
	    
	    
	}
	
	@Test
	public void testdiscardCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		int old_handcount=test.players[0].handcount;
		test.discardCard(0, 0, 0);
		assertEquals(test.players[0].handcount,old_handcount-1);
	}
	
	@Test
	public void testgainCard()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		int olddiscard=test.players[0].discardCount;
		test.gainCard(0, 0, 0);
		assertEquals(test.players[0].discardCount, olddiscard+1);
		
		int olddeck=test.players[0].deckCount;
		test.gainCard(0, 1, 0);
		assertEquals(test.players[0].deckCount, olddeck+1);
		
		int oldhand=test.players[0].handcount;
		test.gainCard(0, 2, 0);
		assertEquals(test.players[0].handcount, oldhand+1);
	}
	
	@Test
	public void testupdateCoins()
	{
		gameState test=new gameState();
		int[] k = {CARD.adventurer.get_CARD(), CARD.gardens.get_CARD(), CARD.embargo.get_CARD(),CARD.mine.get_CARD(), CARD.cutpurse.get_CARD(), 
			       CARD.sea_hag.get_CARD()};
		test.initializeGame(2, k, 4);
		
		int oldcoins=test.coins;
		intWrapper i=new intWrapper();
		i.int_wrapped=4;
		test.updateCoins(0,i);
		assertEquals(oldcoins,test.coins-4);
	}
	
}
