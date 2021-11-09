import java.util.Scanner;

public class ContainerTest {

    //доступный функционал
    public static void menu() {
        System.out.println("1 - Добавить элемент;");
        System.out.println("2 - Удалить элемент;");
        System.out.println("3 - Вывод всего контейнера;");
        System.out.println("4 - Размер контейнера;");
        System.out.println("5 - Очистить контейнер;");
        System.out.println("6 - Получить элемент;");
        System.out.println("7 - Выход;");
        System.out.print("Ввод >> ");
    }

    //тест контейнера
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Container<String> lst = new Container<>();
            int choice = 0;
            do {
                menu();
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: {
                        System.out.print("Введите элемент -> ");
                        String str = sc.nextLine();
                        lst.add(str);
                        break;
                    }
                    case 2: {
                        System.out.print("Введите элемент -> ");
                        String str = sc.nextLine();
                        lst.remove(str);
                        break;
                    }
                    case 3: {
                        lst.print();
                        break;
                    }
                    case 4: {
                        System.out.println("Размер = " + lst.getSize());
                        break;
                    }
                    case 5: {
                        lst.clear();
                        break;
                    }
                    case 6: {
                        System.out.print("Укажите номер -> ");
                        int num = Integer.parseInt(sc.nextLine());
                        String gt = lst.get(num);
                        if (gt != null) {
                            System.out.println(lst.get(num));
                        }
                        break;
                    }
                }
                System.out.println();
            } while (choice != 7);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}

