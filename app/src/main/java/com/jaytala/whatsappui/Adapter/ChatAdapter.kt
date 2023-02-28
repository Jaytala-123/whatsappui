package com.jaytala.whatsappui.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jaytala.whatsappui.R
import com.jaytala.whatsappui.model.ModelData

class ChatAdapter(names: ArrayList<ModelData>) : RecyclerView.Adapter<ChatAdapter.ChatHolder>() {

    var names = names

    class ChatHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var nameItem = itemView.findViewById<TextView>(R.id.namesItem)
        var profile = itemView.findViewById<ImageView>(R.id.profile)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatHolder {
        return ChatHolder (LayoutInflater.from(parent.context).inflate(R.layout.chat_item,parent,false))

    }

    override fun onBindViewHolder(holder: ChatHolder, position: Int) {
            holder.nameItem.text =names.get(position).name
            holder.profile.setImageResource (names.get(position).img)

    }

    override fun getItemCount(): Int {
            return names.size
    }
}