package project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<String> todos = new ArrayList<>();
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                printMenu();
                int ints = Integer.parseInt(scanner.nextLine());
                switch (ints) {
                    case 1:
                        createTodo(scanner);
                        break;
                    case 2:
                        if (!todos.isEmpty()) {
                            editTodo(scanner);
                        } else {
                            System.out.println("수정할 일 없습니다");
                        }
                        break;
                    case 3:
                        if (!todos.isEmpty()) {
                            finishTodo();
                        } else {
                            System.out.println("할일 업습니다.");
                        }
                        break;
                    case 4:
                        if (!todos.isEmpty()) {
                            deleteTodo(scanner);
                        } else {
                            System.out.println("삭제할 일 없습니다");
                        }
                        break;
                    case 5:
                        System.out.println("나간다");
                        scanner.close();
                        return;
                    default:
                        System.out.println("다시 입력하세요");
                }
            }
        }
 private static void printMenu() {
     System.out.println("\n Welcome!");
     if (todos.isEmpty()) {
         System.out.println("할일없습니다!!!");
     } else {
         System.out.println("해야 할일은:");
         for (int i = 0; i < todos.size(); i++) {
             System.out.println((i + 1) + ": " + todos.get(i));
         }
     }
     System.out.println("1. Create TODO ");
     System.out.println("2. Edit TODO ");
     System.out.println("3. Finish TODO ");
     System.out.println("4. Delete TODO ");
     System.out.println("5. Exit ");
     System.out.print("Input: ");
 }
    private static void createTodo (Scanner scanner) {
        System.out.print("할일 입력하세요: ");
        String todo = scanner.nextLine();
        todos.add(todo);
        System.out.println("할일 입력성공.");
    }
    private static void editTodo (Scanner scanner) {
        System.out.print("어떤 할일 수정하려고 합니까? ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= todos.size()) {
            System.out.println("잘못 입력하셨습니다");
            return;
        }
        System.out.print("새로 할일 입력: ");
        String newTodo = scanner.nextLine();
        todos.set(index, newTodo);
        System.out.println("수정 완료.");
    }
    private static void finishTodo () {
        System.out.println("첫번쩨 할일 완료");
        todos.remove(0);
    }

    private static void deleteTodo (Scanner scanner) {
        System.out.print("할일 삭제합니까? ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= todos.size()) {
            System.out.println("다시 입력하세요");
            return;
        }
        todos.remove(index);
        System.out.println("삭제 완료");
    }
}
