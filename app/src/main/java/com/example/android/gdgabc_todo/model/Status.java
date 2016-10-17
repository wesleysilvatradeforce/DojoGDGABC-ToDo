package com.example.android.gdgabc_todo.model;

import android.content.Context;

import com.example.android.gdgabc_todo.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wesleysilva on 10/15/16.
 */

public class Status {

    Map<String, Integer> resourceColor;

    public Status(Context context) {
        this.resourceColor = new HashMap<>();

        String[] titulos = context.getResources().getStringArray(R.array.status_titulo);
        int[] cores = context.getResources().getIntArray(R.array.status_color);

        for (int i = 0; i < titulos.length; i++) {

            this.resourceColor.put(titulos[i], cores[i]);
        }
    }

    public int color(String color ) {
        return this.resourceColor.get(color);
    }
}
