import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MaterialManager {

    public static ArrayList<Material> materials;

    public static void ListMaterial() {
        materials.add(new CrispyFlour("A1", "CrispyFlour1", LocalDate.of(2022, 3, 20), 50000, 20));
        materials.add(new CrispyFlour("A2", "CrispyFlour2", LocalDate.of(2022, 5, 20), 70000, 15));
        materials.add(new CrispyFlour("A3", "CrispyFlour3", LocalDate.of(2022, 4, 20), 90000, 10));
        materials.add(new CrispyFlour("A4", "CrispyFlour4", LocalDate.of(2022, 2, 20), 100000, 15));
        materials.add(new CrispyFlour("A5", "CrispyFlour5", LocalDate.of(2022, 8, 20), 30000, 30));
        materials.add(new Meat("A6", "Meat1", LocalDate.of(2022, 5, 15), 30000, 5));
        materials.add(new Meat("A6", "Meat1", LocalDate.of(2022, 5, 20), 70000, 8));
        materials.add(new Meat("A6", "Meat1", LocalDate.of(2022, 5, 25), 80000, 10));
        materials.add(new Meat("A6", "Meat1", LocalDate.of(2022, 5, 30), 90000, 3));
        materials.add(new Meat("A6", "Meat1", LocalDate.of(2022, 5, 5), 20000, 9));
    }


    public static void createMaterial(int choice, Scanner scanner) {
        if (choice < 1 || choice > 2) {
            System.out.println("Please select again!");
        } else {
            System.out.println("Input ID: ");
            String id = scanner.next();
            System.out.println("Input name material: ");
            String name = scanner.next();
            System.out.println("Input day: ");
            int day = scanner.nextInt();
            System.out.println("Input month: ");
            int month = scanner.nextInt();
            System.out.println("Input year: ");
            int year = scanner.nextInt();
            LocalDate.of(day, month, year);
            System.out.println("Input cost: ");
            int cost = scanner.nextInt();
            if (choice == 1) {
                materials.add(new CrispyFlour(id, name, LocalDate.of(year, month, day), cost));
            } else {
                System.out.println("Input weight:");
                int weight = scanner.nextInt();
                materials.add(new Meat(id, name, LocalDate.of(year, month, day), cost, weight));
            }
        }
    }

    public static void deleteMaterial(Scanner scanner) {
        System.out.println("Input ID");
        String id = scanner.next();
        for (int i = 0; i < materials.size(); i++) {
            if (Objects.equals(id, materials.get(i).getId())) {
                materials.remove(i);
            }
        }
    }
}
