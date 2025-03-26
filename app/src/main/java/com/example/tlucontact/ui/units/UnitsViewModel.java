package com.example.tlucontact.ui.units;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UnitsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public UnitsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is units fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}