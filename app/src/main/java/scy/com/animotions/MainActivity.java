package scy.com.animotions;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int[] colors = {android.R.color.holo_blue_bright, android.R.color.holo_green_light, android.R.color.holo_orange_light};
    DemoAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        final GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                int type = recyclerview.getAdapter().getItemViewType(position);
                if(type == 3){
                    return 2;
                }else {
                    return 1;
                }
            }
        });
        recyclerview.setLayoutManager(gridLayoutManager);
        adapter = new DemoAdapter(this);
        recyclerview.setAdapter(adapter);

        initData();
    }

    private void initData() {
        List<DataModel> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int type = (int) ((Math.random() * 3) + 1);
            DataModel dataModel = new DataModel();
            dataModel.avatarColor = colors[type - 1];
            dataModel.type = type;
            dataModel.name = "name :" + type;
            dataModel.content = "content : " + i;
            dataModel.contentColor = colors[(type + 1) % 3];
            list.add(dataModel);
        }
        adapter.addList(list);
        adapter.notifyDataSetChanged();

    }
}
