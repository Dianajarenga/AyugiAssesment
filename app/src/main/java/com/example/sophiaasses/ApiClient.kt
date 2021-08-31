package com.example.sophiaasses

object ApiClient {
    var retrofit= Retrofit.Buildholder()
        .baseUrl("http://13.244.243.129/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildApiClient(ApiInterface: Class<T>) : T{
        return retrofit.create(ApiInterface)
    }
}