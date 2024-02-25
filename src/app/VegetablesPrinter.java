package app;

public class VegetablesPrinter implements Runnable {

    public void run() {
        String[] namevegetables = new String[]{"Potato", "Tomato", "Onion"};

        for (String namevegetable : namevegetables) {
            System.out.println("Vegetable :" + namevegetable);
        }
    }
}
