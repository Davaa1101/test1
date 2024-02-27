import java.util.Scanner;

import dataStructures.ArrayStack;
public class Circle {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(10); // Creating a stack with capacity 10
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Оператор сонго:");
            System.out.println("1. Хийх");
            System.out.println("2. Оройн элемэнт гаргах");
            System.out.println("3. Оройн элемэнт харах");
            System.out.println("4. Хоосон эсэхийг шалгах");
            System.out.println("5. Хэмжээ шалгах");
            System.out.println("6. Оройн элемэнтийг давхардуулах");
            System.out.println("7. Хөрвүүлэх");
            System.out.println("8. Хэвлэх");
            System.out.println("9. Гарах");
            System.out.print("Сонголтоо оруулна уу: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Хийх элемэнтийг оруул: ");
                    int elementToPush = scanner.nextInt();
                    stack.push(elementToPush);
                    break;
                case 2:
                    try {
                        int poppedElement = stack.pop();
                        System.out.println("Гарсан элемэнт: " + poppedElement);
                    } catch (Exception e) {
                        System.out.println("Хоосон учраас гарахгүй.");
                    }
                    break;
                case 3:
                    try {
                        int topElement = stack.peek();
                        System.out.println("оройн элемэнт: " + topElement);
                    } catch (Exception e) {
                        System.out.println("Хоосон.");
                    }
                    break;
                case 4:
                    System.out.println("дараалал " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Дарааллын хэмжээ: " + stack.size());
                    break;
                case 6:
                    try {
                        stack.duplicateTop();
                        System.out.println("оройн элемэнтыг давхардуулсан.");
                    } catch (Exception e) {
                        System.out.println("Хоосон.");
                    }
                    break;
                case 7:
                    stack.reverseStack();
                    System.out.println("Хөрвүүлсэн.");
                    break;
                case 8:
                    stack.printStack();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Гарсан");
                    break;
                default:
                    System.out.println("Буруу с.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
