package com.company.youtube;

import com.company.youtube.Observer;

interface Subject {
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObserver(String title);
}
