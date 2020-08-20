package ru.geekbrains.java.testers.actions;

import org.junit.jupiter.api.Test;
import ru.geekbrains.java.testers.barriers.Barriers;
import ru.geekbrains.java.testers.barriers.Racetrack;
import ru.geekbrains.java.testers.barriers.Wall;
import ru.geekbrains.java.testers.players.Cat;
import ru.geekbrains.java.testers.players.Human;
import ru.geekbrains.java.testers.players.Player;
import ru.geekbrains.java.testers.players.Robot;

class CompetitionTest {

    @Test
    void tryAction(){
        Player catBarsik = new Cat("Барсик", 10, 13);
        Player catMatroskin = new Cat("Матроскин", 8, 15);

        Player humanIvan = new Human("Иван", 8, 5);
        Player humanPetr = new Human("Петр", 15, 7);

        Player robotArny = new Robot("Арни", 10, 10);
        Player robotVerter = new Robot("Вертер", 15, 15);

        Player[] players = {catBarsik, catMatroskin, humanIvan, humanPetr, robotArny, robotVerter};


        Barriers wall1 = new Wall(10);
        Barriers wall2 = new Wall(15);

        Barriers racetrack1 = new Racetrack(10);
        Barriers racetrack2 = new Racetrack(15);

        Barriers[] barriers = {wall1, wall2, racetrack1, racetrack2};


        System.out.println("На старт! Внимание! Марш!");
        for (int i = 0; i < barriers.length; i++) {
            System.out.println("\n\nИспытание №" + (i + 1));

            for (Player player : players) {
                if (player.getSuccess()) {
                    barriers[i].check(player);
                }

            }
        }
    }
}
