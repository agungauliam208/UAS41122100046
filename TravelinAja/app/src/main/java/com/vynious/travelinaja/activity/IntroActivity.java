package com.vynious.travelinaja.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.vynious.travelinaja.R;
import com.vynious.travelinaja.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.introBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, LoginActivity.class)));

    }
}