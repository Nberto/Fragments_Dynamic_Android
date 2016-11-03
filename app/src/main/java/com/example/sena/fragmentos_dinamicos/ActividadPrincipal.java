package com.example.sena.fragmentos_dinamicos;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActividadPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividadprincipal);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager frgnew=getSupportFragmentManager();
        FragmentTransaction frgtnew=frgnew.beginTransaction();

        switch (item.getItemId()){

            case R.id.fragment1:
                Fragmento1 frg1= new Fragmento1();
                frgtnew.replace(android.R.id.content,frg1);
                frgtnew.commit();
                break;
            case R.id.fragment2:
                Fragmento2 frg2= new Fragmento2();
                frgtnew.replace(android.R.id.content, frg2);
                frgtnew.commit();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
