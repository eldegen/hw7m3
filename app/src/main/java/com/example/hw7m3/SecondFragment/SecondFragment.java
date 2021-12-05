package com.example.hw7m3.SecondFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7m3.MainFragment.RecyclerAdapter;
import com.example.hw7m3.R;
import com.example.hw7m3.databinding.FragmentMainBinding;
import com.example.hw7m3.databinding.FragmentSecondBinding;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private FragmentSecondBinding binding;
    private SecondRecyclerAdapter recyclerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(LayoutInflater.from(requireContext()));
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createItems();
    }

    private void createItems() {
        ArrayList<SecondItemModel> list = new ArrayList<>();

        list.add(new SecondItemModel("karennne liked your photo.", "1h", R.drawable.img_avatar_karennne, R.drawable.img_post_act));
        list.add(new SecondItemModel("karennne liked your photo.", "1h", R.drawable.img_avatar_karennne, R.drawable.img_post_act));
        list.add(new SecondItemModel("karennne liked your photo.", "1h", R.drawable.img_avatar_karennne, R.drawable.img_post_act));
        list.add(new SecondItemModel("karennne liked your photo.", "1h", R.drawable.img_avatar_karennne, R.drawable.img_post_act));

        recyclerAdapter = new SecondRecyclerAdapter(list);
        binding.recycler.setAdapter(recyclerAdapter);
    }
}