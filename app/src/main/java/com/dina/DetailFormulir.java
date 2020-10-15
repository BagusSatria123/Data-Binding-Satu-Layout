package com.dina;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.dina.dataModel.FormulirMahasiswa;
import com.dina.databinding.ActivityDetailFormulirBinding;

import java.util.Objects;

public class DetailFormulir extends AppCompatActivity {
    ActivityDetailFormulirBinding bind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this,R.layout.activity_detail_formulir);
        FormulirMahasiswa formulirMahasiswa = Objects.requireNonNull(getIntent().getExtras()).getParcelable(MainActivity.PARAM_FORMULIR);
        bind.setFormulir(formulirMahasiswa);
    }
}