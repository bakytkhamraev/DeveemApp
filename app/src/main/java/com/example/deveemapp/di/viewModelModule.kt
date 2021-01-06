package com.example.deveemapp.di

import com.example.deveemapp.ui.fragments.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var viewModelModule = module {
    viewModel { HomeViewModel() }
}