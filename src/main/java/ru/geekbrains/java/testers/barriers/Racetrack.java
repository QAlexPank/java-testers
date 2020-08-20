package ru.geekbrains.java.testers.barriers;

import ru.geekbrains.java.testers.players.Player;

public class Racetrack implements Barriers {
        private int length;

        public Racetrack(int length) {
            this.length = length;
        }

        public void check(Player player) {
            player.run();
            player.setSuccess(player.getMaxLength() >= length);
            if (player.getSuccess()) {
                System.out.println("Участник " + player.getName() + " прошел испытание, т.к. пробежал растояние длиной: " + length + " км");
            } else {
                System.out.println("Участник " + player.getName() + " сходит с дистанции, т.к. не пробежал растояние длиной: " + length + " км");
            }
        }
    }

