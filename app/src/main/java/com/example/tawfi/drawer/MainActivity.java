package com.example.tawfi.drawer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    myAdapter adapter = null;
    ArrayList<titre> listOfFoods = new ArrayList<titre>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        listOfFoods.add(new titre("coffe", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.a));
        listOfFoods.add(new titre("macdo", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.b));
        listOfFoods.add(new titre("coffe", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.c));
        listOfFoods.add(new titre("coffe", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.d));
        listOfFoods.add(new titre("coffe", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.e));
        listOfFoods.add(new titre("coffe", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.f));
        listOfFoods.add(new titre("coffe", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.g));
        listOfFoods.add(new titre("coffe", "Le café est une boisson énergisante psychotrope stimulante, obtenue à partir des graines torréfiées de diverses variétés de caféier, de l'arbuste caféier, du genre Coffea. Il fait partie des trois principales boissons contenant de la caféine les plus consommées dans le monde, avec le thé et le maté", R.drawable.h));
        adapter=new myAdapter(this, listOfFoods);

        GridView lvFood = (GridView) findViewById(R.id.gv);
        lvFood.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item1) {
            finish();
            return true;
        }
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

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {
            Intent intent= new Intent(this,Parametres.class);
            startActivity(intent);



        } else if (id == R.id.moncompte) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

class myAdapter extends BaseAdapter {

    Context context;
    List<titre> list;
    int resource;
    public myAdapter(Context context, List list) {
        this.context = context;
        this.list=list;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );

        convertView = inflater.inflate(R.layout.titre,null);
        TextView title=(TextView) convertView.findViewById(R.id.title);
        //TextView description=(TextView) convertView.findViewById(R.id.description);
        ImageView imageView=(ImageView) convertView.findViewById(R.id.imageView);

        title.setText(list.get(position).getName());
        //description.setText(list.get(position).getDes());
        imageView.setImageResource(list.get(position).getImage());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailsActivity.class);
                intent.putExtra("title",list.get(position).getName());
                intent.putExtra("des",list.get(position).getDes());
                intent.putExtra("image",list.get(position).getImage());
                context.startActivity(intent);
            }
        });



        return convertView;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}


