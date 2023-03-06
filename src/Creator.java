import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creator {

    IOException e = new IOException("Fault!");

    StringBuilder stringBuilder = new StringBuilder();
    public File folderCreator(String path) {
        File file = new File(path);
        file.mkdir();
        return file;
    }

    public File fileCreator (String path) {
        File file = new File(path);
        try{
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return file;
    }
    public StringBuilder createRecorder(File file) throws IOException {
        if(file.exists()) {
            stringBuilder.append("Folder/File ")
                    .append(file)
                    .append(" is created")
                    .append('\n');

        }
        else {
            stringBuilder.append(e.getMessage())
                    .append('\n')
                    .append("File wasn't created")
                    .append('\n');
        }
        return stringBuilder;

    }

    public void recordWriter() {
        try(FileWriter writer = new FileWriter("C://Users//Эльдар//Games//temp//temp.txt")) {
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
