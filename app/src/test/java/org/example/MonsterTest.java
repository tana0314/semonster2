package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MonsterTest {
  @Test
  public void TestMonster() {
    App classMonsterTest = new App();
    assertEquals("デュラハン:レア度[0]", classMonsterTest.toString());
  }
}
