package com.woopaca.camoandroid.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StartViewModel extends ViewModel {

    private final MutableLiveData<Boolean> signUpForm = new MutableLiveData<>(false);
    private final MutableLiveData<Boolean> signInForm = new MutableLiveData<>(false);

    public MutableLiveData<Boolean> getSignUpForm() {
        return signUpForm;
    }

    public MutableLiveData<Boolean> getSignInForm() {
        return signInForm;
    }

    public void displaySignUpForm() {
        signUpForm.setValue(true);
    }

    public void displaySignInForm() {
        signInForm.setValue(true);
    }
}
