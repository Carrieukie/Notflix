package com.vickikbt.repository.di

import com.vickikbt.domain.repository.*
import com.vickikbt.repository.data_source.*
import org.koin.dsl.module

val repositoryModule = module {

    single<MovieDetailsRepository> {
        MovieDetailsRepositoryImpl(
            apiService = get(),
            appDatabase = get()
        )
    }

    single<NowPlayingMoviesRepository> {
        NowPlayingMoviesRepositoryImpl(
            apiService = get(),
            appDatabase = get(),
            timeDatastore = get()
        )
    }

    single<PopularMoviesRepository> {
        PopularMoviesRepositoryImpl(
            apiService = get(),
            appDatabase = get(),
            timeDatastore = get()
        )
    }

    single<TrendingMoviesRepository> {
        TrendingMoviesRepositoryImpl(
            apiService = get(),
            appDatabase = get(),
            timeDatastore = get()
        )
    }

    single<UpcomingMoviesRepository> {
        UpcomingMoviesMoviesRepositoryImpl(
            apiService = get(),
            appDatabase = get(),
            timeDatastore = get()
        )
    }

    single<FavoritesRepository> {
        FavoriteMovieRepositoryImpl(appDatabase = get())
    }


}