package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class RecentAdapter  extends ArrayAdapter<Account> {
    public RecentAdapter(ArrayList<Account> data, @NonNull Context context) {
        super(context, R.layout.recent_list_item, data);
    }
    private static class ViewHolder{
        TextView nameView;
        TextView calledDateView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Account account = getItem(position);
        RecentAdapter.ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new RecentAdapter.ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.recent_list_item, parent, false);
            viewHolder.nameView = convertView.findViewById(R.id.account_name_recent);
            viewHolder.calledDateView = convertView.findViewById(R.id.account_call_date_recent);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (RecentAdapter.ViewHolder)convertView.getTag();
        }

        assert account != null;
        viewHolder.nameView.setText(account.getName());
        viewHolder.calledDateView.setText(account.getCalledDate());

        return convertView;
    }
}
