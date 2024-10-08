package com.alina.stockmarketapp.di

import com.alina.stockmarketapp.data.csv.CSVParser
import com.alina.stockmarketapp.data.csv.CompanyListingsParser
import com.alina.stockmarketapp.data.csv.IntradayInfoParser
import com.alina.stockmarketapp.data.repository.StockRepositoryImpl
import com.alina.stockmarketapp.domain.model.CompanyListing
import com.alina.stockmarketapp.domain.model.IntradayInfo
import com.alina.stockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepository: StockRepositoryImpl
    ): StockRepository
}