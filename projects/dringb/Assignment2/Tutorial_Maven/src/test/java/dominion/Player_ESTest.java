/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 04:34:12 GMT 2017
 */

package dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import dominion.Cards;
import dominion.Player;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Player_ESTest extends Player_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Player player0 = new Player("^QBF@l4j4Gg");
      player0.getNewDeck();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        Player.shuffle((List<Cards>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.Collections", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Player player0 = new Player((String) null);
      Boolean boolean0 = new Boolean((String) null);
      Cards cards0 = new Cards((String) null, 0, 0, (String) null, boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Player player0 = new Player("=;#Xq");
      // Undeclared exception!
      try { 
        player0.PayPiper((-2193));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Player player0 = new Player("Mine");
      // Undeclared exception!
      try { 
        player0.Hand_To_Discard(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Player.Check_For_Action((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("dominion.Player", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Player player0 = new Player("P,fES@'Mn00");
      player0.Get_Player_Stats();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<Cards> linkedList0 = new LinkedList<Cards>();
      Player.shuffle(linkedList0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Player player0 = new Player("G)?!a{pvWXer");
      // Undeclared exception!
      try { 
        player0.Draw((-5689));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Player player0 = new Player("Village");
      int int0 = Player.Check_For_Action(player0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Player player0 = new Player("P,fES@'Mn00");
      Boolean boolean0 = Boolean.TRUE;
      Cards cards0 = new Cards("CouncilRoom", 0, 0, "K)0i*Stu", boolean0);
      Player player1 = new Player("P,fES@'Mn00");
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player1, player1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Player player0 = new Player("G)?!a{pvWXer");
      Boolean boolean0 = Boolean.valueOf("G)?!a{pvWXer");
      Cards cards0 = new Cards("G)?!a{pvWXer", 8, 8, "G)?!a{pvWXer", boolean0);
      player0.Play_Card(cards0, player0, player0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Player player0 = new Player("Village");
      Boolean boolean0 = Boolean.valueOf("i(ZxgYw(#^");
      Cards cards0 = new Cards("Village", (-1), 0, "Village", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Player player0 = new Player("P,fES@'Mn00");
      Boolean boolean0 = Boolean.TRUE;
      Cards cards0 = new Cards("CouncilRoom", 0, 0, "K)0i*Stu", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Player player0 = new Player("?d\"FjS");
      Boolean boolean0 = Boolean.valueOf("TPgau~qnwJb`]#mK2");
      Cards cards0 = new Cards("Adventurer", 0, 290489056, "", boolean0);
      player0.Play_Card(cards0, player0, player0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Player player0 = new Player("CutPurse");
      Boolean boolean0 = Boolean.valueOf(":K#3`SB;50");
      Cards cards0 = new Cards("CutPurse", 3230, (-96980524), ":K#3`SB;50", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Player player0 = new Player("Workshop");
      Boolean boolean0 = Boolean.valueOf(":K#3`SB;50");
      Cards cards0 = new Cards("Workshop", 0, (-96980524), ":K#3`SB;50", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Player player0 = new Player("3f c5[E2o");
      Boolean boolean0 = Boolean.valueOf("");
      Cards cards0 = new Cards("Feast", (-184), 21, "3f c5[E2o", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Boolean boolean0 = Boolean.FALSE;
      Player player0 = new Player("Province");
      Cards cards0 = new Cards("Baron", (-569), 10, "Baron", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Player player0 = new Player("cPGYa");
      Boolean boolean0 = Boolean.FALSE;
      Cards cards0 = new Cards("Embargo", 0, (-1997438884), "Embargo", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 1, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Player player0 = new Player("Mine");
      Boolean boolean0 = Boolean.valueOf(":K#3`SB;50");
      Cards cards0 = new Cards("Mine", 0, (-96980521), ":K#3`SB;50", boolean0);
      player0.Play_Card(cards0, player0, player0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Player player0 = new Player("0D1a.D-agi");
      Boolean boolean0 = Boolean.valueOf(false);
      Cards cards0 = new Cards("GreatHall", 0, 60, "0D1a.D-agi", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Player player0 = new Player("Market");
      Boolean boolean0 = Boolean.TRUE;
      Cards cards0 = new Cards("Market", 0, 0, "Silver", boolean0);
      // Undeclared exception!
      try { 
        player0.Play_Card(cards0, player0, player0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Player player0 = new Player("Province");
      int int0 = player0.Get_player_gold_in_hand();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Player player0 = new Player("Garden");
      Boolean boolean0 = new Boolean((String) null);
      Cards cards0 = new Cards("Garden", 1430, 0, "B3:r_f~mi=|m^", boolean0);
      player0.Play_Card(cards0, player0, player0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Player player0 = new Player("");
      // Undeclared exception!
      try { 
        player0.safeActionDraw();
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("org.evosuite.runtime.Random", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Player player0 = new Player("Village");
      int int0 = player0.get_Player_Gold();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Player player0 = new Player("r");
      List<Cards> list0 = player0.get_PlayHand();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Player player0 = new Player("EbrOg");
      List<Cards> list0 = player0.GetDeck();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Player player0 = new Player("r");
      List<Cards> list0 = player0.getDiscard();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Player player0 = new Player("?d\"FjS");
      int int0 = player0.Get_Player_VP();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Player player0 = new Player("Mine");
      // Undeclared exception!
      try { 
        player0.Hand_To_Discard((-8));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Player player0 = new Player("^QBF@l4j4Gg");
      String string0 = player0.toString();
      assertEquals("^QBF@l4j4Gg| Victory Points: 0| Gold: 0", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Player player0 = new Player("?d\"FjS");
      // Undeclared exception!
      try { 
        player0.newHand();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
}