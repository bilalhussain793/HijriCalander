package com.img.hijricalander;

import android.app.Fragment;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.eltohamy.materialhijricalendarview.CalendarDay;
import com.github.eltohamy.materialhijricalendarview.MaterialHijriCalendarView;
import com.github.eltohamy.materialhijricalendarview.OnDateSelectedListener;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static com.img.hijricalander.R.id.clnd;


public class BlankFragment extends Fragment {
MaterialHijriCalendarView cnd;
    View view;
    private Fragment baseContext;
    private int contentView;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        String lan="ar";
        Locale locale=new Locale(lan);
        Locale.setDefault(locale);
        Configuration configuration=new Configuration();
        configuration.locale=locale;
        view = inflater.inflate(R.layout.fragment_blank, container, false);

        cnd=view.findViewById(clnd);
        cnd.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialHijriCalendarView widget, @NonNull CalendarDay date, boolean selected) {


                String dat=""+cnd.getSelectedDate();
//                Toast.makeText(getContext(), ""+dat, Toast.LENGTH_SHORT).show();

                String dat2=dat.substring(dat.indexOf("{"),dat.indexOf("}"));
                String dat3=dat2.substring(6);
                home2.event_date.clear();
                home2.event.clear();
                //adapter=new EventsAdapter(MainActivity.this,event,event_date);
                evn(dat3);

              //  Toast.makeText(getContext(), ""+dat3, Toast.LENGTH_SHORT).show();


                home2.listView.setAdapter(home2.adapter);
//                MainActivity.event_date.clear();
//                MainActivity.event.clear();
                home2.adapter.notifyDataSetChanged();



            }
        });


        return view;
    }
public void evn(String dt){

        if(dt.equals("9-1") || dt.equals("9-2")|| dt.equals("9-3"))
        {
            home2.event.add("Eid ul fitr");
            home2.event_date.add("عید الفطر");
        }



    else if(dt.equals("0-10"))
          {
              home2.event.add("Ashura");
              home2.event_date.add("آشور");
          }

        else if(dt.equals("6-27"))
        {
            home2.event.add("Shab e Miraj");
            home2.event_date.add("شب ای میرج");
        }
        else if(dt.equals("7-15"))
        {
            home2.event.add("Shab e Barat");
            home2.event_date.add("شب ای برات");
        }
        else if(dt.equals("8-1"))
        {
            home2.event.add("1st Ramzan");
            home2.event_date.add("رمضان");
        }
        else if(dt.equals("11-9"))
        {
            home2.event.add("Hajj");
            home2.event_date.add("حج");
        }

        else if(dt.equals("11-10") || dt.equals("11-11")|| dt.equals("11-12"))
        {
            home2.event.add("Eid ul Azha");
            home2.event_date.add("عيد الأضحى");
        }




        }

}



