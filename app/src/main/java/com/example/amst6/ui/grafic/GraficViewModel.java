package com.example.amst6.ui.grafic;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class GraficViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GraficViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is grafic fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}