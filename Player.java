public class Player{

    private String name;
    private int age;
    private int grade;

    public Player (String na, int ag, int gr){
        name = na;
        age = ag;
        grade = gr;
    }

    public Player(){
        name =
        "Random Student";
        age = (int) (Math.random() * 4 + 15);
        grade = (int) (Math.random() * 4 + 9);
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

    public String toString(){
        return "Hi " + name + ", your age is " + age + " and your in " + grade;
    }

    
    
}   
