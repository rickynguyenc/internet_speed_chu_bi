package com.rickynguyenc.internet_speed_chu_bi

interface TestListener {

    fun onComplete(transferRate: Double)

    fun onError(speedTestError: String, errorMessage: String)

    fun onProgress(percent: Double, transferRate: Double)

}

