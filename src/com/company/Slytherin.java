package com.company;

public class Slytherin extends Hogwarts{
    private int cunningValue;
    private int determinationValue;
    private int ambitionValue;
    private int resourcefulnessValue;
    private int lustofpowerValue;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunningValue, int determinationValue, int ambitionValue, int resourcefulnessValue, int lustofpowerValue) {
        super(name, magicPower, transgressionDistance);
        super.setName(name);
        this.cunningValue=cunningValue;
        this.determinationValue=determinationValue;
        this.ambitionValue=ambitionValue;
        this.resourcefulnessValue=resourcefulnessValue;
        this.lustofpowerValue=lustofpowerValue;
    }

    public int getCunningValue() {
        return cunningValue;
    }

    public int getDeterminationValue() {
        return determinationValue;
    }

    public int getAmbitionValue() {
        return ambitionValue;
    }

    public int getResourcefulnessValue() {
        return resourcefulnessValue;
    }

    public int getLustofpowerValue() {
        return lustofpowerValue;
    }

    public void setCunningValue(int cunningValue) {
        this.cunningValue = cunningValue;
    }

    public void setDeterminationValue(int determinationValue) {
        this.determinationValue = determinationValue;
    }

    public void setAmbitionValue(int ambitionValue) {
        this.ambitionValue = ambitionValue;
    }

    public void setResourcefulnessValue(int resourcefulnessValue) {
        this.resourcefulnessValue = resourcefulnessValue;
    }

    public void setLustofpowerValue(int lustofpowerValue) {
        this.lustofpowerValue = lustofpowerValue;
    }

    @Override
    public  String toString() {
        return "Имя "+this.getName()+" Магическая сила "+this.getMagicPower()+", расстояние трансгрессии "+this.getTransgressionDistance()+", хитрость "+this.cunningValue+", решительность "+this.determinationValue+", амбициозность "+this.ambitionValue+", находчивость "+this.resourcefulnessValue+", жажда власти "+this.lustofpowerValue+".";
    }

    public String compareTo(Slytherin s1, Slytherin s2) {
        String text = "";
        int totalValue1 = s1.cunningValue + s1.determinationValue + s1.resourcefulnessValue + s1.ambitionValue + s1.lustofpowerValue;
        int totalValue2 = s2.cunningValue + s2.determinationValue + s2.resourcefulnessValue + s2.ambitionValue + s2.lustofpowerValue;
        if (totalValue1 > totalValue2) {
            text = text + s1.getName() + " лучший Слизеринец, чем " + s2.getName() + ".";
        } else if (totalValue1 == totalValue2) {
            text = text + s1.getName() + " и " + s2.getName() + " Слизеринцы одинакового уровня.";
        } else if (totalValue2 > totalValue1) {
            text = text + s2.getName() + " лучший Слизеринец, чем " + s1.getName() + ".";
        }

        return text;
    }
    }

