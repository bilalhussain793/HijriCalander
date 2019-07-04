package com.img.hijricalander;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.eltohamy.materialhijricalendarview.MaterialHijriCalendarView;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class home2 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
LinearLayout linearLayout,linearLayout2,namaz,ayyat;

ImageView imageView;

    MaterialHijriCalendarView widget;
    String[] months={"مُحَرَّم","صَفَر","رَبِيع ٱلْأَوَّل","ربيع الثاني","جُمَادَىٰ ٱلْأُولَیٰ","جُمَادَىٰ ٱلْآخِرَة","رَجَب","شَعْبَان","رَمَضَان"
            ,"شَوَّال","ذی ٱلْقَعْدَة","ذُی ٱلْحِجَّة"};
    String[] days30={"١","٢","٣","٤","٥","٦","٧","٨","٩","١٠","١١","١٢","١٣","١٤","١٥",
            "١٦","١٧","١٨","١٩","٢٥","٢١","٢٢","٢٣","٢٤","٢٥","٢٦","٢٧","٢٨","٢٩","٣٥"};
    String[] days29={"١","٢","٣","٤","٥","٦","٧","٨","٩","١٠","١١","١٢","١٣","١٤","١٥",
            "١٦","١٧","١٨","١٩","٢٥","٢١","٢٢","٢٣","٢٤","٢٥","٢٦","٢٧","٢٨","٢٩"};
    String[] udays={" جمعرات","جمعہ","ہفتہ","اتوار","پیر","منگل","بدھ"};

    String[] mobileArray = {
            "FAJAR                                                          3:24 AM",
            "DHUHUR                                                    12:07 PM",
            "ASR                                                              5:03 PM",
            "MAGHRIB                                                   7:11 PM",
            "ISHA                                                        " +
                    "    8:50 PM"};
    GridView gridView,gv1;
    TextView textView,tvvb;
    public static ListView listView;
    public static ArrayList<String> event=new ArrayList<String>();
    public static ArrayList<String> event_date=new ArrayList<String>();
    public static EventsAdapter adapter;
    MaterialHijriCalendarView calendarView;
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        linearLayout=findViewById(R.id.ln);
        linearLayout2=findViewById(R.id.ln2);
        imageView=findViewById(R.id.image3);
        textView=findViewById(R.id.tvv);

        tvvb=findViewById(R.id.stvv);
ayyat=findViewById(R.id.ayyatlay);

ayyat.setVisibility(View.GONE);
linearLayout.setVisibility(View.GONE);
namaz=findViewById(R.id.namazlay);
namaz.setVisibility(View.GONE);










        String date2 = new SimpleDateFormat("dd", Locale.getDefault()).format(new Date());
        //Toast.makeText(this, ""+date2, Toast.LENGTH_SHORT).show();
        if(date2.equals("01"))
        {
            imageView.setImageResource(R.drawable.a);
        }
        if(date2.equals("01"))
        {
            imageView.setImageResource(R.drawable.d);
        }  if(date2.equals("02"))
        {
            imageView.setImageResource(R.drawable.s);
        }  if(date2.equals("03"))
        {
            imageView.setImageResource(R.drawable.f);
        }  if(date2.equals("04"))
        {
            imageView.setImageResource(R.drawable.g);
        }  if(date2.equals("05"))
        {
            imageView.setImageResource(R.drawable.kkk);
        }  if(date2.equals("06"))
        {
            imageView.setImageResource(R.drawable.u);
        }  if(date2.equals("07"))
        {
            imageView.setImageResource(R.drawable.a);
        }  if(date2.equals("08"))
        {
            imageView.setImageResource(R.drawable.d);
        }  if(date2.equals("09"))
        {
            imageView.setImageResource(R.drawable.s);
        }  if(date2.equals("10"))
        {
            imageView.setImageResource(R.drawable.f);
        }  if(date2.equals("11"))
        {
            imageView.setImageResource(R.drawable.u);
        }  if(date2.equals("12"))
        {
            imageView.setImageResource(R.drawable.kkk);
        }  if(date2.equals("13"))
        {
            imageView.setImageResource(R.drawable.a);
        }  if(date2.equals("14"))
        {
            imageView.setImageResource(R.drawable.d);
        }  if(date2.equals("15"))
        {
            imageView.setImageResource(R.drawable.s);
        }  if(date2.equals("16"))
        {
            imageView.setImageResource(R.drawable.f);
        }  if(date2.equals("17"))
        {
            imageView.setImageResource(R.drawable.g);
        }  if(date2.equals("18"))
        {
            imageView.setImageResource(R.drawable.h);
        }  if(date2.equals("19"))
        {
            imageView.setImageResource(R.drawable.a);
        }  if(date2.equals("20"))
        {
            imageView.setImageResource(R.drawable.d);
        }  if(date2.equals("21"))
        {
            imageView.setImageResource(R.drawable.s);
        }  if(date2.equals("22"))
        {
            imageView.setImageResource(R.drawable.f);
        }  if(date2.equals("23"))
        {
            imageView.setImageResource(R.drawable.g);
        }  if(date2.equals("24"))
        {
            imageView.setImageResource(R.drawable.h);
        }  if(date2.equals("25"))
        {
            imageView.setImageResource(R.drawable.u);
        }  if(date2.equals("26"))
        {
            imageView.setImageResource(R.drawable.kkk);
        }  if(date2.equals("27"))
        {
            imageView.setImageResource(R.drawable.f);
        }  if(date2.equals("28"))
        {
            imageView.setImageResource(R.drawable.s);
        }  if(date2.equals("29"))
        {
            imageView.setImageResource(R.drawable.a);
        }  if(date2.equals("30"))
        {
            imageView.setImageResource(R.drawable.f);
        }
