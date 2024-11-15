package com.example.infopariwisata;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterWisata adapterWisata;
    private List<TempatWisata> listTempatWisata;
    private List<TempatWisata> filteredList; // List untuk menyimpan hasil pencarian
    private SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi RecyclerView dan SearchView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        searchView = findViewById(R.id.searchView);

        // Membuat data tempat wisata
        listTempatWisata = new ArrayList<>();
        listTempatWisata.add(new TempatWisata(
                "Candi Borobudur",
                "Magelang, Jawa Tengah",
                R.drawable.t_borobudur,
                R.drawable.candi,
                "  Candi Borobudur adalah salah satu warisan budaya dunia yang terletak di Magelang, Jawa Tengah. Dikenal sebagai monumen Buddha terbesar di dunia, Borobudur memiliki arsitektur megah yang dibangun pada abad ke-9 di bawah dinasti Syailendra. Monumen ini terdiri dari sembilan platform bertingkat, dihiasi dengan lebih dari 2.600 panel relief yang menggambarkan berbagai ajaran Buddha dan kehidupan masa itu.\n\n"
                        + "  Dengan 504 arca Buddha, Candi Borobudur menawarkan pengalaman spiritual yang dalam bagi pengunjung. Setiap tahun, candi ini menjadi tempat ziarah ribuan umat Buddha dari seluruh dunia yang berkumpul untuk merayakan Hari Waisak. Perayaan ini diwarnai dengan prosesi lampion yang menghiasi langit malam Borobudur, menciptakan pemandangan yang luar biasa indah dan magis.\n\n"
                        + "  Bagi wisatawan, pemandangan matahari terbit dari puncak candi adalah salah satu daya tarik utama. Dari sini, suasana magis menyelimuti Borobudur saat sinar pertama menyentuh stupa-stupa yang menjulang. Pengalaman ini memberikan kesan mendalam dan menjadikan Borobudur sebagai tujuan wisata yang wajib dikunjungi."
        ));

        listTempatWisata.add(new TempatWisata(
                "Pantai Kuta",
                "Bali",
                R.drawable.t_kuta,
                R.drawable.pantai,
                "  Pantai Kuta adalah ikon wisata di Bali yang dikenal dengan pasir putihnya yang lembut dan ombak yang cocok untuk berselancar. Kawasan ini awalnya adalah desa nelayan sederhana, namun kini telah berkembang menjadi destinasi wisata yang ramai dan modern, dengan berbagai fasilitas seperti hotel, restoran, dan pusat perbelanjaan.\n\n"
                        + "  Kehidupan malam di Pantai Kuta juga sangat meriah. Wisatawan dapat menemukan berbagai hiburan malam, seperti klub, bar, dan restoran yang ramai oleh pengunjung lokal maupun mancanegara. Tidak hanya itu, suasana pantai pada sore hari juga sangat menawan dengan pemandangan matahari terbenam yang spektakuler.\n\n"
                        + "  Pantai Kuta menjadi pilihan yang ideal untuk bersantai, menikmati suasana pantai, atau belajar berselancar. Selain itu, lokasinya yang strategis menjadikannya titik awal yang sempurna untuk menjelajahi tempat-tempat menarik lainnya di Bali, seperti Pantai Legian, Seminyak, dan Canggu."
        ));

        listTempatWisata.add(new TempatWisata(
                "Gunung Bromo",
                "Probolinggo, Jawa Timur",
                R.drawable.t_bromo,
                R.drawable.gunung,
                "  Gunung Bromo adalah salah satu destinasi wisata alam terpopuler di Indonesia, menawarkan pemandangan spektakuler dan keajaiban alam yang tiada duanya. Terletak di Taman Nasional Bromo Tengger Semeru, gunung ini terkenal dengan lautan pasir seluas 10 kilometer persegi yang mengelilingi kawahnya.\n\n"
                        + "  Perjalanan menuju puncak Bromo biasanya dimulai pada dini hari untuk menyaksikan pemandangan matahari terbit yang menakjubkan. Wisatawan dapat melihat matahari perlahan muncul dari balik gunung, menerangi lautan pasir yang luas dan menciptakan suasana yang magis.\n\n"
                        + "  Selain itu, masyarakat Tengger yang tinggal di sekitar Bromo memiliki kebudayaan yang unik dan kerap mengadakan upacara Kasada sebagai wujud syukur mereka. Hal ini menambah daya tarik Bromo sebagai destinasi wisata yang menggabungkan keindahan alam dan kekayaan budaya lokal."
        ));

        listTempatWisata.add(new TempatWisata(
                "Taman Mini Indonesia Indah",
                "Jakarta",
                R.drawable.t_tmii,
                R.drawable.taman,
                "  Taman Mini Indonesia Indah (TMII) merupakan taman wisata budaya yang terletak di Jakarta, yang memperkenalkan beragam budaya dari seluruh penjuru Indonesia.\n\n"
                        + "  Di dalam TMII, pengunjung bisa melihat replika rumah adat dari setiap provinsi di Indonesia, lengkap dengan pernak-pernik tradisional yang khas.\n\n"
                        + "  Selain itu, taman ini memiliki banyak museum yang mengangkat tema budaya dan sejarah Indonesia, seperti Museum Indonesia, Museum Transportasi, dan Museum Pusaka.\n\n"
                        + "  TMII juga memiliki berbagai wahana hiburan dan taman bunga yang menarik untuk dikunjungi bersama keluarga. Bagi anak-anak, TMII menawarkan berbagai permainan seru dan edukatif. Pengalaman menjelajahi TMII seperti berkeliling Nusantara dalam satu hari, menjadikannya tempat yang sangat informatif sekaligus menyenangkan."
        ));

        listTempatWisata.add(new TempatWisata(
                "Pantai Raja Ampat",
                "Papua Barat",
                R.drawable.t_rajaampat,
                R.drawable.rajaampat,
                "  Raja Ampat adalah surga tropis yang tersembunyi di Papua Barat, terkenal dengan keindahan bawah lautnya yang memukau. Kawasan ini memiliki lebih dari 1.500 pulau kecil yang dikelilingi oleh perairan jernih dan terumbu karang yang kaya akan keanekaragaman hayati.\n\n"
                        + "  Di Raja Ampat, wisatawan dapat melihat ribuan spesies ikan, terumbu karang berwarna-warni, dan bahkan penyu laut. Aktivitas snorkeling dan menyelam di sini menjadi pengalaman yang tak terlupakan.\n\n"
                        + "  Selain itu, pemandangan dari atas Pulau Wayag dengan deretan pulau-pulau kecilnya yang hijau membuat Raja Ampat terlihat seperti lukisan alam yang luar biasa indahnya. Keindahan alamnya menjadikan Raja Ampat sebagai destinasi yang diidamkan oleh banyak wisatawan dari seluruh dunia."
        ));

        listTempatWisata.add(new TempatWisata(
                "Tangkuban Perahu",
                "Lembang, Bandung, Jawa Barat",
                R.drawable.t_tangkuban,
                R.drawable.tangkuban,
                "  Tangkuban Perahu adalah gunung berapi yang terkenal dengan bentuknya yang menyerupai perahu terbalik, serta legenda Sangkuriang yang menjadi latar ceritanya.\n\n"
                        + "  Kawah utama Tangkuban Perahu, yakni Kawah Ratu, menawarkan pemandangan asap belerang yang eksotis dan udara pegunungan yang sejuk. Wisatawan bisa berjalan kaki atau menyewa kuda untuk mengelilingi kawah ini.\n\n"
                        + "  Di sekitar kawasan Tangkuban Perahu, terdapat pula pemandian air panas alami yang diyakini memiliki manfaat kesehatan. Suasana alam yang asri dan udara yang segar menjadikan Tangkuban Perahu sebagai tempat wisata favorit bagi warga Bandung dan sekitarnya."
        ));

        listTempatWisata.add(new TempatWisata(
                "Pulau Komodo",
                "Nusa Tenggara Timur",
                R.drawable.t_komodo,
                R.drawable.komodo,
                "  Pulau Komodo adalah rumah bagi spesies komodo, kadal raksasa yang hanya ditemukan di Indonesia. Pulau ini menawarkan petualangan yang unik bagi para pengunjung yang ingin melihat kehidupan komodo di habitat aslinya.\n\n"
                        + "  Selain kehidupan liar, Pulau Komodo juga memiliki Pantai Pink yang terkenal karena pasirnya yang berwarna merah muda. Snorkeling di sekitar perairan ini adalah pengalaman yang luar biasa, karena terumbu karang di sini sangat indah dan kaya dengan kehidupan laut.\n\n"
                        + "  Pulau Komodo merupakan bagian dari Taman Nasional Komodo, kawasan konservasi yang diakui oleh UNESCO, menjadikannya tujuan wisata penting bagi pecinta alam dan kehidupan laut."
        ));

        listTempatWisata.add(new TempatWisata(
                "Danau Toba",
                "Sumatera Utara",
                R.drawable.t_toba,
                R.drawable.toba,
                "  Danau Toba adalah danau vulkanik terbesar di dunia yang menawarkan pemandangan alam yang memukau dan budaya yang kaya. Terletak di Sumatera Utara, danau ini memiliki pulau besar di tengahnya, yaitu Pulau Samosir.\n\n"
                        + "  Pulau Samosir adalah pusat kebudayaan Batak dan memiliki banyak situs bersejarah, seperti makam raja-raja Batak dan rumah adat Batak yang khas.\n\n"
                        + "  Danau Toba dikelilingi oleh pegunungan hijau yang menambah keindahan alam di sekitarnya. Suasana tenang dan udara segar menjadikan Danau Toba sebagai tempat yang ideal untuk berlibur dan bersantai."
        ));

        listTempatWisata.add(new TempatWisata(
                "Ujung Kulon",
                "Banten",
                R.drawable.t_ujungkulon,
                R.drawable.ujungkulon,
                "  Taman Nasional Ujung Kulon adalah kawasan konservasi yang terkenal dengan hutan tropisnya dan sebagai habitat terakhir bagi badak Jawa yang hampir punah.\n\n"
                        + "  Selain badak Jawa, Ujung Kulon juga menjadi rumah bagi berbagai spesies flora dan fauna yang langka. Di sini, pengunjung bisa menikmati keindahan alam melalui trekking, melihat satwa liar, atau sekadar bersantai di pantai yang sepi.\n\n"
                        + "  Taman Nasional Ujung Kulon juga mencakup kawasan pulau-pulau kecil yang indah, seperti Pulau Peucang, yang memiliki pantai pasir putih dan perairan jernih. Ujung Kulon merupakan tempat yang cocok bagi pencinta alam dan petualangan yang ingin merasakan keindahan alam liar Indonesia."
        ));


        listTempatWisata.add(new TempatWisata(
                "Candi Prambanan",
                "Yogyakarta",
                R.drawable.t_prambanan,
                R.drawable.prambanan,
                "  Candi Prambanan adalah candi Hindu terbesar di Indonesia yang dibangun pada abad ke-9, terkenal dengan keindahan arsitektur dan nilai historisnya.\n\n"
                        + "  Candi ini terdiri dari tiga candi utama yang didedikasikan untuk dewa utama dalam ajaran Hindu, yaitu Brahma, Wisnu, dan Siwa. Relief-relief "
                        + "yang terdapat di dinding candi menggambarkan kisah epik Ramayana, yang membuat Prambanan menjadi daya tarik utama bagi wisatawan domestik dan "
                        + "mancanegara. Setiap tahun, diadakan pertunjukan tari Ramayana di Prambanan yang menarik banyak pengunjung, terutama pada malam hari dengan "
                        + "latarnya yang megah dan atmosfer yang mistis.\n\n"
                        + "  Candi Prambanan tidak hanya menjadi situs sejarah yang penting, tetapi juga simbol kebesaran budaya Hindu di Indonesia. Selain itu, kawasan ini "
                        + "dikelilingi oleh taman yang indah, menjadikannya tempat yang menyenangkan untuk berjalan-jalan dan menikmati keindahan alam sambil mempelajari "
                        + "lebih dalam tentang sejarah dan mitologi Hindu."
        ));




        // Buat filteredList sebagai salinan dari listTempatWisata
        filteredList = new ArrayList<>(listTempatWisata);

        // Mengatur Adapter untuk RecyclerView
        adapterWisata = new AdapterWisata(this, filteredList);
        recyclerView.setAdapter(adapterWisata);

        // membuat box search terlihat
        searchView.setIconifiedByDefault(false);

        // Set listener untuk SearchView
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Tidak diperlukan tindakan khusus saat submit
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filter(newText); // Panggil metode filter saat teks pencarian berubah
                return true;
            }
        });
    }

    // Metode untuk memfilter data tempat wisata berdasarkan nama
    private void filter(String text) {
        filteredList.clear();
        if (text.isEmpty()) {
            filteredList.addAll(listTempatWisata); // Tampilkan semua data jika pencarian kosong
        } else {
            for (TempatWisata tempat : listTempatWisata) {
                if (tempat.getNama().toLowerCase().contains(text.toLowerCase())) {
                    filteredList.add(tempat); // Tambahkan ke filteredList jika cocok dengan pencarian
                }
            }
        }
        adapterWisata.notifyDataSetChanged(); // Update tampilan RecyclerView
    }
}


