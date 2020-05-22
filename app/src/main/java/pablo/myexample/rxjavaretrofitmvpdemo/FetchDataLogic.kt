package pablo.myexample.rxjavaretrofitmvpdemo

import android.util.Log
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class FetchDataLogic {
    fun retrieve(id: String): Observable<Data>? {

        val BASE_URL = "https://jsonplaceholder.typicode.com/"

        val requestInterface = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(RequestInterface::class.java)

        return requestInterface.getTheData(id).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }

}