public class Archer extends GameCharacter{
    public Archer() {
        this.attackStrategy = new ShootArrow();
        this.defenseStrategy = new Dodge();
    }
}
