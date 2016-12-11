package com.smoowy.realmtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // Version 5

    Realm mRealm;
    RealmResults<MonieDB> results;
    Button mMostrar, mBorrar, mAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRealm = Realm.getDefaultInstance();
        results = mRealm.where(MonieDB.class).equalTo("id",1)
                .or()
                .equalTo("id",3)
                .findAll();
        mMostrar = (Button) findViewById(R.id.mostrar);
        mBorrar = (Button) findViewById(R.id.borrar);
        mAgregar = (Button) findViewById(R.id.agregar);
        mMostrar.setOnClickListener(this);
        mBorrar.setOnClickListener(this);
        mAgregar.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int id = view.getId();


        if (id == R.id.agregar) {
            mRealm.executeTransactionAsync(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                    MonieDB data = realm.createObject(MonieDB.class);
                    data.setId(1);
                    data.setResultado("Primero");

                }
            });

        } else if (id == R.id.mostrar) {


            for (int i = 0; i < results.size(); i++) {

                String[] listaDinero = results.get(i).getDineroLetra().split(" ");

                    for (String s : listaDinero)
                        Log.d("Consola", s);


            }


        }

        else if (id == R.id.borrar) {

            mRealm.executeTransaction(new Realm.Transaction() {
                @Override
                public void execute(Realm realm) {
                   results.deleteAllFromRealm();
                }
            });

        }
    }
}
