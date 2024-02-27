package app.service;
public class VegetableThread extends Thread {
    private final String[] vegetables;

    public VegetableThread(String[] vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public void run() {
        for (String vegetable : vegetables) {
            System.out.println("Vegetable: " + vegetable);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

