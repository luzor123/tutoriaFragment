package com.example.tutoriafragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_second,container, false)

        val txt2=view.findViewById<TextView>(R.id.edt2)

        val data = arguments

        txt2.text ="Hello "+ data?.getString("text")+ "!!"

        return view
    }
}