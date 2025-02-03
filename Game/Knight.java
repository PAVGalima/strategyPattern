public class Knight extends GameCharacter {
      public Knight() {
        this.attackStrategy =  new SwingSword();
        this.defenseStrategy = new Shield(); 
    }
    public void setMultipleDefenses() {
        System.out.println("Knight uses multiple defense strategies:");
        new Shield().defend();
        new Dodge().defend();
        new CreateMagicBarrier().defend();
    }
}
