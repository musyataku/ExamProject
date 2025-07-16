public class Goblin extends Monster{

    public Goblin(){}
    public Goblin(char suffix, int hp){
        super("ゴブリン",suffix,hp);
    }
    public void attack(Creature target){
        System.out.println(getName() + getSuffix() +"はナイフで切り付けた！" + target.getName() + "に8のダメージを与えた！");
        target.setHp(target.getHp() - 8);
    }
}

