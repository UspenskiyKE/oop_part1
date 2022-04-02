package com.company;

public class Ravenclaw extends Hogwarts{
    private int mindValue;
    private int wisdomValue;
    private int witValue;
    private int creativityValue;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int mindValue, int wisdomValue, int witValue, int creativityValue) {
        super(name,magicPower, transgressionDistance);
        super.setName(name);
        this.mindValue=mindValue;
        this.wisdomValue=wisdomValue;
        this.witValue=witValue;
        this.creativityValue=creativityValue;
    }

    public int getMindValue() {

        return mindValue;
    }

    public int getWisdomValue() {

        return wisdomValue;
    }

    public int getWitValue() {

        return witValue;
    }

    public int getCreativityValue() {

        return creativityValue;
    }

    public void setMindValue(int mindValue) {

        this.mindValue = mindValue;
    }

    public void setWisdomValue(int wisdomValue) {

        this.wisdomValue = wisdomValue;
    }

    public void setWitValue(int witValue) {

        this.witValue = witValue;
    }

    public void setCreativityValue(int creativityValue) {

        this.creativityValue = creativityValue;
    }

    @Override
    public  String toString() {
        return "Имя "+this.getName()+" Магическая сила "+this.getMagicPower()+", расстояние трансгрессии "+this.getTransgressionDistance()+", ум "+this.mindValue+", мудрость "+this.wisdomValue+", остроумие "+this.witValue+", креативность "+this.creativityValue+".";
    }

    public String compareTo(Ravenclaw s1, Ravenclaw s2) {
        String text = "";
        int totalValue1 = s1.mindValue + s1.wisdomValue + s1.witValue + s1.creativityValue;
        int totalValue2 = s2.mindValue + s2.wisdomValue + s2.witValue + s2.creativityValue;
        if (totalValue1 > totalValue2) {
            text = text + s1.getName() + " лучший Когтевранец, чем " + s2.getName() + ".";
        } else if (totalValue1 == totalValue2) {
            text = text + s1.getName() + " и " + s2.getName() + " Когтевранцы одинакового уровня.";
        } else if (totalValue2 > totalValue1) {
            text = text + s2.getName() + " лучший Когтевранец, чем " + s1.getName() + ".";
        }

        return text;
    }
}
