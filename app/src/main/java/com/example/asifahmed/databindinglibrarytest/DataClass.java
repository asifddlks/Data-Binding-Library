package com.example.asifahmed.databindinglibrarytest;

import androidx.databinding.ObservableInt;

public class DataClass {

    String name;
    ObservableInt observableInt = new ObservableInt(0);

    public ObservableInt getObservableInt() {
        return observableInt;
    }

    public void setObservableInt(ObservableInt observableInt) {
        this.observableInt = observableInt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
