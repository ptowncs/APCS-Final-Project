public class Player {
    private int health;

    private String weapon;
    private ArrayList<String> weaponList = new ArrayList<>();
    static String[][] meleeWeapons = {
        {"Poleaxe", "10"},
        {"Spear", "8"},
        {"Longsword", "9"},
        {"War Hammer", "12"},
        {"Dagger", "4"}
    };

    static String[][] armory = {
    {"Iron Helmet", "8"},
    {"Chestplate", "25"},
    {"Gauntlets", "10"},
    {"Plate Leggings", "18"},
    {"Steel Boots", "7"},
    };
    private ArrayList<String[]> armorList = new ArrayList<>();

    private int xp = 0;


    public Player(int health,  String weapon){
        this.health = health;
        this.weapon = "longbow";
        this.weaponlist.add(weapon);
    }

    public 
    public void changeWeapon(String weapon){
        if (weaponList.contains(weapon)){
            this.weapon = weapon;
        }else{
            System.out.println("Invalid. Try again.");
        }
    }
    public void addWeapon(String weapon, int barrier){
        if (meeleeWeapons.contains(weapon) && this.xp > barrier){
            this.weaponList.add(weapon);
        }
    }

    public void addArmor(String[] arm){
        // add armor if availible
    }
    public int getDamage(){
        int damage = 2;
        for(int i = 0; i++; i < meleeWeapons.length){
            if(meeleeWeapons[i][0].equals(this.weapon)){
                damage += meeleeWeapons[i][1];
                break;
            }
        }
        return damage;
    }
    public void takeDamage(Player other){
        int hitPoints = other.getDamage();
        for(int i = 0; i < armorList.size(); i++){
            hitPoints -= armorList.indexOf(armory.get(i))[1]
        }
        this.getHealth =- hitPoints;

    }
    public void attack(Player other){
        other.setHealth(other.getHealth() - this.getDamage());
    }

    public int getHealth(){
        return this.health;
    }
    public void setHealth(int num){
        this.health = num;
    }

}
