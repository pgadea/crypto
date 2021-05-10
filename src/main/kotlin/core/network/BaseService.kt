package core.network

import okhttp3.EventListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response



abstract class BaseService {

    fun <T>doApiCall(methodName: String, call: Call<T>, listener: NetworkResponseEventListener?, onResponse: (response: Response<T>) -> Unit?, onFailure: () -> Unit?) {
        call.enqueue(object : Callback<T> {

            override fun onResponse(call: Call<T>, response: Response<T>) {
                println("$methodName, $call, $response")
                if (response.isSuccessful) {
                    try {
                        onResponse(response)
                    } catch (e: Exception) {

                    }
                } else {
                }
            }

            override fun onFailure(call: Call<T>, t: Throwable) {
                try {
                    onFailure()
                } catch (e: Exception) {
                }
            }
        })
    }
}