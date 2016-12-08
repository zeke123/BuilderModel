package com.zhoujian.buildermodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    private Person manPerson;
    private Person womanPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PersonDirector mPersonDirector = new PersonDirector();

        manPerson = mPersonDirector.contructPerson(new ManBuilder());

        womanPerson =  mPersonDirector.contructPerson(new WomanBuilder());

    }
}
