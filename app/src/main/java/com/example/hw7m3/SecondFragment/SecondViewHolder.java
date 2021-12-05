package com.example.hw7m3.SecondFragment;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw7m3.databinding.SecondItemRecyclerBinding;

public class SecondViewHolder extends RecyclerView.ViewHolder{
    private SecondItemRecyclerBinding binding;

    public SecondViewHolder(@NonNull SecondItemRecyclerBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }

    public void onBind(SecondItemModel model) {
        binding.ivProfileAct.setImageResource(model.getProfile());
        binding.ivPostAct.setImageResource(model.getPost());
        binding.tvTitleAct.setText(model.getTitle());
        binding.tvTimeAct.setText(model.getTime());
    }
}
