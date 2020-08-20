package ru.geekbrains.java.testers.players;

public class Robot implements Player {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Robot(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public void run() {
        System.out.println(name + " может пробежать: " + maxLength + " км");
    }
    public void jump() {
        System.out.println(name + " может прыгнуть: " + maxHeight + " м");
    }
    public String getName() {
        return name;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }

}