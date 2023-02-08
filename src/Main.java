import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("C://Users//Эльдар//Games");
        if(file.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(file)
                    .append(" is created")
                    .append('\n');
        }

        File src = new File("C://Users//Эльдар//Games//src");
        if(src.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(src)
                    .append(" is created")
                    .append('\n');
        }
        File res = new File("C://Users//Эльдар//Games//res");
        if(res.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(res)
                    .append(" is created")
                    .append('\n');
        }
        File savegame = new File("C://Users//Эльдар//Games//savegame");
        if(savegame.mkdir()){
            stringBuilder.append("Folder ")
                    .append(savegame)
                    .append(" is created")
                    .append('\n');
        }
        File temp = new File("C://Users//Эльдар//Games//temp");
        if(temp.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(temp)
                    .append(" is created")
                    .append('\n');
        }


        File main = new File("C://Users//Эльдар//Games//src//main");
        if(main.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(main)
                    .append(" is created")
                    .append('\n');
        }
        File test = new File("C://Users//Эльдар//Games//src//test");
        if (test.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(test)
                    .append(" is created")
                    .append('\n')
                    .append('\n');
        }

        File mainjava = new File("C://Users//Эльдар//Games//src//main//Main.java");
        try{
            if(mainjava.createNewFile()) {
                stringBuilder.append("File ")
                        .append(mainjava)
                        .append(" is created")
                        .append('\n');
            }
        } catch (IOException e) {
            stringBuilder.append(e.getMessage())
                    .append('\n');
            System.out.println(e.getMessage());
        }

        File utilsjava = new File("C://Users//Эльдар//Games//src//main//Utils.java");
        try{
            if(utilsjava.createNewFile()) {
                stringBuilder.append("File ")
                        .append(utilsjava)
                        .append(" is created")
                        .append('\n')
                        .append('\n');
            }
        } catch (IOException e) {
            stringBuilder.append(e.getMessage())
                    .append('\n')
                    .append('\n');
            System.out.println(e.getMessage());
        }

        File drawable = new File("C://Users//Эльдар//Games//res//drawable");
        if (drawable.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(drawable)
                    .append(" is created")
                    .append('\n');
        }
        File vectors = new File("C://Users//Эльдар//Games//res//vectors");
        if (vectors.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(vectors)
                    .append(" is created")
                    .append('\n');
        }
        File icons = new File("C://Users//Эльдар//Games//res//icons");
        if (icons.mkdir()) {
            stringBuilder.append("Folder ")
                    .append(icons)
                    .append(" is created")
                    .append('\n')
                    .append('\n');
        }

        File temptxt = new File("C://Users//Эльдар//Games//temp//temp.txt");
        try{
            if(temptxt.createNewFile()) {
                stringBuilder.append("File ")
                        .append(temptxt)
                        .append(" is created")
                        .append('\n');
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter writer = new FileWriter(temptxt)) {
            writer.write(stringBuilder.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        }
}