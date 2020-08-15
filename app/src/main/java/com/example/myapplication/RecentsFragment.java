package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class RecentsFragment extends Fragment {
    ArrayList<Account> accounts = new ArrayList<>();
    ListView listView;
    RecentAdapter recentAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contextView = inflater.inflate(R.layout.fragment_recents, container, false);
        listView = contextView.findViewById(R.id.recent_list_view);
        accounts.add(new Account("Log Log.", R.drawable.user1, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user2, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user3, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user4, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        recentAdapter = new RecentAdapter(accounts, Objects.requireNonNull(getContext()));
        listView.setAdapter(recentAdapter);

        return contextView;

    }
}