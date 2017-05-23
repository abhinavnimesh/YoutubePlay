package com.animator_abhi.youtubeplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<DataModel> dataModels;
    ListView listView;
    private static CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=(ListView)findViewById(R.id.list);

        dataModels= new ArrayList<>();

        dataModels.add(new DataModel("Kenny Sebastian 1", "Standup Comedy", "https://www.youtube.com/watch?v=4xljOfUBS9M",R.drawable.im1));
        dataModels.add(new DataModel("Kenny Sebastian 2", "Standup Comedy", "https://www.youtube.com/watch?v=e_NLZbKm5TY",R.drawable.im2));
        dataModels.add(new DataModel("Kenny Sebastian 3", "Standup Comedy", "https://www.youtube.com/watch?v=WTN8C_iS4BY",R.drawable.im3));
        dataModels.add(new DataModel("Kenny Sebastian 4", "Standup Comedy", "https://www.youtube.com/watch?v=ECbwCuN-5FE",R.drawable.im4));
        dataModels.add(new DataModel("Kenny Sebastian 5", "Standup Comedy", "https://www.youtube.com/watch?v=Cdsnc70Un14",R.drawable.im5));
        dataModels.add(new DataModel("Kenny Sebastian 6", "Standup Comedy", "https://www.youtube.com/watch?v=WqLRxAVwWhI",R.drawable.im6));
        dataModels.add(new DataModel("Kenny Sebastian 7", "Standup Comedy", "https://www.youtube.com/watch?v=Bvf-NZMWhYU",R.drawable.im7));
        dataModels.add(new DataModel("Kenny Sebastian 8", "Standup Comedy", "https://www.youtube.com/watch?v=Zbxruh0ZQBM",R.drawable.im8));
        dataModels.add(new DataModel("Kenny Sebastian 9", "Standup Comedy", "https://www.youtube.com/watch?v=ot-TTUsMuX4",R.drawable.im9));


        adapter= new CustomAdapter(dataModels,getApplicationContext());

       listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                DataModel dataModel= dataModels.get(position);
                Toast.makeText(MainActivity.this, dataModel.getName()+"\n"+dataModel.getdesc()+" URL: "+dataModel.getvideoUrl(), Toast.LENGTH_SHORT).show();

            }
        });
    }



}