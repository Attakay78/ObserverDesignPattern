package com.company.youtube;

import java.util.*;

public class Channel implements Subject {
    private final Set<Observer> observerList = new HashSet<>();

        @Override
        public void addObserver(Observer ob) {
            observerList.add(ob);
        }

        @Override
        public void removeObserver(Observer ob) {
                observerList.remove(ob);
        }

        @Override
        public void notifyObserver(String title) {
            observerList.forEach(observer -> observer.update(title));
        }

        public void uploadVideo(String title) {
            this.notifyObserver(title);
        }

        public Set<Observer> getObserverList() {
            return observerList;
        }

        @Override
        public String toString() {
            return "Channel{" +
                    ", observerList=" + observerList +
                    '}';
        }
    }

