package com.example.infopariwisata;// DetailActivity.java
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private TextView txtNamaTempat, txtLokasiTempat, txtDeskripsi;
    private ImageView imgThumbnail;
    private Button btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        // Inisialisasi view
        txtNamaTempat = findViewById(R.id.txtNamaTempatDetail);
        txtLokasiTempat = findViewById(R.id.txtLokasiTempatDetail);
        txtDeskripsi = findViewById(R.id.txtDeskripsiDetail);
        imgThumbnail = findViewById(R.id.imgThumbnailDetail);
        btnKembali = findViewById(R.id.btnKembali); // Inisialisasi btnKembali

        // Mendapatkan data dari Intent
        String nama = getIntent().getStringExtra("nama");
        String lokasi = getIntent().getStringExtra("lokasi");
        String deskripsi = getIntent().getStringExtra("deskripsi"); // Menerima deskripsi
        int gambarDetail = getIntent().getIntExtra("gambarDetail", 0);

        // Menampilkan data
        txtNamaTempat.setText(nama);
        txtLokasiTempat.setText(lokasi);
        txtDeskripsi.setText(deskripsi);
        imgThumbnail.setImageResource(gambarDetail);

        Toast.makeText(this, "Selamat datang di halaman Detail!", Toast.LENGTH_SHORT).show();

        // Logika Button Kembali
        btnKembali.setOnClickListener(v -> finish());
    }
}
