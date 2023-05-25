package com.hamza.unihub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hamza.Models.UniModel;
import com.hamza.MyAdapter.UniAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<UniModel> arrayList = new ArrayList<>();
        arrayList.add(new UniModel(R.drawable.qazam, "http://qau.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.lums, "https://www.lums.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uop, "http://www.pu.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.nust, "https://www.nust.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uok, "http://uok.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uet, "https://uet.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.akhan, "https://www.aku.edu/"));
        arrayList.add(new UniModel(R.drawable.uaf, "http://uaf.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uhs, "https://www.uhs.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.comsate, "https://www.comsats.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.pieas, "https://www.pieas.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uos, "http://www.uos.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.iba, "https://www.iba.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.ustbannu, "http://www.ustb.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uopashawer, "http://www.upesh.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uvas, "http://www.uvas.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.qznawab, "http://www.quest.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.giki, "https://www.giki.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.gcuf, "http://gcuf.edu.pk/"));
        arrayList.add(new UniModel(R.drawable.uog, "http://www.uog.edu.pk/"));



        UniAdapter adapter = new UniAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}