package com.cryptoplay.alphabro.cryptoplay;

import java.util.ArrayList;

/**
 * Created by android on 10/03/18.
 */

public class Coin {

    private String name;
    private ArrayList<DateValue> history = new ArrayList<>();

    public Coin(String name, DateValue dateValue) {
        this.name = name;
        this.history.add(dateValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DateValue> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<DateValue> history) {
        this.history = history;
    }

    public void addHistory(DateValue dateValue) {
        this.history.add(dateValue);
    }

}
