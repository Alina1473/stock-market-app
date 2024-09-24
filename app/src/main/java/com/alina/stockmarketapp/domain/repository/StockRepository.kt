package com.alina.stockmarketapp.domain.repository

import com.alina.stockmarketapp.domain.model.CompanyInfo
import com.alina.stockmarketapp.domain.model.CompanyListing
import com.alina.stockmarketapp.domain.model.IntradayInfo
import com.alina.stockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}