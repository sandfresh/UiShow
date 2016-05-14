package com.gikolab.uishow;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends Activity
{
    ListView mDrawerList;
    DrawerLayout mDrawerLayout;
    MenuListAdapter mMenuAdapter;
    ActionBarDrawerToggle mDrawerToggle;


    private CharSequence mDrawerTitle;
    private CharSequence mTitle;
    String[] title, subtitle;
    int[] icon;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.drawer_main);

        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        mTitle = mDrawerTitle = getTitle();
        title = new String[] {"Android UI Design", "Animations", "Arc Menu", "Chart", "Drag & Drop", "ListView", "Magical TextView", "Map", "Paint", "Picker", "PopUp", "Text 2 Speech", "ViewFlow", "Wheel"};
        subtitle = new String[] {"Home", "Animation using XML", "Example on Arc Menu", "Example on Chart", "Example on Drag & Drop", "Example on ListView", "Example on Magical TextView", "Example on Map", "Example on Paint", "Example on Picker", "Example on PopUp", "Example on Text 2 Speech", "Example on ViewFlow", "Example on Wheel"};
        icon = new int[] {R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample, R.mipmap.sample};

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.listview_drawer);

      //  mDrawerLayout.setDrawerShadow(R.mipmap.drawer_shadow, GravityCompat.START);
        mMenuAdapter = new MenuListAdapter(MainActivity.this, title, subtitle, icon);
        mDrawerList.setAdapter(mMenuAdapter);

        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.mipmap.ic_drawer, R.string.drawer_open, R.string.drawer_close)
        {
            public void onDrawerClosed(View view)
            {
                super.onDrawerClosed(view);
            }

            public void onDrawerOpened(View drawerView)
            {
                super.onDrawerOpened(drawerView);
            }
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null)
        {
            selectItem(0);
        }
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position,	long id)
        {
            selectItem(position);
        }
    }

    private void selectItem(int position)
    {
//        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//        switch (position)
//        {
//            case 0:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, home);
//                break;
//
//            case 1:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, animation);
//                break;
//
//            case 2:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, arc);
//                break;
//
//            case 3:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, chart);
//                break;
//
//            case 4:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, dragdrop);
//                break;
//
//            case 5:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, list);
//                break;
//
//            case 6:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, magic);
//                break;
//
//            case 7:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, map);
//                break;
//
//            case 8:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, paint);
//                break;
//
//            case 9:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, picker);
//                break;
//
//            case 10:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, popup);
//                break;
//
//            case 11:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, text2speech);
//                break;
//
//            case 12:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, viewflow);
//                break;
//
//            case 13:
//                setTitle(title[position]);
//                ft.replace(R.id.content_frame, wheel);
//                break;
//        }
//        ft.commit();
//        mDrawerList.setItemChecked(position, true);
//        setTitle(title[position]);
//        mDrawerLayout.closeDrawer(mDrawerList);
    }

}
