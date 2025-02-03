public class Wizard extends GameCharacter {
    public Wizard() {
        this.attackStrategy = new CastSpell();
        this.defenseStrategy = new CreateMagicBarrier();
    }

}
