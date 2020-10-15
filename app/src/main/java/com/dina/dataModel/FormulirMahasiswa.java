package com.dina.dataModel;

import android.os.Parcel;
import android.os.Parcelable;

public class FormulirMahasiswa implements Parcelable {
    String nama, jenisKelamin, status, agama, kewarganegaraan, alamatSurat, alamatAsli, kabkota, provinsi, noTelpRumah, noHp, email,
            namaOrangtua, tingkatPendidikan, asalPerguruanTinggi, asalProdi, statusAkreditasi, desainProdukMekatronika, instrumentMedis,
            namaSekolahMenengah, alamatSekolah, kabupatenkota, prov, tahun, jumlahNilai, jumlahMapel, jurusan, statusSekolah, partisipasi,
            checkPengajuan1, checkPengajuan2, checkPengajuan3, checkPengajuan4, checkPengajuan5, checkPengajuan6, checkPengajuan7;

    public FormulirMahasiswa() {
    }

    public FormulirMahasiswa(String nama, String jenisKelamin, String status, String agama, String kewarganegaraan,
                             String alamatSurat, String alamatAsli, String kabkota, String provinsi, String noTelpRumah,
                             String noHp, String email, String namaOrangtua, String tingkatPendidikan, String asalPerguruanTinggi,
                             String asalProdi, String statusAkreditasi, String desainProdukMekatronika, String instrumentMedis,
                             String namaSekolahMenengah, String alamatSekolah, String kabupatenkota, String prov, String tahun,
                             String jumlahNilai, String jumlahMapel, String jurusan, String statusSekolah, String partisipasi,
                             String checkPengajuan1, String checkPengajuan2, String checkPengajuan3, String checkPengajuan4,
                             String checkPengajuan5,String checkPengajuan6, String checkPengajuan7) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
        this.agama = agama;
        this.kewarganegaraan = kewarganegaraan;
        this.alamatSurat = alamatSurat;
        this.alamatAsli = alamatAsli;
        this.kabkota = kabkota;
        this.provinsi = provinsi;
        this.noTelpRumah = noTelpRumah;
        this.noHp = noHp;
        this.email = email;
        this.namaOrangtua = namaOrangtua;
        this.tingkatPendidikan = tingkatPendidikan;
        this.asalPerguruanTinggi = asalPerguruanTinggi;
        this.asalProdi = asalProdi;
        this.statusAkreditasi = statusAkreditasi;
        this.desainProdukMekatronika = desainProdukMekatronika;
        this.instrumentMedis = instrumentMedis;
        this.namaSekolahMenengah = namaSekolahMenengah;
        this.alamatSekolah = alamatSekolah;
        this.kabupatenkota = kabupatenkota;
        this.prov = prov;
        this.tahun = tahun;
        this.jumlahNilai = jumlahNilai;
        this.jumlahMapel = jumlahMapel;
        this.jurusan = jurusan;
        this.statusSekolah = statusSekolah;
        this.partisipasi = partisipasi;
        this.checkPengajuan1 = checkPengajuan1;
        this.checkPengajuan2 = checkPengajuan2;
        this.checkPengajuan3 = checkPengajuan3;
        this.checkPengajuan4 = checkPengajuan4;
        this.checkPengajuan5 = checkPengajuan5;
        this.checkPengajuan6 = checkPengajuan6;
        this.checkPengajuan7 = checkPengajuan7;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getAlamatSurat() {
        return alamatSurat;
    }

    public void setAlamatSurat(String alamatSurat) {
        this.alamatSurat = alamatSurat;
    }

    public String getAlamatAsli() {
        return alamatAsli;
    }

    public void setAlamatAsli(String alamatAsli) {
        this.alamatAsli = alamatAsli;
    }

    public String getKabkota() {
        return kabkota;
    }

