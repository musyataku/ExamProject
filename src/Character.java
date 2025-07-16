public abstract class Character implements Creature {

    private String name;
    private int hp;

    public Character() {}
    public Character(String name,int hp){
        if (hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.name = name;
        this.hp = hp;
    }
    public final boolean isAlive(){
        if(hp <= 0){
            return false;
        }else{
            return true;
        }
    }
    public void showStatus(){
        System.out.println( this.name + " :HP " + this.hp );
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHp(int hp){
        if (hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        }
        this.hp = hp;
    }
}
