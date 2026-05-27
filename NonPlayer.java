import java.util.ArrayList;

public class NonPlayer{
    private String weapon;
    private int health;
    private double acc_thresh;
    private double dodge_thresh;
    static String[][] meleeWeapons = {
        { "Poleaxe", "10" },
        { "Spear", "8" },
        { "Longsword", "9" },
        { "War Hammer", "12" },
        { "Dagger", "4" }
    };

    static String[][] armory = {
        { "Iron Helmet", "8" },
        { "Chestplate", "25" },
        { "Gauntlets", "10" },
        { "Plate Leggings", "18" },
        { "Steel Boots", "7" },
    };
    private ArrayList<String[]> armorList = new ArrayList<>();
    
    public NonPlayer(String weapon, int health, double accuracy, double agility,ArrayList<String[]> armor ){
        this.weapon = weapon;
        this.health = health;
        acc_thresh = accuracy;
        dodge_thresh = agility;
        armorList = armor;

    }

    public int getDamage() {
        int damage = 2;
        for (int i = 0; i < meleeWeapons.length; i++) {
            if (meleeWeapons[i][0].equals(this.weapon)) {
                damage += Integer.parseInt(meleeWeapons[i][1]);
                break;
            }
        }
        return damage;
    }

    public boolean takeDamage(Player other, double prob) {
        int hitPoints = other.getDamage();
        for (int i = 0; i < armorList.size(); i++) {
            hitPoints -= Integer.parseInt(armorList.get(i)[1]);
        }
        if(prob < this.dodge_thresh){
            this.setHealth(Math.max(0, this.getHealth() - hitPoints));
            return true;
        }
        return false;
    }

    public boolean attack(Player other, double prob) {
        if(prob > this.acc_thresh){
             other.setHealth(other.getHealth() - this.getDamage());
             return true;
        }
        return false;
    }

    public int getHealth(){
        return this.health;
    }
    public void setHealth(int num) {
        this.health = num;
    }

} 
