package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void testDrawMonsters() {
        Player player = new Player("test");
        int expected = 8;
        player.drawMonsters();
        assertEquals(expected, player.deck.size());
        for (Monster m : player.deck) {
            assertNotNull(m);
        }
    }

    @Test
    public void testToString() {
        Player player = new Player("test");
        StringBuilder expectedOutput = new StringBuilder();
        expectedOutput.append("Deck:testHP:100\n");
        for (Monster m : player.deck) {
            expectedOutput.append(m).append("\n");
        }

        assertEquals(expectedOutput.toString(), player.toString());
    }
}
