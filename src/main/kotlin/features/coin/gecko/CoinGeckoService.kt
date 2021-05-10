package features.coin.gecko

import core.extensions.methodName
import core.network.BaseService
import core.network.NetworkResponseEventListener
import core.network.ServiceBuilder
import okhttp3.EventListener

class CoinGeckoService : BaseService() {

    private val apiService by lazy {
        ServiceBuilder.buildService(CoinGeckoApiService::class.java, "https://api.coingecko.com/api/v3/")
    }

    init {
    }

    private var listener: Listener? = null


    private fun setListener(l: EventListener) {
        when (l) {
            is Listener -> {listener = l}
        }
    }
    // TODO: see this project we can leverage: https://github.com/DrewCarlson/CoinGecko-Kotlin

    fun ping() {
        println({}.methodName)
        val call = apiService.ping()
        doApiCall({}.methodName, call, listener, { response ->
            println("success")
            listener?.onComplete()
        }, {
            println("failure")
        })
    }

    interface Listener : NetworkResponseEventListener {
        fun onComplete()
        fun onError()
    }
}