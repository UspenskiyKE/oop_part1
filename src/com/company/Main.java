package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Gryffindor h=new Gryffindor("Гарри Поттер",80,90,90,90,90);
        Gryffindor g=new Gryffindor("Гермиона Грейнджер",90, 70, 70, 75,85);
        Gryffindor r=new Gryffindor("Рон Уизли",50,30,70, 72, 60);

        Slytherin d=new Slytherin("Драко Малфой",78, 75,60, 72, 85,82,94 );
        Slytherin gm=new Slytherin("Грэхем Монтегю",70,60, 71, 73,70,50,30);
        Slytherin gg=new Slytherin("Грегори Гойл",60, 65,50,40, 30,30,25);

        Hufflepuff zs=new Hufflepuff("Захария Смит",65,70,55,64,72);
        Hufflepuff sd=new Hufflepuff("Седрик Диггори",78,92,75,80,85);
        Hufflepuff dff=new Hufflepuff("Джастин Финч-Флетчли",75,82,74,80,94);

        Ravenclaw cc=new Ravenclaw("Чжоу Чанг",45,55,70,72,88, 82);
        Ravenclaw pp=new Ravenclaw("Падма Патил",56,75,49,54,65,80);
        Ravenclaw mb=new Ravenclaw("Маркус Белби",45,56,76,85,78,83);

        System.out.println(h);
        System.out.println(g);
        System.out.println(r);
        System.out.println(d);
        System.out.println(gg);
        System.out.println(gm);
        System.out.println(zs);
        System.out.println(sd);
        System.out.println(dff);
        System.out.println(cc);
        System.out.println(pp);
        System.out.println(mb);

        String s=gg.compareTo(gm,gg);
        System.out.println(s);

        String s2=h.compareTo(h,g);
        System.out.println(s2);

        String s3=zs.compareTo(zs,sd);
        System.out.println(s3);

        String s4=cc.compareTo(cc,pp);
        System.out.println(s4);

        String s5=cc.compareTo(h,d);
        System.out.println(s5);

        String s6=cc.compareTo(sd,d);
        System.out.println(s6);




    }
}
