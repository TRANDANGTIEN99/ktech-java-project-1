package project;
import com.oracle.svm.core.annotate.Delete;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<ToDo1> ToDo1List = readData();
        System.out.println("Welcome!!!");
        System.out.println("할일 없습니다");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
//        System.out.print("title: ");
//        String title = reader.readLine();
//        System.out.print("until: ");
//        String until = reader.readLine();
//        LocalDate untilDate = LocalDate.parse(until);


            System.out.println("1. Create TODO ");
            System.out.println("2. Edit TODO ");
            System.out.println("3. Finish TODO ");
            System.out.println("4. Delete TODO ");
            System.out.println("5. Exit ");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input: ");
            String input = reader.readLine();
            if (input.equals("5")) {
                break;
            } else if (input.equals("1")) {
                System.out.print("title: ");
                String title = reader.readLine();
                System.out.print("until: ");
                String until = reader.readLine();
                LocalDate untilDate = LocalDate.parse(until);
                ToDo1List.add(new ToDo1(
                        title,
                        untilDate

                ));
            }
            System.out.println("Saved!!!");
        }

    }

    private static List<ToDo1> readData() {
        List<ToDo1> toDo1List = new ArrayList<>();
        try (FileReader fileReader = new FileReader("todo.csv");
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                LocalDate untilDate = LocalDate.parse(values[1]);
                toDo1List.add(new ToDo1(values[0], untilDate));
            }
        } catch (IOException e) {
            System.out.println("에러 정보를 읽는다: " + e.getMessage());
        }
        return toDo1List;
    }

}






//       String Create = reader.readLine();
//            String Edit = reader.readLine();
//            String Finish= reader.readLine();
//            String Delete= reader.readLine();
//            ToDoList.add(new ToDo(
//                    Create,
//                    Edit,
//                    Finish,
//                    Delete
//            ));