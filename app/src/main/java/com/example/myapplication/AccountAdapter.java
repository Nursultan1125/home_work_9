package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AccountAdapter extends ArrayAdapter<Account> {
    ArrayList<Account> notes;

    public AccountAdapter(ArrayList<Account> data, @NonNull Context context) {
        super(context, R.layout.account_list_item, data);
    }

    private static class ViewHolder{
        TextView nameView;
        TextView calledDateView;
        ImageView imageView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Account account = getItem(position);
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.account_list_item, parent, false);
            viewHolder.nameView = convertView.findViewById(R.id.account_name);
            viewHolder.calledDateView = convertView.findViewById(R.id.account_call_date);
            viewHolder.imageView = convertView.findViewById(R.id.account_image);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        assert account != null;
        viewHolder.nameView.setText(account.getName());
        viewHolder.calledDateView.setText(account.getCalledDate());
        viewHolder.imageView.setImageResource(account.getImageId());

        return convertView;
    }
}
