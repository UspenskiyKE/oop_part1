package com.company;

public class Gryffindor extends Hogwarts{

    private int nobilityValue;
    private int honorValue;
    private int braveryValue;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobilityValue, int honorValue, int braveryValue) {
        super(name, magicPower, transgressionDistance);
        super.setName(name);
        this.nobilityValue=nobilityValue;
        this.honorValue=honorValue;
        this.braveryValue=braveryValue;
    }

    public int getNobilityValue() {
        return nobilityValue;
    }

    public int getHonorValue() {
        return honorValue;
    }

    public int getBraveryValue() {
        return braveryValue;
    }

    public String getName() {
        return super.getName();
    }



    public void setNobilityValue() {
        this.nobilityValue=nobilityValue;

    }

    public void setHonorValue(int honorValue) {

        this.honorValue = honorValue;
    }

    public void setBraveryValue(int braveryValue) {

        this.braveryValue = braveryValue;
    }

    public void setName(String name) {
        super.setName(name);
    }



    @Override
    public  String toString() {
        return "Имя "+this.getName()+" Магическая сила "+this.getMagicPower()+", расстояние трансгрессии "+this.getTransgressionDistance()+", благородство "+this.nobilityValue+", честь "+this.honorValue+", храбрость "+this.braveryValue+".";
    }

    public String compareTo(Gryffindor s1, Gryffindor s2) {
        String text = "";
        int totalValue1 = s1.nobilityValue + s1.honorValue + s1.braveryValue;
        int totalValue2 = s2.nobilityValue + s2.honorValue + s2.braveryValue;
        if (totalValue1 > totalValue2) {
            text = text + s1.getName() + " лучший Гриффиндорец, чем " + s2.getName() + ".";
        } else if (totalValue1 == totalValue2) {
            text = text + s1.getName() + " и " + s2.getName() + " Гриффиндорцы одинакового уровня.";
        } else if (totalValue2 > totalValue1) {
            text = text + s2.getName() + " лучший Пуффендуец, чем " + s1.getName() + ".";
        }

        return text;
    }
}


