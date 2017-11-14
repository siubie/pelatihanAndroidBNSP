package id.putraprima.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.putraprima.myapplication.adapter.RiwayatSekolahAdapter;
import id.putraprima.myapplication.models.RiwayatSekolah;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcvRiwayatSekolah;
    RiwayatSekolahAdapter mAdapter;
    List<RiwayatSekolah> listRiwayatSekolah = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvRiwayatSekolah = (RecyclerView) findViewById(R.id.listRiwayatSekolah);

        mAdapter = new RiwayatSekolahAdapter(listRiwayatSekolah);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rcvRiwayatSekolah.setLayoutManager(mLayoutManager);
        rcvRiwayatSekolah.setAdapter(mAdapter);

        loadData();
    }

    private void loadData() {
        RiwayatSekolah mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mData = new RiwayatSekolah("SDN 001","Sekolah Dasar","1995");
        listRiwayatSekolah.add(mData);
        mAdapter.notifyDataSetChanged();
    }
}
