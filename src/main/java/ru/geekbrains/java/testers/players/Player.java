package ru.geekbrains.java.testers.players;

public interface Player {

    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    void run();

    void jump();

}
