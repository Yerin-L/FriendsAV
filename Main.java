import java.util.Scanner;
public class Main{
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";   
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        Scanner scan2 = new Scanner(System.in); 

        
        Character Sowyra = new Character("Sowyra", 17, 11, "Outgoing, charismatic, goofy");
        Character Thomas = new Character("Thomas", 14, 9, "Nonchalant, relaxed, kind");
        Character Ellen = new Character("Ellen", 16, 11, "Serious, focused, hard-working");
        Character Anushka = new Character("Anushka", 15, 10, "Honest, talkative, creative");
        Character Elle = new Character("Elle", 18, 12, "Energetic,loud, jokester");
        String userWords = "";
        double userNum = 0;
        int idk = 0;
        boolean need = true;

        Player you = new Player();
        while(!scan.equals("end sim")){
            System.out.println("Welcome to Find Friend AV! Friendship simulator based on Amador Valley High School.");
            System.out.println("What's your name?");
            userWords = scan.nextLine();
            userWords.toLowerCase();
            you.setName(userWords);
            System.out.println("Hi " + you.getName() + ", how old are you? (Please only input numbers)");
            while(idk == 0){
                if(scan2.hasNextDouble()){
                    userNum = scan2.nextDouble();
                    while(14 > userNum || userNum > 19){
                        if(userNum > 19){
                            System.out.println("You seem too old for high school. Try again with a more reasonable age.(14-18)");
                            userNum = scan2.nextDouble();
                        }
                        if(userNum < 14){
                            System.out.println("You seem to young for high school. Try again with a more reasonable age.(14-18)");
                            userNum = scan2.nextDouble();
                        }
                    }
                    if(14 <= userNum && userNum <= 19){
                        break;
                    }
                }
                else{
                    System.out.println("That is not a valid input try again.");
                    scan2.next();
                }
            }
           
            
            you.setAge((int)(userNum));

            if(you.getAge() == 14){
                you.setGrade(9);
            }
            if(you.getAge() == 15){
                you.setGrade(10);
            }
            if(you.getAge() == 16){
                you.setGrade(10);
            }
            if(you.getAge() == 17){
                you.setGrade(11);
            }
            if(you.getAge() == 18){
                you.setGrade(12);
            }
            System.out.println("Since your are " + you.getAge() + " years old, you are in grade: " + you.getGrade() + ".");
            System.out.println("If you'd like to leave type: 'end sim'.");
            System.out.println("(Press enter to move along the narative when your ready)");   
            userWords = scan.nextLine();
            userWords = userWords.toLowerCase();
            System.out.println();
            System.out.println("Welcome to Amador Valley High School " + you.getName() + ".");
            System.out.println("This will simulate 3 days at Amador and do what you can to grow your friendship with other people.");    
            userWords = scan.nextLine();
            userWords = userWords.toLowerCase();
            System.out.println();
            System.out.println("Day 1:");
            System.out.println("It's 8 am, where would you like to go?");
            while(need){
                System.out.println();
                System.out.println("[1] The Tables");
                System.out.println("[2] The Quad");
                System.out.println("[3] The Library");
                System.out.println("[4] The Q Building");
                System.out.println("[5] The Parking Lot");
                userWords = scan.nextLine();
                userWords.toLowerCase();
                if(userWords.equals("1")){
                    System.out.println("At the tables you find a tall boy sitting alone eating his breakfast.");
                    System.out.println("Do you approach him?(Yes or No)");
                    userWords = scan.nextLine();
                    userWords = userWords.toLowerCase();
                    while(!userWords.equals("yes") && !userWords.equals("no")){
                        System.out.println("Invalid reply please try again");
                        userWords = scan.nextLine();
                        userWords = userWords.toLowerCase();
                        System.out.println();
                    }
                        if(userWords.equals("yes")){
                            System.out.println();
                            System.out.println("You chose to approach the mystery kid and sit down with him.");
                            System.out.println();
                            Thomas.bio();
                            System.out.println();
                            System.out.println("What do you want to say to him?");
                            System.out.println("[1] Hello there you look sad and lonely, that must suck.");                            
                            System.out.println("[2] Hi there would you like to be friends?");
                            System.out.println("[3] HEYYYY! HOW ARE YOU?");
                            userWords = scan.nextLine();
                            userWords = userWords.toLowerCase();                            
                            while(!userWords.equals("1") && !userWords.equals("2") && !userWords.equals("3")){
                                System.out.println("Invalid input try again.");
                                userWords = scan.nextLine();
                                userWords = userWords.toLowerCase();
                                
                            }
                            if(userWords.equals("1")){
                                System.out.println(RED + Thomas.getName() + ": Um excuse you?");
                                System.out.println(WHITE + "You embarrassed yourself and you walked away with your head down.");
                                System.out.println("Your friendship level stayed at " + Thomas.getFriendshipLvl());
                                System.out.println();
                                System.out.println("The bell rings and it's time for 1st period maybe you can make some more friends at brunch.");
                                userWords = scan.nextLine();
                                userWords = userWords.toLowerCase();
                                need = false;
                            }
                            if(userWords.equals("2")){
                                System.out.println(RED + Thomas.getName() + ": Oh hi, it's nice to meet you.");
                                System.out.println(WHITE + "You have a lovely conversation with " + Thomas.getName() + ". You feel your bond growing.");
                                Thomas.addFriendshipLvl(15);
                                System.out.println("Your friendship level increased to: " + Thomas.getFriendshipLvl());
                                System.out.println();
                                System.out.println("The bell rings and it's time for 1st period maybe you can make some more friends at brunch.");
                                userWords = scan.nextLine();
                                userWords = userWords.toLowerCase();
                                need = false;
                            }
                            if(userWords.equals("3")){
                                System.out.println(RED + Thomas.getName() + ": Your too loud for it being morning, talk to me later.");
                                System.out.println(WHITE + "Your a little embarrassed, but you have learned something new about " + Thomas.getName());
                                Thomas.addFriendshipLvl(5);
                                System.out.println("Your friendship level increased to: " + Thomas.getFriendshipLvl());
                                System.out.println();
                                System.out.println("The bell rings and it's time for 1st period maybe you can make some more friends at brunch.");
                                userWords = scan.nextLine();
                                userWords = userWords.toLowerCase();
                                need = false;
                            }
                            
                        }
                        if(userWords.equals("no")){
                            System.out.println("You chose to sit on your own until class starts.");
                            userWords = scan.nextLine();
                            userWords = userWords.toLowerCase();
                            need = false;
                        }
                }
                if(userWords.equals("2")){

                }
                if(userWords.equals("3")){

                }
                if(userWords.equals("4")){

                }
                if(userWords.equals("5")){

                }
                
            }
            System.out.println();
            System.out.println("It's brunch time, what where would you like to go?");
            System.out.println("[1] The Quad");
            System.out.println("[2] The Library");            
            System.out.println("[3] Random Hallway");
            System.out.println("[4] The Cafe");
            System.out.println("[5] Your next class");
            userWords = scan.nextLine();
            userWords = userWords.toLowerCase();


            Sowyra.bio();
            Ellen.bio();
            Elle.bio();
            Anushka.bio();
        }
        System.out.println("Thank you for playing, hope to see you around again!");
        scan.close();
        scan2.close();

    }
}
