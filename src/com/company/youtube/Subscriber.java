package com.company.youtube;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title) {
        System.out.println("Hello "+this.name + ", new video uploaded  '"+title+"'");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                '}';
    }
}
