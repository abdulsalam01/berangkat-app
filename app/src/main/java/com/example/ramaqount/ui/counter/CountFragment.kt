package com.example.ramaqount.ui.counter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ramaqount.R

class CountFragment : Fragment() {

    companion object {
        fun newInstance() = CountFragment()
    }

    private lateinit var viewModel: CountViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.count_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CountViewModel::class.java)
        // TODO: Use the ViewModel
    }

}