package com.company;

public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;


    public  Hogwarts(String name, int magicPower, int transgressionDistance) {
      this.magicPower=magicPower;
      this.transgressionDistance=transgressionDistance;
    }



    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public  String toString() {
        return "Имя "+this.getName()+"Магическая сила "+this.getMagicPower()+", расстояние трансгрессии "+this.getTransgressionDistance()+".";
    }

    public String compareTo(Hogwarts s1, Hogwarts s2) {
        String text = "";

        if (s1.magicPower > s2.magicPower) {
            text = text + s1.getName() + " обладает большей мощностью магии, чем " + s2.getName() + ".";
        } else if (s1.magicPower == s2.magicPower) {
            text = text + s1.getName() + " и " + s2.getName() + " обладают одинаковой мощностью магии.";
        } else if (s2.magicPower > s1.magicPower) {
            text = text + s2.getName() + " обладает большей мощностью магии, чем " + s1.getName() + ".";
        }

        if (s1.transgressionDistance > s2.transgressionDistance) {
            text = text +" "+ s1.getName() + " может трансгрессировать дальше, чем " + s2.getName() + ".";
        } else if (s1.transgressionDistance == s2.transgressionDistance) {
            text = text +" "+ s1.getName() + " и " + s2.getName() + " трансгрессируют на одинаковое расстояние.";
        } else if (s2.transgressionDistance > s1.transgressionDistance) {
            text = text + " "+s2.getName() + " может трансгрессировать дальше, чем " + s1.getName() + ".";
        }

        return text;
    }
}

