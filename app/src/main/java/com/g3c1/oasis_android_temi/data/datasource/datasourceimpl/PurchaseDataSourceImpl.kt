package com.g3c1.oasis_android_temi.data.datasource.datasourceimpl

import com.g3c1.oasis_android_temi.data.datasource.datasource.PurchaseDataSource
import com.g3c1.oasis_android_temi.data.remote.PurchaseAPI
import com.g3c1.oasis_android_temi.data.remote.util.ApiState
import com.g3c1.oasis_android_temi.di.TemiApplication
import com.g3c1.oasis_android_temi.dto.purchase.OrderInfoDTO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class PurchaseDataSourceImpl @Inject constructor(
    private val api: PurchaseAPI
) : PurchaseDataSource {
    override suspend fun getOrderList(): Flow<ApiState<List<OrderInfoDTO>>> {
        val searialNumber =
            TemiApplication.getInstance().getSearialNumberManager().searialNumber.first()
        return flow {
            try {
                val response = api.getOrderList(searialNumber.toLong())
                if (response.isSuccessful)
                    response.body()?.run { emit(ApiState.Success(this)) }
                else {
                    try {
                        emit(ApiState.Error(response.errorBody()!!.string()))
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

    override suspend fun moveTemi(seatId: Long): Flow<ApiState<Void>> {
        return flow {
            try {
                val response = api.moveTemi(seatId = seatId)
                if (response.isSuccessful)
                    response.body()?.run { emit(ApiState.Success(this)) }
                else {
                    try {
                        emit(ApiState.Error(response.errorBody()!!.string()))
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}