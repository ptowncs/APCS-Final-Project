import java.util.ArrayList;
public class Main{
    public static Player player = new Player(100);
    public static NonPlayer bandit = new NonPlayer("Dagger", 100, 0.5, 0.3, new ArrayList<>());
    public static NonPlayer mobBoss = new NonPlayer("Longsword", 125, 0.6, 0.4, new ArrayList<>());
    public static NonPlayer demonCaptain = new NonPlayer("Spear", 150, 0.65, 0.45, new ArrayList<>());
    public static NonPlayer demonGeneral = new NonPlayer("War Hammer", 200, 0.7, 0.5, new ArrayList<>());
    public static NonPlayer demonKing = new NonPlayer("Poleaxe", 300, 0.75, 0.55, new ArrayList<>());
    public static boolean banditBattle(){
        while(player.getHealth() > 0 && bandit.getHealth() > 0){
            System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = 1; // Placeholder for user input
             if(choice == 1){
                 if(player.attack(bandit)){
                     System.out.println("Hit, Bandit health: " + bandit.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }
             } else {
                 System.out.println("Bandit is next!");
             }
             if(bandit.attack(player, Math.random())){
                 System.out.println("Bandit hit, Your health: " + player.getHealth());
             } else {
                 System.out.println("Bandit missed!");
             }
           
        }
        return player.getHealth() > 0;
        }
        public static boolean mobBossBattle(){
            while(player.getHealth() > 0 && mobBoss.getHealth() > 0){
            System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = 1; // Placeholder for user input
             if(choice == 1){
                 if(player.attack(mobBoss)){
                     System.out.println("Hit, Mob Boss health: " + mobBoss.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }

                if(mobBoss.attack(player, Math.random())){
                    System.out.println("Mob Boss hit, Your health: " + player.getHealth());
                } else {
                    System.out.println("Mob Boss missed!");
                }
            }
            return player.getHealth() > 0;     
        }                                              
        }
        public static boolean demonCaptainBattle(){
            while(player.getHealth() > 0 && demonCaptain.getHealth() > 0){
                 System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = 1; // Placeholder for user input
             if(choice == 1){
                 if(player.attack(demonCaptain)){
                     System.out.println("Hit, Demon Captain health: " + demonCaptain.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }
                }
                if(demonCaptain.attack(player, Math.random())){
                    System.out.println("Demon Captain hit, Your health: " + player.getHealth());
                } else {
                    System.out.println("Demon Captain missed!");
                }
            }
            return player.getHealth() > 0;
        }
        public static boolean demonGeneralBattle(){
            while(player.getHealth() > 0 && demonGeneral.getHealth() > 0){
                 System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = 1; // Placeholder for user input
             if(choice == 1){
                 if(player.attack(demonGeneral)){
                     System.out.println("Hit, Demon General health: " + demonGeneral.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }}
                if(demonGeneral.attack(player, Math.random())){
                    System.out.println("Demon General hit, Your health: " + player.getHealth());
                } else {
                    System.out.println("Demon General missed!");
                }
            }
            return player.getHealth() > 0;
        }
        public static boolean demonKingBattle(){
            while(player.getHealth() > 0 && demonKing.getHealth() > 0){
            System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = 1; // Placeholder for user input
             if(choice == 1){
                 if(player.attack(mobBoss)){
                     System.out.println("Hit, Mob Boss health: " + mobBoss.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }
                if(demonKing.attack(player, Math.random())){
                    System.out.println("Demon King hit, Your health: " + player.getHealth());
                } else {
                    System.out.println("Demon King missed!");
                }
            }
            return player.getHealth() > 0;
        }
    
        }

    public static void main(String[] args){
        System.out.println("The king has chosen his warriors. The centerpiece of this group of warriors is you. you are sent on a mission. Defeat the demon king.");
        System.out.println("Standing among the ruins of a village, you are alone. your teammates are dead. You are facing a bandit");
    }
}
