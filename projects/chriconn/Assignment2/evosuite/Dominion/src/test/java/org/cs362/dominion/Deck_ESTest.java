/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 00:26:28 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Card;
import org.cs362.dominion.Deck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Deck_ESTest extends Deck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Deck deck0 = new Deck("[@29sbM[t)vlh_Sp");
      deck0.printDeck();
      Card card0 = new Card();
      deck0.addNumberOfCardType(645, card0);
      card0.setBuys(645);
      deck0.addCard(card0);
      deck0.drawCardAtIndex(645);
      deck0.printDeck();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Card card0 = new Card();
      card0.setValue(2);
      Deck deck0 = new Deck(92, card0);
      card0.setCost(90);
      card0.setVictoryPoints(999);
      card0.setCost((-826));
      deck0.indexOf("NULL CARD\n");
      Random.setNextRandom((-826));
      deck0.indexOfType("witGh");
      deck0.drawCardAtIndex(2);
      deck0.drawCard((String) null);
      deck0.drawCard();
      System.setCurrentTimeMillis(2);
      // Undeclared exception!
      try {
        deck0.printType((String) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck(865, card0);
      card0.setCost(122);
      deck0.addNumberOfCardType(865, card0);
      deck0.addBottomCard(card0);
      card0.setBuys((-1512));
      deck0.printType("f");
      deck0.cardInfo(865);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("");
      deck0.emptyDeckCard = card0;
      Card card1 = deck0.emptyDeckCard;
      Card card2 = deck0.cardInfo(0);
      deck0.indexOfType("");
      deck0.addBottomCard(card0);
      ArrayList<Card> arrayList0 = deck0.deck;
      card2.setVictoryPoints(1565);
      card2.setName(">.tb4ETYy %cv}");
      card2.setCards((-1));
      deck0.drawCard(">.tb4ETYy %cv}");
      arrayList0.add(card0);
      deck0.deck = arrayList0;
      card0.setName("");
      card0.setBuys(0);
      deck0.getName();
      Card card3 = new Card("");
      card3.printCard();
      arrayList0.subList(0, 0);
      card3.setActions((-1));
      arrayList0.add(card0);
      deck0.addBottomCard(card3);
      deck0.indexOf("");
      deck0.printDeck();
      deck0.printType("");
      deck0.hasCard("");
      Deck deck1 = new Deck();
      deck1.drawCard("Trash a card from your hand, gain value that the card is worth in purchasing power");
      deck0.shuffle();
      Card card4 = deck0.emptyDeckCard;
      Card card5 = deck0.emptyDeckCard;
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck(2, card0);
      deck0.numCards();
      card0.setValue((-1514));
      card0.setVictoryPoints((-1514));
      card0.printCard();
      deck0.printType("DTNC_\"9QsQSs\"[s$g");
      card0.setCards(625);
      deck0.addNumberOfCardType(620, card0);
      deck0.drawCardAtIndex(2);
      deck0.hasType("DTNC_\"9QsQSs\"[s$g");
      deck0.indexOf("DTNC_\"9QsQSs\"[s$g");
      deck0.drawCardAtIndex(2);
      // Undeclared exception!
      try {
        deck0.cardInfo(1316);
        fail("Expecting exception: IndexOutOfBoundsException");

      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1316, Size: 620
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Deck deck0 = new Deck("starter");
      Card card0 = new Card();
      card0.setVictoryPoints(618);
      deck0.addCard(card0);
      deck0.deck = null;
      card0.setCards(606);
      card0.setDescription("_Gt<)iKP-`7Q");
      card0.printCard();
      // Undeclared exception!
      try {
        deck0.addNumberOfCardType(618, card0);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("");
      deck0.emptyDeckCard = card0;
      Card card1 = deck0.emptyDeckCard;
      Card card2 = deck0.cardInfo(0);
      deck0.indexOfType("");
      deck0.addBottomCard(card0);
      ArrayList<Card> arrayList0 = deck0.deck;
      card2.setName(">.tb4ETYy %cv}");
      card2.setCards((-1));
      deck0.drawCard(">.tb4ETYy %cv}");
      arrayList0.add(card2);
      arrayList0.add(card0);
      deck0.deck = arrayList0;
      card0.setName("");
      card0.setBuys(0);
      deck0.getName();
      Card card3 = new Card("");
      card3.printCard();
      arrayList0.subList(0, 0);
      card3.setActions((-1));
      arrayList0.add(card0);
      deck0.addBottomCard(card3);
      deck0.indexOf("");
      deck0.printDeck();
      deck0.printType("");
      deck0.hasCard("");
      Deck deck1 = new Deck();
      deck1.drawCard("Trash a card from your hand, gain value that the card is worth in purchasing power");
      deck0.shuffle();
      Card card4 = deck0.emptyDeckCard;
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card();
      card0.setBuys(2519);
      card0.setVictoryPoints((-821));
      card0.setCards(Integer.MIN_VALUE);
      deck0.emptyDeckCard = card0;
      deck0.cardInfo(Integer.MIN_VALUE);
      deck0.tokens = Integer.MIN_VALUE;
      deck0.numCards();
      deck0.printType("a7da_h|aA{L/o");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Deck deck0 = new Deck("Each other player gains a Curse card.");
      deck0.resetTokens();
      deck0.printDeck();
      Card card0 = new Card();
      deck0.hasCard("\nDescription: ");
      deck0.emptyDeckCard = card0;
      card0.setVictoryPoints(14);
      deck0.hasType("Each other player gains a Curse card.");
      deck0.tokens = 3;
      card0.setDescription("Each other player gains a Curse card.");
      deck0.deck = null;
      // Undeclared exception!
      try {
        deck0.cardInfo(458);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("");
      deck0.emptyDeckCard = card0;
      Card card1 = deck0.emptyDeckCard;
      Card card2 = deck0.cardInfo(0);
      deck0.indexOfType("");
      deck0.addBottomCard(card0);
      ArrayList<Card> arrayList0 = deck0.deck;
      card2.setName(">.tb4ETYy %cv}");
      card2.setActions((-1));
      deck0.drawCard(">.tb4ETYy %cv}");
      arrayList0.add(card2);
      arrayList0.add(card0);
      deck0.deck = arrayList0;
      card0.setName("");
      card0.setBuys(0);
      deck0.getName();
      Card card3 = new Card("");
      card3.printCard();
      arrayList0.subList(0, 0);
      card3.setActions((-1));
      arrayList0.add(card0);
      deck0.addBottomCard(card3);
      deck0.indexOf("");
      deck0.printDeck();
      deck0.printType("");
      deck0.hasCard("");
      Deck deck1 = new Deck();
      deck1.drawCard("Trash a card from your hand, gain value that the card is worth in purchasing power");
      deck0.shuffle();
      Card card4 = new Card("");
      // Undeclared exception!
      try {
        deck1.getName();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("");
      deck0.emptyDeckCard = card0;
      Card card1 = deck0.emptyDeckCard;
      Card card2 = deck0.cardInfo(0);
      deck0.indexOfType("");
      card0.setVictoryPoints((-1));
      deck0.addBottomCard(card0);
      ArrayList<Card> arrayList0 = deck0.deck;
      card2.setName(">.tb4ETYy %cv}");
      deck0.drawCard(">.tb4ETYy %cv}");
      arrayList0.add(card2);
      arrayList0.add(card0);
      deck0.deck = arrayList0;
      card0.setName("");
      deck0.emptyDeckCard.setBuys((-1));
      deck0.getName();
      Card card3 = new Card("");
      card3.printCard();
      arrayList0.subList(0, 0);
      card3.setActions((-1));
      arrayList0.add(card0);
      deck0.addBottomCard(card3);
      deck0.indexOf("");
      deck0.printDeck();
      deck0.printType("");
      deck0.hasCard("");
      Deck deck1 = new Deck();
      deck1.drawCard("Trash a card from your hand, gain value that the card is worth in purchasing power");
      deck0.shuffle();
      Card card4 = deck0.emptyDeckCard;
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Deck deck0 = new Deck("");
      deck0.hasType("3{*)P+T6S`ARnL!Jjp,");
      Card card0 = new Card();
      card0.setActions((-1744));
      card0.setBuys(9);
      // Undeclared exception!
      try {
        deck0.addNumberOfCardType(2147483645, card0);
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("mine");
      card0.setBuys(2467);
      card0.setName("mine");
      card0.setActions(2467);
      deck0.tokens = 2467;
      deck0.addCard(card0);
      Card card1 = new Card("mine");
      deck0.tokens = (-961);
      deck0.tokens = (-167);
      deck0.numCards();
      deck0.empty();
      deck0.hasType((String) null);
      Random.setNextRandom(10);
      System.setCurrentTimeMillis((-167));
      deck0.drawCard("mine");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Card card0 = new Card("estate");
      Deck deck0 = null;
      try {
        deck0 = new Deck(1000000000, card0);
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      System.setCurrentTimeMillis((-2441L));
      Card card0 = new Card();
      card0.setDescription("[Ithh~2:nnr");
      Deck deck0 = new Deck(13, card0);
      card0.setBuys(38);
      deck0.tokens = (-1871);
      deck0.drawCard();
      card0.setCards(195);
      deck0.drawCardAtIndex(18);
      deck0.getName();
      Deck deck1 = null;
      try {
        deck1 = new Deck((String) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card();
      card0.printCard();
      deck0.tokens = 5550;
      card0.setBuys(5550);
      card0.printCard();
      card0.setCost((-382));
      card0.setValue(1157);
      card0.setActions((-382));
      deck0.addBottomCard(card0);
      deck0.getTokens();
      deck0.hasType("YnTw32.%MPyS{=sQ&bO");
      deck0.printType("5TY^ #uDm)O|pB");
      deck0.indexOf("5TY^ #uDm)O|pB");
      deck0.drawCard("5TY^ #uDm)O|pB");
      deck0.empty();
      deck0.tokens = 6;
      deck0.drawCard("5TY^ #uDm)O|pB");
      deck0.getTokens();
      deck0.indexOf("5TY^ #uDm)O|pB");
      Card card1 = new Card("YnTw32.%MPyS{=sQ&bO");
      deck0.emptyDeckCard = card1;
      // Undeclared exception!
      try {
        deck0.drawCardAtIndex((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Card card0 = new Card();
      card0.setBuys((-128));
      Deck deck0 = new Deck((-128), card0);
      Card card1 = new Card();
      deck0.emptyDeckCard = card1;
      deck0.addBottomCard(card1);
      deck0.addCard(card0);
      card0.setValue((-1747));
      card1.setCards((-128));
      deck0.drawCard();
      deck0.indexOf("sjn&uUdngVh");
      card1.printCard();
      card0.setName("=!\"Qk(+0V-CeQW");
      card1.printCard();
      deck0.indexOfType("9*+5y");
      deck0.indexOf("witch");
      int int0 = deck0.tokens;
      card0.setActions((-293));
      deck0.printType("");
      // Undeclared exception!
      try {
        deck0.cardInfo((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Deck deck0 = new Deck("*5J|&{GK04mL{:wVL");
      deck0.indexOfType("*5J|&{GK04mL{:wVL");
      Card card0 = new Card("salvager");
      deck0.addCard(card0);
      deck0.drawCard("salvager");
      deck0.numCards();
      deck0.indexOfType("GzzznFN");
      deck0.printDeck();
      Deck deck1 = new Deck("*5J|&{GK04mL{:wVL");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Deck deck0 = new Deck("*5J|&{GK04mL{:wVL");
      deck0.indexOfType("*5J|&{GK04mL{:wVL");
      deck0.drawCard("salvager");
      deck0.numCards();
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      deck0.deck = arrayList0;
      deck0.indexOfType("GzzznFN");
      arrayList0.add((Card) null);
      deck0.printDeck();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck(582, card0);
      card0.setCoins(582);
      card0.printCard();
      deck0.drawCard("dutchy");
      deck0.cardInfo(32);
      Random.setNextRandom(582);
      deck0.indexOfType("dutchy");
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Deck deck0 = new Deck("estate");
      deck0.drawCard();
      deck0.hasType("estate");
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      deck0.deck = arrayList0;
      arrayList0.spliterator();
      ArrayList<Card> arrayList1 = deck0.deck;
      deck0.deck.add((Card) null);
      deck0.deck = arrayList1;
      deck0.deck.add((Card) null);
      // Undeclared exception!
      try {
        deck0.hasType((String) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Deck deck0 = new Deck("Card #2%d: %-15sDescription: %s\n");
      deck0.deck = null;
      // Undeclared exception!
      try {
        deck0.drawCard();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Deck deck0 = new Deck("7;.HHvO1+\"8Dmh#");
      Card card0 = new Card();
      deck0.addNumberOfCardType(3740, card0);
      card0.setCoins(2221);
      card0.setActions(2394);
      card0.setCoins((-26));
      card0.setBuys(0);
      deck0.addCard(card0);
      ArrayList<Card> arrayList0 = deck0.deck;
      deck0.printType("7;.HHvO1+\"8Dmh#");
      deck0.addBottomCard(card0);
      deck0.getTokens();
      deck0.printDeck();
      deck0.resetTokens();
      deck0.printType("7;.HHvO1+\"8Dmh#");
      // Undeclared exception!
      try {
        deck0.hasType("7;.HHvO1+\"8Dmh#");
        fail("Expecting exception: TooManyResourcesException");

      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck("FunB&");
      deck0.printType("FunB&");
      deck0.addCard(card0);
      deck0.modifyTokens(0);
      card0.setCost(472);
      card0.printCard();
      deck0.modifyTokens(0);
      deck0.hasType("FunB&");
      deck0.printDeck();
      deck0.drawCardAtIndex(0);
      card0.setCost(472);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      card0.setActions(0);
      deck0.deck = arrayList0;
      deck0.printDeck();
      card0.setCards(0);
      card0.setVictoryPoints(0);
      deck0.empty();
      arrayList0.add(card0);
      Deck deck1 = new Deck();
      Deck deck2 = null;
      try {
        deck2 = new Deck(0, (Card) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Card card0 = new Card();
      card0.setValue((-2126));
      card0.setValue(1187);
      Deck deck0 = new Deck(351, card0);
      deck0.emptyDeckCard = null;
      deck0.hasType("\nDescription: ");
      deck0.drawCard();
      card0.setCoins((-1));
      int int0 = deck0.tokens;
      deck0.hasType("\nDescription: ");
      deck0.drawCardAtIndex(1187);
      card0.setDescription("starter");
      deck0.drawCard();
      // Undeclared exception!
      try {
        deck0.cardInfo((-706));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -706
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.hasType("9Z+!x[E?.R*");
      deck0.hasCard("9Z+!x[E?.R*");
      deck0.printDeck();
      deck0.resetTokens();
      deck0.hasType("");
      deck0.getTokens();
      deck0.shuffle();
      Card card0 = new Card();
      deck0.addCard(card0);
      deck0.cardNameEquals(0, (String) null);
      ArrayList<Card> arrayList0 = deck0.deck;
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck(0, card0);
      deck0.printType("");
      deck0.addBottomCard(card0);
      card0.setActions(0);
      deck0.addBottomCard(card0);
      deck0.indexOf("");
      card0.setName("");
      Card card1 = deck0.drawCard();
      ArrayList<Card> arrayList0 = deck0.deck;
      deck0.deck = arrayList0;
      card1.setActions((-1));
      arrayList0.add(card1);
      deck0.tokens = 0;
      card0.setVictoryPoints((-1));
      deck0.drawCardAtIndex(0);
      card0.setCost((-1));
      deck0.printDeck();
      card0.setValue(0);
      // Undeclared exception!
      try {
        arrayList0.add((-1), card1);
        fail("Expecting exception: IndexOutOfBoundsException");

      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1, Size: 1
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck(450, card0);
      card0.setActions(23);
      card0.setCost(7);
      deck0.hasType("");
      card0.setVictoryPoints(7);
      deck0.resetTokens();
      ArrayList<Card> arrayList0 = deck0.deck;
      deck0.indexOf("");
      deck0.indexOfType("");
      Card card1 = new Card("P(VN[{GRzk G#10@,#/");
      deck0.addCard(card1);
      card0.setCards((-1));
      deck0.printType(";");
      deck0.cardInfo(7);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.modifyTokens((-1426));
      deck0.printType("");
      deck0.shuffle();
      deck0.deck = null;
      // Undeclared exception!
      try {
        deck0.shuffle();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Card card0 = new Card("0.");
      card0.setCoins((-331));
      card0.setValue((-1409));
      card0.setName("0.");
      card0.setDescription("");
      card0.setName("0.");
      card0.setVictoryPoints((-1409));
      card0.setCards(3941);
      card0.printCard();
      card0.setValue(3941);
      Deck deck0 = new Deck((-1409), card0);
      deck0.indexOfType("");
      deck0.emptyDeckCard = card0;
      deck0.cardInfo(0);
      deck0.empty();
      card0.setCost((-331));
      deck0.printDeck();
      deck0.getTokens();
      Deck deck1 = new Deck((-712), deck0.emptyDeckCard);
      deck1.hasType("");
      deck1.printType("");
      // Undeclared exception!
      try {
        deck1.cardNameEquals(37, "");
        fail("Expecting exception: IndexOutOfBoundsException");

      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 37, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Card card0 = new Card();
      card0.setBuys((-128));
      Deck deck0 = new Deck((-128), card0);
      Card card1 = new Card();
      deck0.emptyDeckCard = card1;
      deck0.addCard(card0);
      card0.setValue(0);
      card1.setCards((-128));
      deck0.drawCard();
      deck0.indexOf("sjn&uUdngVh");
      card1.printCard();
      card0.setName("=!\"Qk(+0V-CeQW");
      deck0.indexOfType("9*+5y");
      deck0.indexOf("witch");
      int int0 = deck0.tokens;
      deck0.printType("");
      deck0.cardInfo((-1));
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Deck deck0 = new Deck("estate");
      deck0.drawCard();
      deck0.hasType("estate");
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      deck0.deck = arrayList0;
      arrayList0.spliterator();
      ArrayList<Card> arrayList1 = deck0.deck;
      deck0.deck.add((Card) null);
      deck0.deck = arrayList1;
      deck0.deck.add((Card) null);
      // Undeclared exception!
      try {
        deck0.indexOfType("estate");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Card card0 = new Card("silver");
      card0.setCards((-2066));
      card0.setDescription("silver");
      Deck deck0 = new Deck(0, card0);
      card0.setValue(0);
      deck0.resetTokens();
      deck0.emptyDeckCard = card0;
      card0.setVictoryPoints((-578));
      card0.setActions(2);
      deck0.addBottomCard(card0);
      card0.setCards(Integer.MAX_VALUE);
      card0.setCoins(0);
      deck0.hasCard("qC");
      card0.setActions(0);
      deck0.resetTokens();
      Card card1 = deck0.drawCard();
      deck0.printType("silver");
      deck0.resetTokens();
      deck0.shuffle();
      deck0.getName();
      deck0.drawCard();
      deck0.addCard(card1);
      // Undeclared exception!
      try {
        deck0.cardInfo(3681);
        fail("Expecting exception: IndexOutOfBoundsException");

      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 3681, Size: 1
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Deck deck0 = new Deck("starter");
      deck0.drawCard();
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      arrayList0.add((Card) null);
      deck0.deck = arrayList0;
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Deck deck0 = new Deck("whi");
      deck0.drawCard("whi");
      deck0.hasType("silver");
      deck0.printType("silver");
      deck0.deck = null;
      // Undeclared exception!
      try {
        deck0.drawCardAtIndex(999);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Deck deck0 = new Deck("Hour");
      Card card0 = new Card("Hour");
      deck0.printDeck();
      card0.setActions((-282));
      card0.setBuys(0);
      deck0.printType("Hour");
      card0.setVictoryPoints(0);
      card0.setBuys((-282));
      deck0.emptyDeckCard = card0;
      card0.setValue((-282));
      deck0.addCard(card0);
      deck0.shuffle();
      // Undeclared exception!
      try {
        deck0.indexOf("");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.shuffle();
      Card card0 = new Card("S#LZF,;tW(j");
      card0.setActions(2095);
      card0.setDescription("S#LZF,;tW(j");
      card0.setName("copper");
      card0.setValue(2792);
      card0.setCoins(2095);
      card0.setCards(2792);
      deck0.addNumberOfCardType(2095, card0);
      deck0.drawCardAtIndex(2);
      deck0.drawCard();
      deck0.numCards();
      deck0.shuffle();
      deck0.drawCardAtIndex(3);
      deck0.drawCard();
      deck0.printDeck();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Deck deck0 = new Deck("");
      deck0.empty();
      Card card0 = new Card("");
      card0.setCoins((-1069));
      deck0.drawCard("");
      deck0.addNumberOfCardType((-1069), card0);
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      deck0.deck = arrayList0;
      deck0.resetTokens();
      Card card1 = new Card();
      card0.setBuys(11);
      card1.setVictoryPoints(2492);
      deck0.addCard(card1);
      Card card2 = new Card("jo<CLc==(Ka.;LR");
      deck0.addCard(card2);
      Deck deck1 = new Deck("jo<CLc==(Ka.;LR");
      deck0.getTokens();
      deck1.addBottomCard((Card) null);
      deck1.printType("jo<CLc==(Ka.;LR");
      deck0.printDeck();
      deck1.emptyDeckCard = card0;
      // Undeclared exception!
      try {
        deck0.cardNameEquals(0, "R1a}UA5aO.");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck((-1002), card0);
      deck0.resetTokens();
      deck0.getName();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Deck deck0 = null;
      try {
        deck0 = new Deck((String) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("Counts as a negative victory point");
      deck0.addNumberOfCardType((-2432), card0);
      deck0.hasType("");
      deck0.shuffle();
      deck0.addBottomCard((Card) null);
      Card card1 = new Card();
      card1.setCost((-2432));
      Deck deck1 = new Deck(0, card1);
      deck1.drawCard();
      deck1.addCard(card0);
      // Undeclared exception!
      try {
        deck1.drawCard("Card #2%d: %-15sDescription: %s\n");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("_");
      card0.setName("_");
      deck0.addBottomCard(card0);
      deck0.drawCardAtIndex(84);
      deck0.modifyTokens(3697);
      deck0.numCards();
      deck0.indexOf("_");
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.printDeck();
      deck0.drawCardAtIndex(0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("");
      card0.setCards(2584);
      card0.setDescription("'KWVZZGT!v,mk|ywV.");
      card0.setCost(2584);
      deck0.addNumberOfCardType(2584, card0);
      deck0.tokens = 0;
      deck0.printDeck();
      deck0.printDeck();
      deck0.hasType("056(_t|");
      deck0.printDeck();
      deck0.hasType("056(_t|");
      // Undeclared exception!
      try {
        deck0.hasCard("056(_t|");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck(1, card0);
      deck0.hasType("ttEv1LC'~");
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Deck deck0 = new Deck("hu{<{\"7c");
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      deck0.deck = arrayList0;
      deck0.drawCard("{5%=m?;jyX,vV%HA");
      deck0.tokens = 0;
      arrayList0.add((Card) null);
      arrayList0.add((Card) null);
      deck0.shuffle();
      // Undeclared exception!
      try {
        deck0.printType("C$f");
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.drawCard("");
      deck0.modifyTokens((-973));
      deck0.printDeck();
      deck0.hasCard("Card %2d: %s\n");
      deck0.getTokens();
      deck0.indexOfType("");
      deck0.emptyDeckCard = null;
      // Undeclared exception!
      try {
        deck0.cardNameEquals((-973), "@yZ>*p_{MN");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -973
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Deck deck0 = null;
      try {
        deck0 = new Deck(0, (Card) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Deck deck0 = new Deck("starter");
      ArrayList<Card> arrayList0 = new ArrayList<Card>();
      deck0.deck = arrayList0;
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.resetTokens();
      deck0.getTokens();
      deck0.shuffle();
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Deck deck0 = new Deck();
      // Undeclared exception!
      try {
        deck0.cardInfo(198);
        fail("Expecting exception: IndexOutOfBoundsException");

      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 198, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Deck deck0 = new Deck();
      Card card0 = new Card("");
      deck0.emptyDeckCard = card0;
      Card card1 = deck0.emptyDeckCard;
      Card card2 = deck0.cardInfo(0);
      deck0.indexOfType("");
      deck0.addBottomCard(card0);
      ArrayList<Card> arrayList0 = deck0.deck;
      card2.setName(">.tb4ETYy %cv}");
      deck0.drawCard(">.tb4ETYy %cv}");
      arrayList0.add(card2);
      arrayList0.add(card0);
      deck0.deck = arrayList0;
      card0.setName("");
      card0.setBuys(0);
      deck0.getName();
      Card card3 = new Card("");
      card3.printCard();
      arrayList0.subList(0, 0);
      card3.setActions((-1));
      arrayList0.add(card0);
      deck0.addBottomCard(card3);
      deck0.indexOf("");
      deck0.printDeck();
      deck0.printType("");
      deck0.hasCard("");
      Deck deck1 = new Deck();
      deck1.drawCard("Trash a card from your hand, gain value that the card is worth in purchasing power");
      deck0.shuffle();
      Card card4 = deck0.emptyDeckCard;
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Card card0 = new Card();
      Deck deck0 = new Deck(28, card0);
      card0.setVictoryPoints(28);
      deck0.drawCard();
      deck0.hasCard("0");
      card0.setBuys(28);
      deck0.printType("qMB");
      deck0.empty();
      deck0.drawCard((String) null);
      // Undeclared exception!
      try {
        deck0.cardNameEquals(28, "qMB");
        fail("Expecting exception: IndexOutOfBoundsException");

      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 28, Size: 27
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Deck deck0 = new Deck();
      deck0.numCards();
      deck0.modifyTokens(0);
      deck0.hasCard("\nDescription: ");
      deck0.modifyTokens(2213);
      deck0.hasType("{X _ONRkCbCU");
      deck0.drawCard("");
      deck0.resetTokens();
      Deck deck1 = new Deck();
      String string0 = null;
      Card card0 = null;
      try {
        card0 = new Card((String) null);
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Card", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Deck deck0 = new Deck("[@29sbM[t)vlh_Sp");
      deck0.printDeck();
      Card card0 = new Card();
      deck0.addNumberOfCardType(645, card0);
      deck0.addCard(card0);
      deck0.drawCardAtIndex(645);
      deck0.printDeck();
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Deck deck0 = new Deck("");
      deck0.hasCard("?It");
      deck0.hasType("");
      deck0.shuffle();
      Card card0 = new Card();
      card0.setName("?It");
      deck0.addBottomCard(card0);
      deck0.drawCardAtIndex(1416);
      deck0.emptyDeckCard = null;
      deck0.addBottomCard((Card) null);
      deck0.resetTokens();
      Card card1 = deck0.drawCard();
      card1.printCard();
      card1.setCards((-2696));
      card1.setActions((-869));
      card1.setName("O@MArz#]");
      deck0.addCard(card1);
      assertEquals(1, deck0.numCards());

      deck0.drawCard();
      deck0.drawCard();
      deck0.drawCard("6OYweE@DhXn4");
      deck0.drawCard();
      deck0.drawCard("?It");
      deck0.empty();
      deck0.resetTokens();
      assertTrue(deck0.empty());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Card card0 = new Card();
      card0.setBuys((-128));
      Deck deck0 = new Deck((-128), card0);
      Card card1 = new Card();
      deck0.emptyDeckCard = card1;
      deck0.addBottomCard(card1);
      deck0.addCard(card0);
      card0.setValue(0);
      deck0.addNumberOfCardType(2, card1);
      card1.setCards((-128));
      deck0.drawCard();
      deck0.indexOf("sjn&uUdngVh");
      card1.printCard();
      card0.setName("=!\"Qk(+0V-CeQW");
      deck0.hasCard("SM$*");
      card1.printCard();
      deck0.indexOfType("9*+5y");
      deck0.printDeck();
      String string0 = "witch";
      deck0.indexOf("witch");
      int int0 = deck0.tokens;
      card0.setActions((-293));
      deck0.printType("");
      // Undeclared exception!
      try {
        deck0.cardInfo((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");

      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Deck deck0 = new Deck("61KYZ:zyH*3e");
      deck0.resetTokens();
      deck0.resetTokens();
      deck0.shuffle();
      deck0.hasCard("61KYZ:zyH*3e");
      deck0.modifyTokens(7);
      deck0.printType("HMS");
      deck0.emptyDeckCard = null;
      deck0.addCard((Card) null);
      ArrayList<Card> arrayList0 = deck0.deck;
      deck0.hasCard("HMS");
      // Undeclared exception!
      try {
        deck0.getName();
        fail("Expecting exception: NullPointerException");

      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Deck", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Deck deck0 = new Deck("]Q!@]JL`Ox;{'");
      deck0.hasCard("InvalidFractional");
      Card card0 = new Card("InvalidFractional");
      Card card1 = new Card("InvalidFractional");
      card1.setCost((-463));
      card1.setVictoryPoints((-463));
      deck0.addBottomCard(card1);
      deck0.addCard(card1);
      deck0.tokens = 59;
      deck0.emptyDeckCard = card1;
      deck0.hasType("InvalidFractional");
      deck0.empty();
      deck0.printDeck();
      deck0.indexOfType((String) null);
      int int0 = deck0.numCards();
      assertEquals(2, int0);
  }
}
