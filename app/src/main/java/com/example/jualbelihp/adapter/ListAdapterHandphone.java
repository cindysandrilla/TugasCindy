package com.example.jualbelihp.adapter;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.Filterable;

import com.example.jualbelihp.model.Handphone;

import java.util.List;
import java.util.logging.Handler;

import id.my.donny.jualbelihp.model.Handphone;

public class ListAdapterHandphone extends BaseAdapter implements Filterable {
    private Context context;
    private List<Handler>list, filterd;

    public ListAdapterHandphone(context, List<Handphone> list){
        this.context = context;
        this.list = list;
        this.filterd = this.list;
    }
    @Override
    public int getCount(){
        return filterd.size();
    }
    @Override
    


}
