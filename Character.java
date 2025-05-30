public class Character{

    private String name;
    private int age;
    private int grade;
    private String personality;
    private int friendshipLvl;
  
    public Character(String na, int ag, int gr, String ps){
        name = na;
        age = ag;
        grade = gr;
        personality = ps;
        friendshipLvl = 0;
    }

    public Character(){
        name = "Random Student";
        age = (int)(Math.random() * 4 + 15);
        grade = (int)(Math.random() * 4  + 9);
        personality = "Mysterious";
        friendshipLvl = 0;
    }

    public void setName(String na){
        name = na;
    }

    public String getName(){
        return name;
    }

    public void setAge(int ag){
        age = ag;
    }

    public int getAge(){
        return age;
    }

    public void setGrade(int gr){
        grade = gr;
    }

    public int getGrade(){
        return grade;
    }

    public void setPersonality(String ps){
        personality = ps;
    }

    public String getPersonality(){
        return personality;
    }

    public int getFriendshipLvl(){
        return friendshipLvl;
    }

    public void setFriendshipLvl(int r){
        friendshipLvl = r;
    }

    public void addFriendshipLvl(int t){
        if(friendshipLvl + t < 100){
            friendshipLvl += t;
        }
        else{
            friendshipLvl = 100;
        }
    }

    
    public void characterDescription(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Personality: " + personality);
    }

    public void bio(){
        System.out.println("Bio- ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Personality: " + personality);
        System.out.println("Friendship Level: " + friendshipLvl);
    }
}
