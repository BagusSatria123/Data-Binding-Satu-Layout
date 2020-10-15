package com.dina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.dina.dataModel.FormulirMahasiswa;
import com.dina.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    FormulirMahasiswa formulirMahasiswa;
    public static String PARAM_FORMULIR = "FORMULIR";
    ActivityMainBinding bind ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);
        formulirMahasiswa = new FormulirMahasiswa();
        bind.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // BAGIAN A. Data Calon Mahasiswa dan Orangtua/Wali
                formulirMahasiswa.setNama(bind.edtNama.getText().toString());

                bind.radioLakiLaki.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setJenisKelamin("Laki-Laki");
                        }
                    }
                });
                bind.radioPerempuan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setJenisKelamin("Perempuan");
                        }
                    }
                });

                bind.radio1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setStatus("Belum Menikah");
                        }
                    }
                });

                bind.radio2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setStatus("Menikah");
                        }
                    }
                });

                bind.radio3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setStatus("Biaragwan/Biarawati");
                        }
                    }
                });

                formulirMahasiswa.setAgama(bind.spinnerAgama.getSelectedItem().toString());

                bind.radioWNI.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setKewarganegaraan("WNI");
                        }
                    }
                });

                bind.radioWNA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setKewarganegaraan("WNA");
                        }
                    }
                });

                formulirMahasiswa.setAlamatSurat(bind.edtAlamatSurat.getText().toString());
                formulirMahasiswa.setAlamatAsli(bind.edtAlamatAsal.getText().toString());
                formulirMahasiswa.setKabkota(bind.edtkabkota.getText().toString());
                formulirMahasiswa.setProvinsi(bind.edtPropinsi.getText().toString());
                formulirMahasiswa.setNoTelpRumah(bind.edtNoTelp.getText().toString());
                formulirMahasiswa.setNoHp(bind.edtNoHP.getText().toString());
                formulirMahasiswa.setEmail(bind.edtEmail.getText().toString());
                formulirMahasiswa.setNamaOrangtua(bind.edtNamaOrtu.getText().toString());
                formulirMahasiswa.setTingkatPendidikan(bind.spinnerTPendidikan.getSelectedItem().toString());
                formulirMahasiswa.setAsalPerguruanTinggi(bind.edtAsalPT.getText().toString());
                formulirMahasiswa.setAsalProdi(bind.edtAsalPS.getText().toString());
                formulirMahasiswa.setStatusAkreditasi(bind.spinnerStatus.getSelectedItem().toString());

                // Bagian B. Program Studi Yang Dipilih
                bind.radioDesain1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setDesainProdukMekatronika("Pilihan I");
                        }
                    }
                });

                bind.radioDesain2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setDesainProdukMekatronika("Pilihan II");
                        }
                    }
                });

                bind.radioInstrumentasi1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setInstrumentMedis("Pilihan I");
                        }
                    }
                });

                bind.radioInstrumentasi2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setInstrumentMedis("Pilihan II");
                        }
                    }
                });

                // Bagian C. Data Sekolah Menengah
                formulirMahasiswa.setNamaSekolahMenengah(bind.edtNamaSekolah.getText().toString());
                formulirMahasiswa.setAlamatSekolah(bind.edtAlamatSekolah.getText().toString());
                formulirMahasiswa.setKabupatenkota(bind.edtKabKotaAlmtSekl.getText().toString());
                formulirMahasiswa.setProv(bind.edtPropinsiSekolah.getText().toString());
                formulirMahasiswa.setTahun(bind.edtTahun.getText().toString());
                formulirMahasiswa.setJumlahNilai(bind.edtJmlNilai.getText().toString());
                formulirMahasiswa.setJumlahMapel(bind.edtJmlMataPelajaran.getText().toString());
                formulirMahasiswa.setJurusan(bind.spinnerJurusan.getSelectedItem().toString());

                bind.radioNegeri.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setStatusSekolah("Negeri");
                        }
                    }
                });

                bind.radioSwasta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            formulirMahasiswa.setStatusSekolah("Swasta");
                        }
                    }
                });

                // BAGIAN D. Partisipasi Program Beasiswa Politeknik Mekatronika Sanata Dharma
                formulirMahasiswa.setPartisipasi(bind.edtPartisipasi.getText().toString());

                // BAGIAN E. Dokumen Pengajuan Beasiswa
                if(bind.pengajuan1.isChecked()) {
                    formulirMahasiswa.setCheckPengajuan1("Surat keterangan miskin dari desa/kelurahan");
                }
                if(bind.pengajuan2.isChecked()) {
                    formulirMahasiswa.setCheckPengajuan2("Surat keterangan gaji orang tua atau surat pernyataan yang mencantumkan rata rata pendapatan selama 6 bulan terakhir");
                }
                if(bind.pengajuan3.isChecked()) {
                    formulirMahasiswa.setCheckPengajuan3("Foto copy tagihan listrik, air");
                }
                if(bind.pengajuan4.isChecked()) {
                    formulirMahasiswa.setCheckPengajuan4("Bukti bukti prestasi yang dicantumkan dalam bentuk sertifikat");
                }
                if(bind.pengajuan5.isChecked()) {
                    formulirMahasiswa.setCheckPengajuan5("Ijasah dan transkrip nilai");
                }
                if(bind.pengajuan6.isChecked()) {
                    formulirMahasiswa.setCheckPengajuan6("Rekomendasi dari sekolah");
                }
                if(bind.pengajuan7.isChecked()) {
                    formulirMahasiswa.setCheckPengajuan7("Foto copy raport dari semester 1");
                }
                Intent intent = new Intent(getApplicationContext(),DetailFormulir.class);
                intent.putExtra(PARAM_FORMULIR, formulirMahasiswa);
                startActivity(intent);
            }
        });
    }
}