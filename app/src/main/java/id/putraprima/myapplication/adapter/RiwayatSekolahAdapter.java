package id.putraprima.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import id.putraprima.myapplication.R;
import id.putraprima.myapplication.models.RiwayatSekolah;

/**
 * Created by putraprima on 14/11/17.
 */

public class RiwayatSekolahAdapter extends RecyclerView.Adapter<RiwayatSekolahAdapter.MyViewHolder>{
    //datanya (1)
    List<RiwayatSekolah> listRiwayatSekolah;

    //construktornya (2)
    public RiwayatSekolahAdapter(List<RiwayatSekolah> listRiwayatSekolah) {
        this.listRiwayatSekolah = listRiwayatSekolah;
    }

    //return template item mana yang dipakai
    // buat viewholder (4)
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.item_sekolah,parent,false);
        return new MyViewHolder(itemView);
    }
    //mengisi data ke template
    // load data dari listRiwayatSekolah ke item
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RiwayatSekolah itemRiwayat = listRiwayatSekolah.get(position);
        holder.txtTahunSekolah.setText(itemRiwayat.getTahunSekolah());
        holder.txtTingkatSekolah.setText(itemRiwayat.getTingkatSekolah());
        holder.txtNamaSekolah.setText(itemRiwayat.getNamaSekolah());
    }
    //return jumlah data
    //item count (3)
    @Override
    public int getItemCount() {
        return listRiwayatSekolah.size();
    }

    //menyambungkan id template ke data
    // menghubungkan id layout ke variabel adapter (5)
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamaSekolah,txtTingkatSekolah,txtTahunSekolah;
        public MyViewHolder(View itemView) {

            super(itemView);
            txtNamaSekolah = itemView.findViewById(R.id.txtNamaSekolah);
            txtTahunSekolah = itemView.findViewById(R.id.txtTahunSekolah);
            txtTingkatSekolah = itemView.findViewById(R.id.txtTingkatSekolah);

        }
    }
}
