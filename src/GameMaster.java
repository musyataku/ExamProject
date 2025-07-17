import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {

        //Character c = new Character("名無し", 50);
        //Hero testHero = new Hero("テスト勇者", -10, "テスト剣");

        Hero hero = new Hero("勇者",100,"剣");
        Wizard wizard = new Wizard("魔法使い",60,20);
        Thief thief = new Thief("盗賊",70);
        //hero.name = "ミナト";
        //hero.hp = 200;
        ArrayList<Character> party = new ArrayList<Character>();
        party.add(0,hero);
        party.add(1,wizard);
        party.add(2,thief);

        Matango matango = new Matango('A',45);
        Goblin goblin = new Goblin('A',50);
        Slime slime = new Slime('A',40);
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        monsters.add(0,matango);
        monsters.add(1,goblin);
        monsters.add(2,slime);

        System.out.println("---味方パーティ---");
        for(Character c : party){
            c.showStatus();
        }
        System.out.println("---敵グループ---");
        for (Monster m : monsters){
            m.showStatus();
        }
        System.out.println("\n味方のそーこーげき！");
        for(Character c : party){
            for(Monster m : monsters){
                c.attack(m);
            }
        }
        System.out.println("\n敵のぎゃくしゅう！");
        for(Monster m : monsters){
            for(Character c : party){
                m.attack(c);
            }
        }
        System.out.println("\nダメージを受けたヒーローが突然怒り狂った！");
        System.out.println("勇者はスーパーヒーローに進化した！");

        SuperHero superhero = new SuperHero(hero);

        party.set(0,superhero);

        for(Monster m : monsters){
            superhero.attack(m);
        }

        System.out.println("\n---味方パーティの最終ステータス---");
        for(Character c : party){
            c.showStatus();
            if(c.isAlive()==true){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：きぜつ");
            }
        }
        System.out.println("\n---敵グループの最終ステータス---");
        for(Monster m : monsters){
            m.showStatus();
            if(m.isAlive()==true){
                System.out.println("生存状況：生存");
            }else{
                System.out.println("生存状況：討伐済み");
            }
        }
    }
}
