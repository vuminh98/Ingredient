import java.util.Scanner;

public class MaterialSystem {
    private final MaterialManager materialManager;
    private final Scanner scanner;


    public MaterialSystem() {
        this.materialManager = new MaterialManager();
        this.scanner = new Scanner(System.in);
    }

    public void menuBookManager() {
        do {
            System.out.println("MENU");
            System.out.println("1. Create New Material");
            System.out.println("2. Delete Material");
            System.out.println("3. Update Material");
            System.out.println("4. Display");
            System.out.println("0. Quit");
            System.out.println("Input your select: ");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1) {
                case 1:
                    menuCreateBook();
                    break;
                case 2:
                    materialManager.deleteMaterial(scanner);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private void menuCreateBook() {
        int choice2;
        do {
            System.out.println("Select material: ");
            System.out.println("1. CrispyFlour");
            System.out.println("2. Meat");
            System.out.println("0. Quit");
            choice2 = Integer.parseInt(scanner.nextLine());
            if (choice2 == 0) {
                break;
            }
            materialManager.createMaterial(choice2, scanner);
        } while (true);
    }
}
