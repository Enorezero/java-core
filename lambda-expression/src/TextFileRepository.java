import java.io.*;
import java.util.ArrayList;

public class TextFileRepository {
    File file = new File("data.txt");
    public void addTextEntry(String text){
        try(BufferedWriter out = new BufferedWriter(new FileWriter(file, true))){
            out.write(text);
            out.write('\n');
            out.flush();
            out.close();//нужно закрывать в finally
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<String>  getTextEntries(){
        ArrayList<String> textEntries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String entry;
            while ((entry = br.readLine()) != null) {
                textEntries.add(entry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return textEntries;

    }
}
