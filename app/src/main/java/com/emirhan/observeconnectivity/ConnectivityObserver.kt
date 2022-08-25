package com.emirhan.observeconnectivity

import kotlinx.coroutines.flow.Flow

interface ConnectivityObserver {

    fun observe(): Flow<Status>

    enum class Status {
        Avaible, Unavaible, Losing, Lost
    }

}