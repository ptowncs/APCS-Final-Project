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

    private String armor;
    private ArrayList<String[]> armorList = new ArrayList<>();

    private money = 0;

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
        if (meeleeWeapons.contains(weapon) &&this.xp > barrier){
            this.weaponList.add(weapon);
        }
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
        this.health -= other.getDamage();

    }
    public void attack(Player other){
        
    }

}
