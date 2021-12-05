package com.example.hw7m3.MainFragment;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw7m3.databinding.ItemRecyclerBinding;

public class ViewHolder extends RecyclerView.ViewHolder {
    private ItemRecyclerBinding binding;

    public ViewHolder(@NonNull ItemRecyclerBinding itemView) {
        super(itemView.getRoot());
        binding = itemView;
    }

    public void onBind(ItemModel model) {
        binding.tvTitle.setText(model.getTitle());
        binding.tvDate.setText(model.getDate());
        binding.ivPost.setImageResource(model.getImage());
    }
}