//imageView.setImageResource(R.drawable.a);


////
        ArrayAdapter adapter3= new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, mobileArray);

        ListView listView2 = (ListView) findViewById(R.id.list2);
        listView2.setAdapter(adapter3);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(home2.this, ""+mobileArray[i], Toast.LENGTH_SHORT).show();

            }
        });



        Date c = Calendar.getInstance().getTime();
        System.out.println("Current time => " + c);

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String formattedDate = df.format(c);

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-uuuu");
        LocalDate gregorianDate = LocalDate.parse(formattedDate, dateFormatter);
        HijrahDate islamicDate = HijrahDate.from(gregorianDate);
        //  Toast.makeText(this, ""+islamicDate, Toast.LENGTH_LONG).show();
        String h_date=""+islamicDate;
        textView.setText(h_date+"");
        TextView tvs=findViewById(R.id.stv);

        int length = h_date.length();
        if (length >= 6) {

            String dd=""+h_date.charAt(length - 2)+""+ h_date.charAt(length - 1);
            String mm=""+h_date.charAt(length - 5)+""+ h_date.charAt(length - 4);
            String yr=""+h_date.charAt(length - 10)+""+ h_date.charAt(length - 9)+""+h_date.charAt(length - 8)+""+ h_date.charAt(length - 7);
            tvs.setText(days30[Integer.parseInt(dd)-1]+"  "+months[Integer.parseInt(mm)-1]+"  "+yr);
            tvvb.setText(days30[Integer.parseInt(dd)-1]+"  "+months[Integer.parseInt(mm)-1]+"  "+yr);
            textView.setText(months[Integer.parseInt(mm)-1]);
        }
        else{
            System.out.println("Invalid String");
        }

        BlankFragment blankFragment=new BlankFragment();
        // create a FragmentManager
        FragmentManager fm = getFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.framelayout, blankFragment);
        fragmentTransaction.commit(); // save the changes


       event_date.clear();
        event.clear();

        adapter=new EventsAdapter(home2.this,event,event_date);
        listView=findViewById(R.id.lsv);
















        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            linearLayout.setVisibility(View.VISIBLE);
            linearLayout2.setVisibility(View.GONE);
            namaz.setVisibility(View.GONE);
            ayyat.setVisibility(View.GONE);
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {
            namaz.setVisibility(View.VISIBLE);
            linearLayout.setVisibility(View.GONE);
            linearLayout2.setVisibility(View.GONE);
            ayyat.setVisibility(View.GONE);
        } else if (id == R.id.nav_slideshow) {
            namaz.setVisibility(View.GONE);
            linearLayout.setVisibility(View.GONE);
            linearLayout2.setVisibility(View.GONE);
            ayyat.setVisibility(View.VISIBLE);
        }  else if (id == R.id.nav_share) {


            startActivity(new Intent(home2.this,aboutt.class));


        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
