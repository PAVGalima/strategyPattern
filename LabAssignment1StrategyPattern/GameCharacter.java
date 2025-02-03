public abstract class GameCharacter {
    protected AttackStrategy attackStrategy;
    protected DefenseStrategy defenseStrategy;

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        defenseStrategy.defend();
    }

}