    public void setKabkota(String kabkota) {
        this.kabkota = kabkota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getNoTelpRumah() {
        return noTelpRumah;
    }

    public void setNoTelpRumah(String noTelpRumah) {
        this.noTelpRumah = noTelpRumah;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamaOrangtua() {
        return namaOrangtua;
    }

    public void setNamaOrangtua(String namaOrangtua) {
        this.namaOrangtua = namaOrangtua;
    }

    public String getTingkatPendidikan() {
        return tingkatPendidikan;
    }

    public void setTingkatPendidikan(String tingkatPendidikan) {
        this.tingkatPendidikan = tingkatPendidikan;
    }

    public String getAsalPerguruanTinggi() {
        return asalPerguruanTinggi;
    }

    public void setAsalPerguruanTinggi(String asalPerguruanTinggi) {
        this.asalPerguruanTinggi = asalPerguruanTinggi;
    }

    public String getAsalProdi() {
        return asalProdi;
    }

    public void setAsalProdi(String asalProdi) {
        this.asalProdi = asalProdi;
    }

    public String getStatusAkreditasi() {
        return statusAkreditasi;
    }

    public void setStatusAkreditasi(String statusAkreditasi) {
        this.statusAkreditasi = statusAkreditasi;
    }


    public String getDesainProdukMekatronika() {
        return desainProdukMekatronika;
    }

    public void setDesainProdukMekatronika(String desainProdukMekatronika) {
        this.desainProdukMekatronika = desainProdukMekatronika;
    }

    public String getInstrumentMedis() {
        return instrumentMedis;
    }

    public void setInstrumentMedis(String instrumentMedis) {
        this.instrumentMedis = instrumentMedis;
    }

    public String getNamaSekolahMenengah() {
        return namaSekolahMenengah;
    }

    public void setNamaSekolahMenengah(String namaSekolahMenengah) {
        this.namaSekolahMenengah = namaSekolahMenengah;
    }

    public String getAlamatSekolah() {
        return alamatSekolah;
    }

    public void setAlamatSekolah(String alamatSekolah) {
        this.alamatSekolah = alamatSekolah;
    }

    public String getKabupatenkota() {
        return kabupatenkota;
    }

    public void setKabupatenkota(String kabupatenkota) {
        this.kabupatenkota = kabupatenkota;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getJumlahNilai() {
        return jumlahNilai;
    }

    public void setJumlahNilai(String jumlahNilai) {
        this.jumlahNilai = jumlahNilai;
    }

    public String getJumlahMapel() {
        return jumlahMapel;
    }

    public void setJumlahMapel(String jumlahMapel) {
        this.jumlahMapel = jumlahMapel;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getStatusSekolah() {
        return statusSekolah;
    }

    public void setStatusSekolah(String statusSekolah) {
        this.statusSekolah = statusSekolah;
    }

    public String getPartisipasi() {
        return partisipasi;
    }

    public String getCheckPengajuan1() {
        return checkPengajuan1;
    }

    public void setCheckPengajuan1(String checkPengajuan1) {
        this.checkPengajuan1 = checkPengajuan1;
    }

    public String getCheckPengajuan2() {
        return checkPengajuan2;
    }

    public void setCheckPengajuan2(String checkPengajuan2) {
        this.checkPengajuan2 = checkPengajuan2;
    }

    public void setPartisipasi(String partisipasi) {
        this.partisipasi = partisipasi;
    }

    public String getCheckPengajuan3() {
        return checkPengajuan3;
    }

    public void setCheckPengajuan3(String checkPengajuan3) {
        this.checkPengajuan3 = checkPengajuan3;
    }

    public String getCheckPengajuan4() {
        return checkPengajuan4;
    }

    public void setCheckPengajuan4(String checkPengajuan4) {
        this.checkPengajuan4 = checkPengajuan4;
    }

    public String getCheckPengajuan5() {
        return checkPengajuan5;
    }

    public void setCheckPengajuan5(String checkPengajuan5) {
        this.checkPengajuan5 = checkPengajuan5;
    }

    public String getCheckPengajuan6() {
        return checkPengajuan6;
    }

    public void setCheckPengajuan6(String checkPengajuan6) {
        this.checkPengajuan6 = checkPengajuan6;
    }

    public String getCheckPengajuan7() {
        return checkPengajuan7;
    }

    public void setCheckPengajuan7(String checkPengajuan7) {
        this.checkPengajuan7 = checkPengajuan7;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.jenisKelamin);
        dest.writeString(this.status);
        dest.writeString(this.agama);
        dest.writeString(this.kewarganegaraan);
        dest.writeString(this.alamatSurat);
        dest.writeString(this.alamatAsli);
        dest.writeString(this.kabkota);
        dest.writeString(this.provinsi);
        dest.writeString(this.noTelpRumah);
        dest.writeString(this.noHp);
        dest.writeString(this.email);
        dest.writeString(this.namaOrangtua);
        dest.writeString(this.tingkatPendidikan);
        dest.writeString(this.asalPerguruanTinggi);
        dest.writeString(this.asalProdi);
        dest.writeString(this.statusAkreditasi);
        dest.writeString(this.desainProdukMekatronika);
        dest.writeString(this.instrumentMedis);
        dest.writeString(this.namaSekolahMenengah);
        dest.writeString(this.alamatSekolah);
        dest.writeString(this.kabupatenkota);
        dest.writeString(this.prov);
        dest.writeString(this.tahun);
        dest.writeString(this.jumlahNilai);
        dest.writeString(this.jumlahMapel);
        dest.writeString(this.jurusan);
        dest.writeString(this.statusSekolah);
        dest.writeString(this.partisipasi);
        dest.writeString(this.checkPengajuan1);
        dest.writeString(this.checkPengajuan2);
        dest.writeString(this.checkPengajuan3);
        dest.writeString(this.checkPengajuan4);
        dest.writeString(this.checkPengajuan5);
        dest.writeString(this.checkPengajuan6);
        dest.writeString(this.checkPengajuan7);
    }

    protected FormulirMahasiswa(Parcel in) {
        this.nama = in.readString();
        this.jenisKelamin = in.readString();
        this.status = in.readString();
        this.agama = in.readString();
        this.kewarganegaraan = in.readString();
        this.alamatSurat = in.readString();
        this.alamatAsli = in.readString();
        this.kabkota = in.readString();
        this.provinsi = in.readString();
        this.noTelpRumah = in.readString();
        this.noHp = in.readString();
        this.email = in.readString();
        this.namaOrangtua = in.readString();
        this.tingkatPendidikan = in.readString();
        this.asalPerguruanTinggi = in.readString();
        this.asalProdi = in.readString();
        this.statusAkreditasi = in.readString();
        this.desainProdukMekatronika = in.readString();
        this.instrumentMedis = in.readString();
        this.namaSekolahMenengah = in.readString();
        this.alamatSekolah = in.readString();
        this.kabupatenkota = in.readString();
        this.prov = in.readString();
        this.tahun = in.readString();
        this.jumlahNilai = in.readString();
        this.jumlahMapel = in.readString();
        this.jurusan = in.readString();
        this.statusSekolah = in.readString();
        this.partisipasi = in.readString();
        this.checkPengajuan1 = in.readString();
        this.checkPengajuan2 = in.readString();
        this.checkPengajuan3 = in.readString();
        this.checkPengajuan4 = in.readString();
        this.checkPengajuan5 = in.readString();
        this.checkPengajuan6 = in.readString();
        this.checkPengajuan7 = in.readString();
    }

    public static final Creator<FormulirMahasiswa> CREATOR = new Creator<FormulirMahasiswa>() {
        @Override
        public FormulirMahasiswa createFromParcel(Parcel source) {
            return new FormulirMahasiswa(source);
        }

        @Override
        public FormulirMahasiswa[] newArray(int size) {
            return new FormulirMahasiswa[size];
        }
    };
}
