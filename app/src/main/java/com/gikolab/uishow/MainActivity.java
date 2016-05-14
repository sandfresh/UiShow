package com.gikolab.uishow;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;

public class MainActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
//
    }


}
