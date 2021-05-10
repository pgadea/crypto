package features.coin.gecko

import retrofit2.Call
import retrofit2.http.GET

interface CoinGeckoApiService {


    @GET("/ping")
    fun ping(): Call<Any>

}