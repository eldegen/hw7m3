package com.example.hw7m3.MainFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7m3.R;
import com.example.hw7m3.databinding.FragmentMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    private RecyclerAdapter recyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createItems();
    }

    private void createItems() {
        ArrayList<ItemModel> list = new ArrayList<>();

        list.add(new ItemModel("joshua_l The game in Japan was amazing and I want to share some photos",
                "September 19", R.drawable.img_first_post));
        list.add(new ItemModel("joshua_l The game in Japan was amazing and I want to share some photos",
                "September 19", R.drawable.img_first_post));

        recyclerAdapter = new RecyclerAdapter(list);
        binding.recycler.setAdapter(recyclerAdapter);
    }
}