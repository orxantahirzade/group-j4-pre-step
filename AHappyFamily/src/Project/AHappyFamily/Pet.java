package Project.AHappyFamily;

public class Pet {

    public String species;
    public String nickname;
    public byte age;
    public byte trickLevel;   // 1 to 100
    public String[] habits;

    public void eat(){
        System.out.println("I am eating");
    }

    public void respond(){
        System.out.println("Hello, owner. I am - " + nickname + " I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

}
