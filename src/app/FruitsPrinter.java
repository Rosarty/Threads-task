package app;

public class FruitsPrinter implements Runnable {

    public void run() {
        String[] namefruits = new String[]{"Cherry", "Apple", "Orange"};
        for (String namefruit : namefruits) {
            System.out.println("Fruit :" + namefruit);
        }
    }
}
