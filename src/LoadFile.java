import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LoadFile {
    ArrayList<Animals> input;

    public LoadFile(){

       input = readFromCSV("Animals.csv");
    }

    public void LoadFile(){

        for (Animals load:input){
            System.out.println(input);
        }}

    public ArrayList<Animals> readFromCSV(String fileName){
        ArrayList<Animals> file = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            String line = br.readLine();
            while (line != null) {

                String[] attributes = line.split(",");
                Animals filetoLoad = createTask(attributes);
                file.add(filetoLoad);
                line = br.readLine();
            }

        }  catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return file;
    }

    private static Animals createTask(String[] metadata) {
        String breed = metadata[0];
        String name = metadata[1];
        String YOB = metadata[2];
        return new Animals(breed,name,YOB);
    }
}




