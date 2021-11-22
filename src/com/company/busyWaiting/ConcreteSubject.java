package com.company.busyWaiting;

public record ConcreteSubject(String name) implements Subject {

    @Override
    public void videoUploaded() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Has video been uploaded");
        }
        System.out.println("Video 'Hell of doom' uploaded");
    }
}
