/*
 * This file was automatically generated by EvoSuite
 * Mon Feb 27 08:13:04 GMT 2017
 */

package org.cs362.dominion;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.cs362.dominion.Board;
import org.cs362.dominion.Player;
import org.cs362.dominion.Salvager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false) 
public class Salvager_ESTest extends Salvager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Salvager salvager0 = new Salvager();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player((String) null, true);
      player0.addToHand(salvager0);
      Board board0 = new Board();
      salvager0.Action(arrayList0, player0, board0);
      assertEquals(0, player0.getBuys());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Salvager salvager0 = new Salvager();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        salvager0.Action(arrayList0, (Player) null, board0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.cs362.dominion.Salvager", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Salvager salvager0 = new Salvager();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player("", false);
      Board board0 = new Board();
      salvager0.Action(arrayList0, player0, board0);
      assertTrue(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Salvager salvager0 = new Salvager();
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      Player player0 = new Player((String) null, true);
      Board board0 = new Board();
      // Undeclared exception!
      try { 
        salvager0.Action(arrayList0, player0, board0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         assertThrownBy("org.evosuite.runtime.Random", e);
      }
  }
}