public class GameApp {
 /*
 Name: Galima Patrick Ace V.
 Course: SoftwareEngineering 2
 Laboratory Assignment 1 : Strategy Pattern
 */
    public static void main(String[] args) {

        System.out.println();
        GameCharacter knight = new Knight();
        knight.performAttack();
        ((Knight) knight).setMultipleDefenses();
        System.out.println();

        GameCharacter wizard = new Wizard();
        wizard.performAttack();
        wizard.performDefense();
        System.out.println();
        GameCharacter archer = new Archer();
        archer.performAttack();
        archer.performDefense();
    }

}
