package ru.geekbrains.java.testers.barriers;

import ru.geekbrains.java.testers.players.Player;

public class Wall implements Barriers {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public void check(Player player) {
        player.jump();
        player.setSuccess(player.getMaxHeight() >= height);
        if (player.getSuccess()) {
            System.out.println("Участник " + player.getName() + " прошел испытание, т.к. перепрыгнул стену высотой: " + height + " м");
        } else {
            System.out.println("Участник " + player.getName() + " сходит с дистанции, т.к. не перепрыгнул стену высотой: " + height + " м");
        }
    }
}
