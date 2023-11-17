package com.example.tutoriafragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View?
    {
            // Inflate the layout for this fragment
            val view=inflater.inflate(R.layout.fragment_first, container,false)

            val btn1=view.findViewById<Button>(R.id.btn1)
            val edt1=view.findViewById<EditText>(R.id.edt1)

            val secondFragment= SecondFragment()

            btn1.setOnClickListener{

                val bundle = Bundle()

                bundle.putString("text",edt1.text.toString())

                secondFragment.arguments=bundle

                parentFragmentManager.beginTransaction().apply {
                    replace(R.id.frame, secondFragment)
                        .commit()
                }
            }
            return view
    }
}