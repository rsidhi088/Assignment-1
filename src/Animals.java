import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;


public class Animals {
    public ArrayList<ArabianHorse> horses;
    public ArrayList<BengalCat> cats;
    public ArrayList <Chicken> chicken;
    public ArrayList<Dolphin> dolphin;
    public ArrayList<Duck> ducks;
    public ArrayList<GermanShepherd> gmdog;
    public ArrayList<golden> dog;
    public ArrayList<Parakeet> bird;
    public ArrayList<Sharks> shark;
    public String breed;
    public String name;
    public String YOB;


    public Animals(){
        ArrayList<ArabianHorse> horses = new ArrayList<>();
        ArrayList<BengalCat> cats = new ArrayList<>();
        ArrayList <Chicken> chicken = new ArrayList<>();
        ArrayList<Dolphin> dolphin = new ArrayList<>();
        ArrayList<Duck> ducks = new ArrayList<>();
        ArrayList<GermanShepherd> gmdog = new ArrayList<>();
        ArrayList<golden> dog = new ArrayList<>();
        ArrayList<Parakeet> bird = new ArrayList<>();
        ArrayList<Sharks> shark = new ArrayList<>();
        String breed = new String();
        String name= new String();
        String YOB = new String();

    }

    public Animals(String breed, String name,String YOB) {
        this.breed= breed;
        readInput(breed);
        this.name=name;
        this.YOB = YOB;

    }



    public void readInput(String breed) {

            switch (breed) {
                case "Arabian Horse":

                    addArabianHorse();
                    System.out.println("Arabian Horse");
                    break;
                case "Bengal Cat":
                 //   addBengalCat();
                    System.out.println("Bengal Cat");
                    break;
                case "Chicken":
                 //   addChicken();
                    System.out.println("Chicken");
                    break;
                case "Dolphin":
                    //addDolphin();
                    System.out.println("Dolphin");
                    break;
                case "Duck":
                   // addDuck();
                    System.out.println("Duck");
                    break;
                case "German Shepherd":
                    //addGermanSheperd();
                    System.out.println("German Sheperd");
                    break;

                case "golden retriever":
                    //addgolden();
                    System.out.println("golden");
                    break;

                case "Parakeet":

                    //addParakeet();
                    System.out.println("Parakeet");
                    break;

                case "Sharks":

                   // addShark();
                    System.out.println("Sharks");
                    break;

                default:
            }
        }


    public static void main(String[] args){
        LoadFile file= new LoadFile();
        file.LoadFile();
    }

    public void addArabianHorse(ArabianHorse name, ArabianHorse YOB){

        Scanner Udata = new Scanner(System.in);
        String searchString = Udata.nextLine();
        ListIterator iterator = horses.listIterator();

        horses.add(name);
        horses.add(YOB);

        System.out.println(horses);
    }

    public void addBengalCat(BengalCat name,BengalCat YOB) {
        cats.add(name);
        cats.add(YOB);

    }

    public void addChicken(Chicken name,Chicken YOB) {
        chicken.add(name);
        chicken.add(YOB);

    }

    public void addDolphin(Dolphin name,Dolphin YOB) {
        dolphin.add(name);
        dolphin.add(YOB);

    }

    public void addDuck(Duck name,Duck YOB) {
        ducks.add(name);
        ducks.add(YOB);

    }
    public void addGermanSheperd(GermanShepherd name,GermanShepherd YOB) {
        gmdog.add(name);
        gmdog.add(YOB);

    }

    public void addgolden(golden name,golden YOB) {
        dog.add(name);
        dog.add(YOB);

    }

    public void addParakeet(Parakeet name,Parakeet YOB) {
        bird.add(name);
        bird.add(YOB);

    }

    public void addShark(Sharks name,Sharks YOB) {
        shark.add(name);
        shark.add(YOB);

    }

}