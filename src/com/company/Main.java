package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss(1000, 80, "invisible Block");
        System.out.println('\n' + "Boss Health is: " + boss.getHealth() + '\n' + "Boss Damage is: " + boss.getDamage()+ '\n' + "Boss Deffence Type is: "  + boss.getDeffenceType());
    }
}
