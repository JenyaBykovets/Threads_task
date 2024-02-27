package app.service;
public class FruitThread extends Thread {
    private final String[] fruits;

    public FruitThread(String[] fruits) {
        this.fruits = fruits;
    }

    @Override
    public void run() {
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
