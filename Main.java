import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static Scanner scanner = new Scanner(System.in);
    public static Player player = new Player(100);
    public static NonPlayer bandit = new NonPlayer("Dagger", 100, 0.5, 0.3, new ArrayList<>());
    public static NonPlayer mobBoss = new NonPlayer("Longsword", 125, 0.6, 0.4, new ArrayList<>());
    public static NonPlayer demonCaptain = new NonPlayer("Spear", 150, 0.65, 0.45, new ArrayList<>());
    public static NonPlayer demonGeneral = new NonPlayer("War Hammer", 200, 0.7, 0.5, new ArrayList<>());
    public static NonPlayer demonKing = new NonPlayer("Poleaxe", 300, 0.75, 0.2, new ArrayList<>());
    public static boolean banditBattle(){
        while(player.getHealth() > 0 && bandit.getHealth() > 0){
            System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = scanner.nextInt();
             scanner.nextLine(); 
             if(choice == 1){
                 if(player.attack(bandit)){
                     System.out.println("Hit, Bandit health: " + bandit.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }
             } else {
                 System.out.println("Bandit is next!");
             }
             if (bandit.getHealth() <= 0) break;
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
             int choice = scanner.nextInt();
            scanner.nextLine();; // Placeholder for user input
             if(choice == 1){
                 if(player.attack(mobBoss)){
                     System.out.println("Hit, Mob Boss health: " + mobBoss.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }
                }
                    if (mobBoss.getHealth() <= 0) break;
                if(mobBoss.attack(player, Math.random())){
                    System.out.println("Mob Boss hit, Your health: " + player.getHealth());
                } else {
                    System.out.println("Mob Boss missed!");
                }
            }
        
            return player.getHealth() > 0;                                                  
        }
        public static boolean demonCaptainBattle(){
            while(player.getHealth() > 0 && demonCaptain.getHealth() > 0){
                 System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = scanner.nextInt();
             scanner.nextLine(); // Placeholder for user input
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
             int choice = scanner.nextInt();
            scanner.nextLine();; // Placeholder for user input
             if(choice == 1){
                 if(player.attack(demonGeneral)){
                     System.out.println("Hit, Demon General health: " + demonGeneral.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }
                }else if(choice == 2){
                    player.changeWeapon("");
                    System.out.println("Demon General is next!");
                }
                if(demonGeneral.attack(player, Math.random())){
                    System.out.println("Demon General hit, Your health: " + player.getHealth());
                } else {
                    System.out.println("Demon General missed!");
                }
                if(choice == 2){
                    player.changeWeapon("");
                    System.out.println("Demon General is next!");
                }
            }
            return player.getHealth() > 0;
        }
        public static boolean demonKingBattle(){
            while(player.getHealth() > 0 && demonKing.getHealth() > 0){
            System.out.println("What will you do? 1. Attack 2. Switch Weapon");
             int choice = scanner.nextInt();
             scanner.nextLine(); // Placeholder for user input
             if(choice == 1){
                 if(player.attack(demonKing)){
                     System.out.println("Hit, Demon King health: " + demonKing.getHealth());
                 } else {
                     System.out.println("Miss!");
                 }
                }else if(choice == 2){
                    player.changeWeapon("");
                    System.out.println("Demon King is next!");
                }
                 if (demonKing.getHealth() <= 0) break;
                if(demonKing.attack(player, Math.random())){
                    System.out.println("Demon King hit, Your health: " + player.getHealth());
                } else {
                    System.out.println("Demon King missed!");
                }
            }
        
            return player.getHealth() > 0;
        
    
        }

    public static void main(String[] args){
        System.out.println("The king has chosen his warriors. The centerpiece of this group of warriors is you. you are sent on a mission. Defeat the demon king.");
        System.out.println("Standing among the ruins of a village, you are alone. your teammates are dead. You are facing a bandit");
        System.out.println("The battle begins!");
        if(banditBattle()){
            System.out.println("Congratulations! You have defeated the bandit");
        } else {
            System.out.println("You have been defeated. The world is doomed. Game Over.");
            return;
        }
        System.out.println("You wander through the ruins and find a chest. Inside is a longsword. You equip it and continue on your journey.");
        player.addWeapon("Longsword", 0);
        System.out.println("you arrive to the forest of passage. A mob boss is blocking your path. He has a civilian in his clutches. 1. Attack and save the civilian 2. Sneak past the mob boss and continue");
        System.out.println("battle begins!");
        if(mobBossBattle()){
            System.out.println("Congratulations! You have defeated the mob boss and saved the civilian");
        } else {
            System.out.println("You have been defeated. The world is doomed. Game Over.");
            return;
        }
        System.out.println("You continue through the forest and find a chest. Inside is a chestplate and spear . You equip it and continue on your journey.");
        player.addArmor("Chestplate");
        player.addWeapon("Spear", 0);
        System.out.println("you arrive at the gates of the demon king's castle. A demon captain is blocking your path. You attack the demon captain");
        System.out.println("Give em hell! ");
        if(demonCaptainBattle()){
            System.out.println("Congratulations! You have defeated the demon captain");
        } else {
            System.out.println("You have been defeated. The world is doomed. Game Over.");
            return;
        }
        System.out.println("You continue through the castle and find a chest. Inside is a war hammer and plate leggings. You equip it and continue on your journey.");
        player.addWeapon("War Hammer", 0);
        player.addArmor("Plate Leggings");
        System.out.println("you arrive at the throne room of the demon king. A demon general is blocking your path. You attack the demon general");
        System.out.println("The Battle begins!");
        if(demonGeneralBattle()){
            System.out.println("Congratulations! You have defeated the demon general");
        } else {
            System.out.println("You have been defeated. The world is doomed. Game Over.");
            return;
        }
        System.out.println("You continue through the throne room and find a chest. Inside is a poleaxe and iron helmet. You equip it and continue on your journey.");
        player.addWeapon("Poleaxe", 0);
        player.addArmor("Iron Helmet");
        System.out.println("you now stand before the demon king. This is the being of your nightmares. This is the final stand, the final battle, That decides the fate of the world.");
        System.out.println("The battle that changes all of history begins! May god give you strength to unleash you potential and unleash hell to defeat the demon king!");
        if(demonKingBattle()){
            System.out.println("Congratulations! You have defeated the demon king and saved the world!");
        } else {
            System.out.println("You have been defeated. The world is doomed. Game Over.");
            return;
        }
        System.out.println("You have completed the mission. You are a hero. The one who save the world. Rest now mighty warrior, for the time of peace has just begun.");
    }
}
