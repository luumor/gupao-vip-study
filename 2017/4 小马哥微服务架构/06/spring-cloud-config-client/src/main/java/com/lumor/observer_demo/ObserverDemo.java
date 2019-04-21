package com.lumor.observer_demo;

import java.util.Observable;
import java.util.Observer;

/**
 * @Auther: Administrator
 * @Date: 2019/4/14 0014 09:10
 * @Description:
 */
public class ObserverDemo {

    public static void main(String[] args) {

        MyObserver observable = new MyObserver();

        observable.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(arg);
            }
        });
        observable.setChanged();
        observable.notifyObservers("hello world!");
    }

    public static class MyObserver extends Observable {
        public synchronized void setChanged() {

            super.setChanged();

        }

    }
}
