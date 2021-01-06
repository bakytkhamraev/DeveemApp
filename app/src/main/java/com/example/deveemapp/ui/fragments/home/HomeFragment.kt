package com.example.deveemapp.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.deveemapp.R
import com.example.deveemapp.adapter.HomeAdapter
import com.example.deveemapp.base.BaseFragment
import com.example.deveemapp.model.ItemModel
import com.example.deveemapp.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.ext.android.inject


class HomeFragment : BaseFragment(R.layout.fragment_home), HomeAdapter.Listener {

    private val viewModel by inject<HomeViewModel>()
    private lateinit var adapter: HomeAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = HomeAdapter(this)
        recycler_view.adapter = adapter


        val staggeredGridLayoutManager =
            StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        recycler_view.setLayoutManager(staggeredGridLayoutManager)
        viewModel.getData().let { adapter.initList(it) }
    }

    override fun onItemClick(item: ItemModel) {
        DetailActivity.instanceDetail(requireActivity(), item)
    }
}