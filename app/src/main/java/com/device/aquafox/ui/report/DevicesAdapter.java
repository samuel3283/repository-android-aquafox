package com.device.aquafox.ui.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.device.aquafox.R;
import com.device.aquafox.data.Devices;
import com.device.aquafox.data.FilterReport;

import java.util.List;


public class DevicesAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflter;
    List<Devices> services;
    int resource;
    public DevicesAdapter(Context applicationContext, int resource, List<Devices> services) {
        this.context = context;
        this.services = services;
        this.resource = resource;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return this.services.size();
    }

    @Override
    public Object getItem(int i) {
        return this.services.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.listtado_servicios, null);

        TextView title = (TextView) view.findViewById(R.id.title);
        String alias = this.services.get(i).getAlias();
        title.setText(alias);
        return view;
    }

}