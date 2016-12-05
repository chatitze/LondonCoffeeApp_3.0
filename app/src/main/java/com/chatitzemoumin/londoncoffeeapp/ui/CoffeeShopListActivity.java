package com.chatitzemoumin.londoncoffeeapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.chatitzemoumin.londoncoffeeapp.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Chatitze Moumin on 17/11/14.
 */

public class CoffeeShopListActivity extends AppCompatActivity {

    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop_list);

        populateCoffeeList();
    }

    private void populateCoffeeList() {

        String[] coffeeShopArray = {
                "Grounded",
                "Ozone",
                "Shoreditch Grind",
                "Trade",
                "Look mum no hands!",
                "Rapha Cycle",
                "Attendant"
        };

        List<String> coffeeShopList = new ArrayList<String>(Arrays.asList(coffeeShopArray));

        mAdapter = new ArrayAdapter<String>(this, R.layout.list_item_coffee_shop, R.id.list_item_coffeeshop_textview, coffeeShopList);

        ListView mListView = (ListView) findViewById(R.id.listview_coffeeshop);

        mListView.setAdapter(mAdapter);

    }
}
