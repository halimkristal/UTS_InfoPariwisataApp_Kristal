package com.example.infopariwisata;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.appcompat.app.AppCompatActivity;

public class HalamanUtama extends AppCompatActivity {

    private ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler(Looper.getMainLooper());
    private int[] images; // Gambar asli untuk slideshow

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);

        // Inisialisasi ViewPager2
        viewPager2 = findViewById(R.id.viewPager2);

        // Array gambar untuk slideshow (dengan gambar pertama dan terakhir digandakan)
        images = new int[]{
                R.drawable.rajaampat, // Kloning dari gambar terakhir
                R.drawable.candi,
                R.drawable.pantai,
                R.drawable.gunung,
                R.drawable.komodo,
                R.drawable.toba,
                R.drawable.prambanan,
                R.drawable.tangkuban,
                R.drawable.ujungkulon,
                R.drawable.rajaampat // Kloning dari gambar pertama
        };

        // Membuat adapter untuk ViewPager2 dan mengaturnya
        SliderAdapter sliderAdapter = new SliderAdapter(images);
        viewPager2.setAdapter(sliderAdapter);

        // Atur posisi awal ke gambar pertama sebenarnya
        viewPager2.setCurrentItem(1, false);

        // Menjalankan slider otomatis
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 3000); // Delay 3 detik

                // Cek jika mencapai item pertama atau terakhir
                if (position == images.length - 1) {
                    viewPager2.setCurrentItem(1, false); // Kembali ke gambar pertama
                } else if (position == 0) {
                    viewPager2.setCurrentItem(images.length - 2, false); // Kembali ke gambar terakhir
                }
            }
        });
    }

    // Fungsi untuk berpindah ke MainActivity saat tombol "Masuk" diklik
    public void masukKeHalamanUtama(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            int nextPosition = viewPager2.getCurrentItem() + 1;
            viewPager2.setCurrentItem(nextPosition, true);
        }
    };

    @Override
    protected void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 3000);
    }
}
