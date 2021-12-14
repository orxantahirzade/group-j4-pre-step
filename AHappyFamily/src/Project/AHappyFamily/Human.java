package Project.AHappyFamily;

public class Human {

    public String name;
    public String surname;
    public byte year;    // dateof birth (number)
    public byte IQ;      // 1 to 100
    public Pet humanPet = new Pet();
    public Human mother = new Human();
    public Human father = new Human();
    public String dayOfTheWeek = null;
    public String typeOfTheActivity = null;

    public String[][] schedule = {{dayOfTheWeek}, {typeOfTheActivity}};

    public void greetPet(){
        System.out.println("Hello, " + humanPet.nickname);
    }

    public void describePet(){
        System.out.println("I have a " + humanPet.species + " he is " + humanPet.age +
                 " years old."); // ardini basa dusmedim???

    }


}
