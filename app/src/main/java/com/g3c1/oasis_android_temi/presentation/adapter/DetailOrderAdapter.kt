package com.g3c1.oasis_android_temi.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.g3c1.oasis_android_temi.databinding.OrderListItemItemBinding
import com.g3c1.oasis_android_temi.dto.purchase.FoodInfoDTO

class DetailOrderAdapter :
    ListAdapter<FoodInfoDTO, DetailOrderAdapter.DetailOrderViewHolder>(diffCallBack) {
    class DetailOrderViewHolder(private val binding: OrderListItemItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: FoodInfoDTO) {
            binding.foodName.text = data.foodName
            binding.foodCount.text = data.foodCount.toString()
            binding.foodPrice.text = data.price.toString()
            Glide.with(itemView.context)
                .load(data.foodImg)
                .into(binding.foodImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailOrderViewHolder {
        return DetailOrderViewHolder(
            OrderListItemItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: DetailOrderViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        val diffCallBack = object : DiffUtil.ItemCallback<FoodInfoDTO>() {
            override fun areItemsTheSame(
                oldItem: FoodInfoDTO,
                newItem: FoodInfoDTO
            ): Boolean {
                return oldItem == newItem
            }
            override fun areContentsTheSame(
                oldItem: FoodInfoDTO,
                newItem: FoodInfoDTO
            ): Boolean {
                return oldItem.foodName == newItem.foodName && oldItem.foodCount == newItem.foodCount
            }
        }
    }
}