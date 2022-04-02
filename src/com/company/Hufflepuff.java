package com.company;

public class Hufflepuff extends Hogwarts {

    private int diligenceValue;
    private int loyaltyValue;
    private int honestyValue;

    public Hufflepuff( String name, int magicPower, int transgressionDistance, int diligenceValue, int loyaltyValue, int honestyValue) {
        super(name, magicPower, transgressionDistance);
        super.setName(name);

        this.diligenceValue = diligenceValue;
        this.loyaltyValue = loyaltyValue;
        this.honestyValue = honestyValue;
    }

    public int getDiligenceValue() {

        return diligenceValue;
    }

    public int getLoyaltyValue() {

        return loyaltyValue;
    }

    public int getHonestyValue() {

        return honestyValue;
    }



    public void setDiligenceValue(int diligenceValue) {

        this.diligenceValue = diligenceValue;
    }

    public void setLoyaltyValue(int loyaltyValue) {

        this.loyaltyValue = loyaltyValue;
    }

    public void setHonestyValue(int honestyValue) {

        this.honestyValue = honestyValue;
    }

    @Override
    public  String toString() {
        return "Имя "+this.getName()+" Магическая сила "+this.getMagicPower()+", расстояние трансгрессии "+this.getTransgressionDistance()+", трудолюбие "+this.diligenceValue+", верность "+this.loyaltyValue+", честность "+this.honestyValue+".";
    }

    public String compareTo(Hufflepuff s1, Hufflepuff s2) {
        String text = "";
        int totalValue1 = s1.diligenceValue + s1.loyaltyValue + s1.honestyValue;
        int totalValue2 = s2.diligenceValue + s2.loyaltyValue + s2.honestyValue;
        if (totalValue1 > totalValue2) {
            text = text + s1.getName() + " лучший Пуффендуец, чем " + s2.getName() + ".";
        } else if (totalValue1 == totalValue2) {
            text = text + s1.getName() + " и " + s2.getName() + " Пуффендуйцы одинакового уровня.";
        } else if (totalValue2 > totalValue1) {
            text = text + s2.getName() + " лучший Пуффендуец, чем " + s1.getName() + ".";
        }

        return text;
    }
}
