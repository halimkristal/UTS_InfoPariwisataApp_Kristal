package com.example.infopariwisata;// AdapterWisata.java
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AdapterWisata extends RecyclerView.Adapter<AdapterWisata.ViewHolder> {

    private Context context;
    private List<TempatWisata> listTempatWisata;

    public AdapterWisata(Context context, List<TempatWisata> listTempatWisata) {
        this.context = context;
        this.listTempatWisata = listTempatWisata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_wisata, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TempatWisata tempat = listTempatWisata.get(position);

        holder.txtNamaTempat.setText(tempat.getNama());
        holder.txtLokasiTempat.setText(tempat.getLokasi());
        holder.imgThumbnail.setImageResource(tempat.getThumbnail());

        // Menambahkan OnClickListener untuk item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            // Mengirim data ke DetailActivity
            intent.putExtra("nama", tempat.getNama());
            intent.putExtra("lokasi", tempat.getLokasi());
            intent.putExtra("deskripsi", tempat.getDeskripsi());  // Mengirim deskripsi
            intent.putExtra("thumbnail", tempat.getThumbnail());
            intent.putExtra("gambarDetail", tempat.getGambarDetail());
            context.startActivity(intent);
        });
    }


    @Override
    public int getItemCount() {
        return listTempatWisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamaTempat, txtLokasiTempat;
        ImageView imgThumbnail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNamaTempat = itemView.findViewById(R.id.txtNamaTempat);
            txtLokasiTempat = itemView.findViewById(R.id.txtLokasiTempat);
            imgThumbnail = itemView.findViewById(R.id.imgThumbnail);
        }
    }
}
