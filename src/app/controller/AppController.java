package app.controller;

import app.service.FruitThread;
import app.service.VegetableThread;
public class AppController {
    public void Controller() {
        String[] fruits = {"Apple", "Banana", "Orange", "Grapes", "Pineapple"};
        String[] vegetables = {"Carrot", "Broccoli", "Tomato", "Cucumber", "Pepper"};

        VegetableThread vegetableThread = new VegetableThread(vegetables);
        FruitThread fruitThread = new FruitThread(fruits);

        vegetableThread.start();
        try {
            vegetableThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        fruitThread.start();
    }

}
