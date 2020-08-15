package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class AccountListFragment extends Fragment {
    AccountAdapter accountAdapter;
    ArrayList<Account> accounts = new ArrayList<>();
    ListView listView;

    public AccountListFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contextView = inflater.inflate(R.layout.fragment_account_list, container, false);
        listView = contextView.findViewById(R.id.account_list_view);
        accounts.add(new Account("Log Log.", R.drawable.user1, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user2, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user3, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user4, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accounts.add(new Account("Log Log.", R.drawable.user5, "Work, 2hr ago"));
        accountAdapter = new AccountAdapter(accounts, Objects.requireNonNull(getContext()));
        listView.setAdapter(accountAdapter);
        return contextView;
    }
}