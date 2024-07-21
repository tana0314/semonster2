package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

import org.example.Player; // 追加
import org.example.Monster; // 追加

public class SeMonsterGame {
    private Map<String, Player> players = new HashMap<>();
    private LinkedList<String> playerNames = new LinkedList<>();

    public void addPlayer(String playerName) {
        Player player = new Player(playerName);
        players.put(playerName, player);
        playerNames.add(playerName);
    }

    public void draw(String playerName) {
        Player player = players.get(playerName);
        if (player != null) {
            player.drawMonsters();
        } else {
            System.out.println("Player not found: " + playerName);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Player player : players.values()) {
            sb.append(player).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SeMonsterGame game = new SeMonsterGame();
        game.addPlayer("Alice");
        game.addPlayer("Bob");

        game.draw("Alice");
        game.draw("Bob");

        System.out.println(game);
    }
}
