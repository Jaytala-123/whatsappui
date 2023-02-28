package com.jaytala.whatsappui.fragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.jaytala.whatsappui.Adapter.ChatAdapter
import com.jaytala.whatsappui.R
import com.jaytala.whatsappui.databinding.FragmentChatBinding
import com.jaytala.whatsappui.model.ModelData

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
var list = ArrayList<ModelData>()

var names = arrayOf(
    "jay",
    "meet",
    "aniket",
    "raj",
    "jeel",
    "parth",
    "nimesh",
    "chirag",
    "bhavy",
    "harshil",
    "manish",
    "manthan",
    "dhruvi",
    "banshi",
    "vidhi",
    "bhumi",
)

var images = arrayOf(
    R.drawable.pro1,
    R.drawable.pro2,
    R.drawable.pro3,
    R.drawable.pro4,
    R.drawable.pro5,
    R.drawable.pro6,
    R.drawable.pro1,
    R.drawable.pro2,
    R.drawable.pro3,
    R.drawable.pro4,
    R.drawable.pro5,
    R.drawable.pro6,
    R.drawable.pro1,
    R.drawable.pro2,
    R.drawable.pro3,
    R.drawable.pro4,
)

class ChatFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = FragmentChatBinding.inflate(layoutInflater)

        for (x in 0..images.size-1 ) {
            var data = ModelData(names.get(x), images.get(x))
                list.add(data)
        }

        binding.chatList.layoutManager = LinearLayoutManager(context)
        binding.chatList.adapter = ChatAdapter(list)

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ChatFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}