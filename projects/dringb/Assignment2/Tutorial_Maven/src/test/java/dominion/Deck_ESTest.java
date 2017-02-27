/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:37:41 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Cards;
import dominion.Deck;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Deck_ESTest extends Deck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Deck.curseCards = null;
      // Undeclared exception!
      try { 
        Deck.Build_Money_Victory();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Deck.Build_Money_Victory();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Deck.Build_Action_Deck();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List<List<Cards>> list0 = Deck.getVCDeck();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Deck deck0 = new Deck();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      List<List<Cards>> list0 = Deck.getActionDeck();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<List<Cards>> list0 = Deck.getMoneyDeck();
      assertEquals(0, list0.size());
  }
}