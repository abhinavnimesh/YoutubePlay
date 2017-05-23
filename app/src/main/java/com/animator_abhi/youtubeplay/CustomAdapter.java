package com.animator_abhi.youtubeplay;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ANIMATOR ABHI on 23/05/2017.
 */
public class CustomAdapter extends ArrayAdapter<DataModel> implements View.OnClickListener{

    private ArrayList<DataModel> dataSet;
    Context mContext;


    private static class ViewHolder {

        TextView title;
        TextView desc;
        ImageView iv;

    }

    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.custom_list, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        DataModel dataModel=(DataModel)object;

        switch (v.getId())
        {
            case R.id.imageView1:
                Toast.makeText(getContext(),"Name: " +dataModel.getName(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(dataModel.getvideoUrl()));
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mContext.startActivity(i);


                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DataModel dataModel = getItem(position);

        ViewHolder viewHolder;

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.custom_list, parent, false);

            viewHolder.title = (TextView) convertView.findViewById(R.id.textView1);
            viewHolder.desc = (TextView) convertView.findViewById(R.id.textView2);

            viewHolder.iv = (ImageView) convertView.findViewById(R.id.imageView1);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }


        lastPosition = position;

        viewHolder.title.setText(dataModel.getName());
        viewHolder.desc.setText(dataModel.getdesc());

        viewHolder.iv.setImageResource(dataModel.thumbId);
        viewHolder.iv.setOnClickListener(this);
        viewHolder.iv.setTag(position);

        return convertView;
    }
}