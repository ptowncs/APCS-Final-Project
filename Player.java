import java.util.ArrayList;

public class Player {
    private int health;

    private String weapon;
    private ArrayList<String> weaponList = new ArrayList<>();
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

    private int xp = 0;

    public Player(int health) {
        this.health = health;
        this.weapon = "Dagger";
        this.weaponList.add(weapon);
    }

    public boolean changeWeapon(String weapon) {
        if (weaponList.contains(weapon)) {
            this.weapon = weapon;
            return true;
        } else {
            return false;
        }
    }

    public boolean addWeapon(String weapon, int barrier) {
        for (int i = 0; i < meleeWeapons.length; i++) {
            if (meleeWeapons[i][0].equals(weapon) && this.xp > barrier) {
                this.weaponList.add(meleeWeapons[i][0]);
                return true;
            }
        }
        return false;
    }

    public void addArmor(String arm) {
        for (int i = 0; i < armory.length; i++) {
            if (armory[i][0].equals(arm)) {
                armorList.add(armory[i]);
            }
        }
    }

    public int getDamage() {
        int damage = 2;
        for (int i = 0; i < weaponList.size(); i++) {
            if (weaponList.get(i).equals(this.weapon)) {
                damage += Integer.parseInt(meleeWeapons[i][1]);
                break;
            }
        }
        return damage;
    }

    public void takeDamage(NonPlayer other) {
        int hitPoints = other.getDamage();
        for (int i = 0; i < armorList.size(); i++) {
            hitPoints -= Integer.parseInt(armorList.get(i)[1]);
        }
        this.setHealth(Math.max(0, this.getHealth() - hitPoints));
    }

    public boolean attack(NonPlayer other) {
        other.setHealth(other.getHealth() - this.getDamage());
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int num) {
        this.health = num;
    }

    public void addXP(int num) {
        this.xp += num;
    }
}
