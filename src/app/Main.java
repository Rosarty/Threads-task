package app;

public class Main {
    public static void main(String[] args) {
        Thread fruitsThread = new Thread(new FruitsPrinter());
        Thread vegetablesThread = new Thread(new VegetablesPrinter());
        vegetablesThread.start();
        try {
            vegetablesThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        fruitsThread.start();
    }
}


