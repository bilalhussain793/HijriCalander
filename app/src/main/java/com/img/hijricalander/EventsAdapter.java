package com.img.hijricalander;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EventsAdapter extends BaseAdapter{

    ArrayList<String> event;
    ArrayList<String> event_date;
    Context context;
    int clr;
    private static LayoutInflater inflater=null;

    public EventsAdapter(home2 home2, ArrayList<String> event_name, ArrayList<String> e_date) {
        // TODO Auto-generated constructor stub
        event=event_name;
        event_date=e_date;
        context=home2;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return event.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView os_text;
        TextView os_date;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        final View rowView;

        rowView = inflater.inflate(R.layout.events_layout, null);
        holder.os_text =(TextView) rowView.findViewById(R.id.tvc);
        holder.os_date =(TextView) rowView.findViewById(R.id.tvd);

        // holder.os_text.setBackgroundColor(clr);

        holder.os_text.setText(event.get(position));
        holder.os_date.setText(event_date.get(position));

        rowView.setOnClickListener(new OnClickListener() {

            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+event.get(position), Toast.LENGTH_SHORT).show();
                rowView.setBackgroundColor(R.color.black);
            }
        });

        return rowView;
    }
}