package org.example;

import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
    ArrayList<Monster> deck = new ArrayList<>();
    String name;
    int hp = 100;// 初期値100

    public Player(String name) {
        this.name = name;
    }

    public void drawMonsters() {
        for (int i = 0; i < 8; i++) {
            this.deck.add(new Monster());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Deck:").append(this.name).append("HP:").append(this.hp).append("\n");
        for (Monster m : this.deck) {
            sb.append(m).append("\n");
        }
        return sb.toString();
    }
}
