package com.woopaca.camoandroid.view;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import com.woopaca.camoandroid.R;
import com.woopaca.camoandroid.databinding.ActivityStartBinding;
import com.woopaca.camoandroid.view.auth.SignUpActivity;
import com.woopaca.camoandroid.viewmodel.StartViewModel;

public class StartActivity extends AppCompatActivity {

    private ActivityStartBinding binding;
    private StartViewModel startViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start);
        binding.setLifecycleOwner(this);

        startViewModel = new ViewModelProvider(this).get(StartViewModel.class);
        binding.setStartViewModel(startViewModel);

        setObserver();
    }

    private void setObserver() {
        startViewModel.getSignUpForm().observe(this, isClick -> {
            if (isClick) {
                finish();
                startActivity(new Intent(this, SignUpActivity.class));
            }
        });

        startViewModel.getSignInForm().observe(this, isClick -> {
            if (isClick) {
                finish();
                startActivity(new Intent(this, SignUpActivity.class));
            }
        });
    }
}