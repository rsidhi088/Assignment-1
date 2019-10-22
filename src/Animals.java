import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Animals{
    List<Animals> animalsList = new ArrayList<>();
    List<Swimmer> swimmerList = new ArrayList<>();
    String breed;


    public Animals(String breed, String name, String yob) {
    }

    public Animals() {

    }

    public void readInput(Animals animal) {
        switch (animal.breed) {
            case "Arabian Horse":

                animalsList.add(((ArabianHorse) animal));
                System.out.println("Arabian Horse");
                break;

            case "Bengal Cat":
                animalsList.add(((BengalCat) animal));

                System.out.println("Bengal Cat");
                break;

            case "Chicken":
                animalsList.add(((Chicken) animal));
                System.out.println("Chicken");
                break;

            case "Dolphin":
                animalsList.add(((Dolphin) animal));
                System.out.println("Dolphin");
                break;

            case "Duck":
                animalsList.add(((Duck) animal));
                System.out.println("Duck");
                break;

            case "German Shepherd":
                animalsList.add(((GermanShepherd)animal));
                System.out.println("German Sheperd");
                break;

            case "golden retriever":
                animalsList.add(((golden) animal));
                System.out.println("golden");
                break;

            case "Parakeet":
                animalsList.add(((Parakeet) animal));
                System.out.println("Parakeet");
                break;

            case "Sharks":
                animalsList.add(((Sharks) animal));
                System.out.println("Sharks");
                break;

            default:
        }
    }

    public static void main(String[] args){
        LoadFile file= new LoadFile();
        file.LoadFile();
        Animals animal=new Animals();
        animal.readInput(Animals animal);
    }

    public void sortAnimalList() {
        for (Animals a: animalsList) {
                animalsList.add((a));
                Collections.sort(animalsList);
                System.out.println("Animal sorted alphabetically" +animalsList);
            }
        }

        public void customFilter(){
        List<Animals> Before2010 = animalsList.stream()
                .filter(p -> p.animalsList.YOB > 2010).collect(Collectors.toList());

        System.out.println("Animals born before 2010" +Before2010);
    }

    public void Swimmer(){

        for (Animals a: animalsList) {
            if (a instanceof Swimmer) {
                swimmerList.add((Swimmer) a);
             System.out.println("Swimmer" +swimmerList);
            }
        }

    }

}