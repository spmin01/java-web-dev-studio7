package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {

    private ArrayList<Integer> data;
    private String title;
    private final int capacity;

    public BaseDisc(int capacity) {
        this.title = "Untitled";
        this.capacity = capacity;
    }

    public BaseDisc(String title, int capacity) {
        this(capacity);
        this.data = new ArrayList<>();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRemainingCapacity() {
        return capacity - data.size();
    }



    @Override
    public int read(int track) {
        return data.get(track - 1);
    }


    @Override
    public boolean write(int data) {
        if(this.data.size() == capacity) {
            return false;
        } else {
            this.data.add(data);
            return true;
        }
    }
}
