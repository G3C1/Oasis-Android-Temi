package com.g3c1.oasis_android_temi.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.g3c1.oasis_android_temi.data.remote.util.ApiState
import com.g3c1.oasis_android_temi.domain.usecase.purchase.GetOrderListUseCase
import com.g3c1.oasis_android_temi.dto.purchase.OrderInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getOrderListUseCase: GetOrderListUseCase
) : ViewModel() {
    val mOrderDataList: MutableStateFlow<ApiState<List<OrderInfo>>> =
        MutableStateFlow(ApiState.Loading())

    fun getOrderList() = viewModelScope.launch {
        mOrderDataList.value = ApiState.Loading()
        getOrderListUseCase.getOrderList().catch { error ->
            mOrderDataList.value = ApiState.Error(error.message.toString())
        }.collect { value ->
            mOrderDataList.value = value
        }
    }
}