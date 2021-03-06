package com.example.motivationalquotes.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.motivationalquotes.R

class MainFragment : Fragment(), View.OnClickListener {

    var navController : NavController? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.daily_quote_btn).setOnClickListener(this)
        view.findViewById<Button>(R.id.quote_list_btn).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.daily_quote_btn -> navController!!.navigate(R.id.action_mainFragment_to_dailyQuoteFragment)
            R.id.quote_list_btn -> navController!!.navigate(R.id.action_mainFragment_to_quoteListFragment)
        }
    }
}

