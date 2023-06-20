package org.example;
//You can import forher.drink.Drink
import forher.drink.Drink;
//You can import forher.drink.MakeFan
import forher.drink.MakeFan;
//You can import forher.drink.Select_a_drink
import forher.drink.Select_a_drink;
public class Main {
    public static void main(String[] args) {
        TestMake();
    }
    public static void TestMake(){
        //1.You can create object and enter your name in parameter.
        MakeFan drink = new Drink("Pattarawan","kumoad","Drink");

        //1.1 You can use System.out.println and use method toString for show the data.
        System.out.println(drink.toString());

        //1.2 You can choose the drink you want.
        Select_a_drink select = Select_a_drink.COCOA;
        System.out.println("You choose " + select);

        //2.You can use method FirstMet to work.
        drink.FirstMet();

        //3.You can use method IThink to work.
        drink.IThink();

        //4.You can use method IFeelsBad to work.
        drink.IFeelsBad();
        //5.You can use method Moment to work.
        drink.Moment();
        //6.You can use method Makef to work.

        drink.Makef();

    }
}